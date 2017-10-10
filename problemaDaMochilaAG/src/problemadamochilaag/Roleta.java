package problemadamochilaag;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
 * Roulette (fitness-proportionate) selection.
 */
public class Roleta { 
    
    public List<Cromossomo> select(Populacao population){
        
        List<Cromossomo> parents = new ArrayList<Cromossomo>();
        if(population.getPopulacao().size() == 2){
            parents.add(population.getPopulacao().get(0));
            parents.add(population.getPopulacao().get(1));
        }
        
        List<Double> proportionalFitnesses = new LinkedList<Double>();

        int totalFitness = population.getPesoPopulacao();
        
        for (Cromossomo i : population.getPopulacao()){
            double fitness = (double)i.getNota() / totalFitness;
            proportionalFitnesses.add(fitness);
        }
        
        while (parents.size() < 2){
            parents.add(getParent(population.getPopulacao(), proportionalFitnesses));
        }
        
        return parents;
    }
    
    private Cromossomo getParent(List<Cromossomo> population, List<Double> proportionalFitnesses){
        float p = new Random().nextFloat();
        for(int index=0; index < population.size(); index++){

            if (p < (proportionalFitnesses.get(index))){
                Cromossomo c = population.get(index);
                population.remove(c);
                proportionalFitnesses.remove(index);
                return c;
            }
        }
        Cromossomo c = population.get(population.size()-1);
        population.remove(c);
        proportionalFitnesses.remove(population.size()-1);
        return c;
    }
}
