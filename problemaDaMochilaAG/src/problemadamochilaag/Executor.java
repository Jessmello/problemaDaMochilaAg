/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemadamochilaag;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Executor {
    private List<Cromossomo> cromossomos = new ArrayList<>();
    private int tamanhoDaPopulacao; // a definir via interface
    private int quantidadeDeGenes;
    
    public void executarAlgoritmo() {
        List<Item> itens = new Util().getItens();
        
        for (int i = 0; i < tamanhoDaPopulacao; i++) {
            cromossomos.get(i).setGenes(itens); // um cromossomo é igual a todos os itens do arquivo
            for (Item item : cromossomos.get(i).getGenes()) { // para cada gene do cromossomo, decido (aleatoriamente), se ele vai ou não pra dentro da mochila
                if (getRandom() > 0.50000) { 
                    item.setSelecionado(true); 
                } 
            }
        }
    }
    
    private float getRandom() {
        return new Random().nextFloat(); 
    }

    /**
     * @return the cromossomos
     */
    public List<Cromossomo> getCromossomos() {
        return cromossomos;
    }

    /**
     * @param cromossomos the cromossomos to set
     */
    public void setCromossomos(List<Cromossomo> cromossomos) {
        this.cromossomos = cromossomos;
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
