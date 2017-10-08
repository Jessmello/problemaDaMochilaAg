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
        
        List<Double> proportionalFitnesses = new LinkedList<Double>();

        double totalFitness = population.getPesoPopulacao();
        double bestFitness = 0;

        List<Cromossomo> parents = new ArrayList<Cromossomo>();
        
        for (Cromossomo i : population.getPopulacao()){
            double fitness = i.getNota() / totalFitness;
            proportionalFitnesses.add(fitness);
            if(fitness > bestFitness){
                bestFitness = fitness;
            }
        }
      
        while (parents.size() < 2){
            
            double p = new Random().nextFloat();

            int index = (int)(population.getPopulacao().size()*Math.random());
            if (p < (proportionalFitnesses.get(index)/bestFitness) && parents.size() < 2){
                Cromossomo c = population.getPopulacao().get(index);
                parents.add(c);
                population.getPopulacao().remove(c);
            }
        }
        
        return parents;
    }
}