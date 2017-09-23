/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemadamochilaag;

import java.util.ArrayList;
import java.util.List;

public class Cromossomo {
    private List<Item> genes = new ArrayList<>();

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


}
