package problemadamochilaag;

import java.util.ArrayList;
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
        ativacao();
        form.imprimirGeracao(populacao, 1);
        for(int i = 0; i < quantidadeDeGeracoes; i++){
            cruzar();
            ativacao();
            form.imprimirGeracao(populacao, i+2);
        }
        verificarTop3();
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
       
    public void ativacao() {
        int pesoPopulacao = 0;
        for (int i = 0; i < tamanhoDaPopulacao; i++) {
            int peso = 0;
            int volume = 0;
            for (Item item : populacao.getPopulacao().get(i).getGenes()) {
                if (item.isSelecionado()) { 
                    peso += item.getPeso();
                    volume += item.getVolume();
                } 
            }
            int nota = Math.abs(pesoMochila - peso);
                nota += Math.abs(volumeMochila - volume);
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
            List<Item> genesFilhoA = new ArrayList<>();
            List<Item> genesFilhoB = new ArrayList<>();
            for(int i = 0; i < quantidadeDeGenes; i++){
                if(i<(quantidadeDeGenes/2)){
                    genesFilhoA.add(pais.get(0).getGenes().get(i));
                    genesFilhoB.add(pais.get(1).getGenes().get(i));
                    continue;
                }
                genesFilhoB.add(pais.get(0).getGenes().get(i));
                genesFilhoA.add(pais.get(1).getGenes().get(i));
            }
            mutacao(genesFilhoA);
            mutacao(genesFilhoB);
            tamNovaPopulacao +=2;
            filhoA.setGenes(genesFilhoA);
            filhoB.setGenes(genesFilhoB);
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
        boolean adicionar;
        for(Cromossomo c : populacao.getPopulacao()){
            adicionar = top3.size() < 3 ? true : false;
        }
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
