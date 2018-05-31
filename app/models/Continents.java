package models;

import java.util.Map;
import java.util.TreeMap;

public class Continents
{
   private Map<String, Continent> continents;

   public Continents()
   {
       continents = new TreeMap<>();

       Continent asia = new Continent("AS", "Asia", 44391162, 4406273622L);
       Continent africa = new Continent("AF", "Africa", 30244049,1215770813L);

       continents.put(asia.getId(), asia);
       continents.put(africa.getId(),africa);

   }

    public Map<String, Continent> getContinents()
    {
        return continents;
    }
}
