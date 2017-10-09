package problemadamochilaag;

import java.util.ArrayList;
import java.util.List;

public class Cromossomo implements Comparable{
    private List<Item> genes = new ArrayList<>();
    private int nota;
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
    public int getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public int compareTo(Object o) {
        Cromossomo c = (Cromossomo) o;
        if(this.nota > c.nota){
            return -1;
        }
        if(this.nota < c.nota){
            return 1;
        }
        return 0;
    }

}
