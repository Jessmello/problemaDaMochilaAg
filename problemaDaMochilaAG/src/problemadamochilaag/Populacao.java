package problemadamochilaag;

import java.util.ArrayList;
import java.util.List;

public class Populacao {
    
    private List<Cromossomo> populacao = new ArrayList<>();
    private double pesoPopulacao;
    

    public List<Cromossomo> getPopulacao() {
        return populacao;
    }

    public void setPopulacao(List<Cromossomo> populacao) {
        this.populacao = populacao;
    }

    public double getPesoPopulacao() {
        return pesoPopulacao;
    }

    public void setPesoPopulacao(double pesoPopulacao) {
        this.pesoPopulacao = pesoPopulacao;
    }
    
    
    
    
}
