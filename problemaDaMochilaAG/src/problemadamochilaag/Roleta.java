package problemadamochilaag;

import java.util.LinkedList;
import java.util.List;

/*
 * Roulette (fitness-proportionate) selection.
 */
public class Roleta { 
    
    public List<Cromossomo> select(Populacao population){
        
        List<Double> absoluteFitnesses = new LinkedList<Double>();
        List<Double> proportionalFitnesses = new LinkedList<Double>();

        double totalFitness = population.getPesoPopulacao();

        List<Cromossomo> parents = new LinkedList<Cromossomo>();
        
        for (Double i : absoluteFitnesses){
            proportionalFitnesses.add(i / totalFitness);
        }
      
        while (parents.size() < 2){
            
            double p = Math.random();

            for (int i = 0; i < population.getPopulacao().size(); i += 1){
                if (p < proportionalFitnesses.get(i) && parents.size() < 2){
                    parents.add(population.getPopulacao().get(i));
                }
            }
        }
        
        return parents;
    }
}