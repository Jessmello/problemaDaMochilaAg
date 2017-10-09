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
        double bestFitness = 0;

        
        for (Cromossomo i : population.getPopulacao()){
            double fitness = (double)i.getNota() / totalFitness;
            proportionalFitnesses.add(fitness);
            if(fitness > bestFitness){
                bestFitness = fitness;
            }
        }
        
        while (parents.size() < 2){
            
            float p = new Random().nextFloat();
            int index = (int)(population.getPopulacao().size()*Math.random());
            if (p < (proportionalFitnesses.get(index)/bestFitness)){
                Cromossomo c = population.getPopulacao().get(index);
                parents.add(c);
                population.getPopulacao().remove(c);
                proportionalFitnesses.remove(index);
            }
        }
        
        return parents;
    }
}