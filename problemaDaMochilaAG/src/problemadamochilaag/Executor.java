package problemadamochilaag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Executor extends Thread{
    
    private Populacao populacao = new Populacao();
    private int tamanhoDaPopulacao; // a definir via interface
    private int quantidadeDeGenes;
    private int volumeMochila; // a definir via interface
    private int pesoMochila; // a definir via interface
    private int quantidadeDeGeracoes; // a definir via interface
    private float probabilidadeDeMutacao;
    private List<Cromossomo> top3 = new ArrayList<>();
    private List<Item> itens;
    private Interface form;
    

    public Executor(String tamanhoDaPopulacao, String volumeMochila, String pesoMochila, String quantidadeDeGeracoes, List<Item> itens, Interface form) {
        this.tamanhoDaPopulacao = Integer.parseInt(tamanhoDaPopulacao);
        this.volumeMochila = Integer.parseInt(volumeMochila);
        this.pesoMochila = Integer.parseInt(pesoMochila);
        this.quantidadeDeGeracoes = Integer.parseInt(quantidadeDeGeracoes);
        this.itens = itens;
        this.form = form;
    }
    
    @Override
    public void run() {
        quantidadeDeGenes = itens.size();
        
        gerarPopulacaoInicial(itens);
        avaliacao();
        int j = 1;
        for(int i = 0; i < quantidadeDeGeracoes; i++){
            cruzar();
            avaliacao();
            form.imprimirGeracao(populacao, j++);
        }
        verificarTop3();
        form.exibirTop3(populacao.getPopulacao());
        form.setEnabledExecutar();
    }
    
    public void gerarPopulacaoInicial(List<Item> itens) {
        for (int i = 0; i < tamanhoDaPopulacao; i++) {
            Cromossomo c = new Cromossomo();
            c.setGenes(copiaGenes(itens));
            populacao.getPopulacao().add(c);// um cromossomo é igual a todos os itens do arquivo
            for (Item item : populacao.getPopulacao().get(i).getGenes()) { // para cada gene do cromossomo, decido (aleatoriamente), se ele vai ou não pra dentro da mochila
                if (getRandom() > 0.50000) { 
                    item.setSelecionado(true);
                } 
            }
        }
    }
       
    public void avaliacao() {
        int pesoPopulacao = 0;
        for (int i = 0; i < tamanhoDaPopulacao; i++) {
            int peso = 0;
            int volume = 0;
            int preco = 0;
            for (Item item : populacao.getPopulacao().get(i).getGenes()) {
                if (item.isSelecionado()) { 
                    peso += item.getPeso();
                    volume += item.getVolume();
                    preco += item.getPreco();
                } 
            }
            populacao.getPopulacao().get(i).setPreco(preco);
            
            int nota  = preco;
            if(peso > pesoMochila){
                nota -= (peso-pesoMochila)*14;
            }
            if(volume > volumeMochila){
                nota -= (volume-volumeMochila)*14;
            }
            populacao.getPopulacao().get(i).setNota(nota);
            pesoPopulacao += nota;
            
        }
        populacao.setPesoPopulacao(pesoPopulacao);
    }
    
    public void cruzar(){
        int tamNovaPopulacao = 0;
        List <Cromossomo> novaPopu = new ArrayList<>();
        while(tamNovaPopulacao < tamanhoDaPopulacao){
            List <Cromossomo> pais = new Roleta().select(populacao);
            Cromossomo filhoA = new Cromossomo();
            Cromossomo filhoB = new Cromossomo();
            int corte = (int)(quantidadeDeGenes*Math.random());
            for(int i = 0; i < quantidadeDeGenes; i++){
                if(i<corte){
                    filhoA.getGenes().add(pais.get(0).getGenes().get(i));
                    filhoB.getGenes().add(pais.get(1).getGenes().get(i));
                    continue;
                }
                filhoB.getGenes().add(pais.get(0).getGenes().get(i));
                filhoA.getGenes().add(pais.get(1).getGenes().get(i));
            }
            mutacao(filhoB.getGenes());
            mutacao(filhoA.getGenes());
            tamNovaPopulacao +=2;
            novaPopu.add(filhoA);
            novaPopu.add(filhoB);
        }
        Populacao novaPopulacao = new Populacao();
        novaPopulacao.setPopulacao(novaPopu);
        populacao = novaPopulacao;
    }
    
    public void mutacao(List<Item> itensDoCromossomo) {
        for (Item item : itensDoCromossomo) {
            if(getRandom() <= probabilidadeDeMutacao){             
               boolean estaNaMochila = false;
               if(getRandom() > 0.50000){
                   estaNaMochila = true;
               }
               item.setSelecionado(estaNaMochila);
            }
        }
   }
    
    private float getRandom() {
        return new Random().nextFloat(); 
    }

    private void verificarTop3() {
//        for(Cromossomo c : populacao.getPopulacao()){
//            Cromossomo remover = null;
//            boolean adicionar = false;
//            for (Cromossomo cromossomo : top3) {
//                adicionar = false;
//                if(cromossomo.getNota() < c.getNota()){
//                    remover = cromossomo;
//                    adicionar = true;
//                    break;
//                }
//            }
//            if(adicionar || top3.size() < 3){
//                if(remover != null){
//                    top3.remove(remover);
//                }
//                top3.add(c);
//            }
//        }
        Collections.sort(populacao.getPopulacao());
        
    }

    private List<Item> copiaGenes(List<Item> itens) {
        List<Item> copia = new ArrayList<>();
        for (Item item : itens) {
            Item i = new Item();
            i.setId(item.getId());
            i.setNome(item.getNome());
            i.setPeso(item.getPeso());
            i.setVolume(item.getVolume());
            i.setPreco(item.getPreco());
            copia.add(i);
        }
        return copia;
    }

}
