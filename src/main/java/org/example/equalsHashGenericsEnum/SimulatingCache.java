package org.example.equalsHashGenericsEnum;

import java.util.HashMap;
import java.util.Map;

public class SimulatingCache {

    private HashMap<Integer,Entities> cache = new HashMap<>();

    protected void addToCache(Entities entities)
    {
        cache.put(entities.hashCode(),entities);
    }

    protected void printCache()
    {
        for(Integer obj : cache.keySet())
        {
            System.out.println("Hash: "+ obj + " Object: "+cache.get(obj));
        }
    }

}
