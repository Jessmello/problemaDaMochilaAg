package problemadamochilaag;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Executor {
    
    private Populacao populacao = new Populacao();
    private int tamanhoDaPopulacao; // a definir via interface
    private int quantidadeDeGenes;
    private int volumeMochila = 100; // a definir via interface
    private int pesoMochila = 100; // a definir via interface
    private int quantidadeDeGeracoes = 100; // a definir via interface
    
    public void executarAlgoritmo(List<Item> itens){
        gerarPopulacaoInicial(itens);
        ativacao();
        for(int i = 0; i < quantidadeDeGeracoes; i++){
            cruzar();
            ativacao();
        }
        
    }
    
    public void gerarPopulacaoInicial(List<Item> itens) {
       // List<Item> itens = new Util().getItens(arquivo);
        
        for (int i = 0; i < tamanhoDaPopulacao; i++) {
            populacao.getPopulacao().get(i).setGenes(itens); // um cromossomo é igual a todos os itens do arquivo
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
            int nota = Math.abs(pesoMochila - peso +  volumeMochila - volume);
            populacao.getPopulacao().get(i).setNota(nota);
            pesoPopulacao += nota;
        }
        populacao.setPesoPopulacao(pesoPopulacao);
    }
    
    public void cruzar(){
        int tamNovaPopulacao = 0;
        while(tamNovaPopulacao < tamanhoDaPopulacao){
            List <Cromossomo> pais = new Roleta().select(populacao);
            Cromossomo a = new Cromossomo();
            Cromossomo b = new Cromossomo();
            List<Item> listaA = new ArrayList<>();
            List<Item> listaB = new ArrayList<>();
            for(int i = 0; i < quantidadeDeGenes; i++){
                if(i<(quantidadeDeGenes/2)){
                    listaA.add(pais.get(0).getGenes().get(i));
                    listaB.add(pais.get(1).getGenes().get(i));
                    continue;
                }
                listaB.add(pais.get(0).getGenes().get(i));
                listaA.add(pais.get(1).getGenes().get(i));
            }
            tamNovaPopulacao +=2;
            a.setGenes(listaA);
            b.setGenes(listaB);
        }
    }
    
    private float getRandom() {
        return new Random().nextFloat(); 
    }

    public Populacao getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Populacao populacao) {
        this.populacao = populacao;
    }
    
    /**
     * @return the tamanhoDaPopulacao
     */
    public int getTamanhoDaPopulacao() {
        return tamanhoDaPopulacao;
    }

    /**
     * @param tamanhoDaPopulacao the tamanhoDaPopulacao to set
     */
    public void setTamanhoDaPopulacao(int tamanhoDaPopulacao) {
        this.tamanhoDaPopulacao = tamanhoDaPopulacao;
    }

    /**
     * @return the quantidadeDeGenes
     */
    public int getQuantidadeDeGenes() {
        return quantidadeDeGenes;
    }

    /**
     * @param quantidadeDeGenes the quantidadeDeGenes to set
     */
    public void setQuantidadeDeGenes(int quantidadeDeGenes) {
        this.quantidadeDeGenes = quantidadeDeGenes;
    }
}
