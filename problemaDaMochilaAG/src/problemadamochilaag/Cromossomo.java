package problemadamochilaag;

import java.util.ArrayList;
import java.util.List;

public class Cromossomo {
    private List<Item> genes = new ArrayList<>();
    private int nota;
    private int volume;
    private int peso;
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

    /**
     * @return the volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }


}
