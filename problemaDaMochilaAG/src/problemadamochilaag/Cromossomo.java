package problemadamochilaag;

import java.util.ArrayList;
import java.util.List;

public class Cromossomo {
    private List<Item> genes = new ArrayList<>();
    private double nota;
    private int preco;

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
    /**
     * @return the genes
     */
    public List<Item> getGenes() {
        return genes;
    }

    /**
     * @param genes the genes to set
     */
    public void setGenes(List<Item> genes) {
        this.genes = genes;
    }

    /**
     * @return the nota
     */
    public double getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(double nota) {
        this.nota = nota;
    }

}
