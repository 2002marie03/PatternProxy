package org.example;

import java.util.HashMap;
import java.util.Map;

public class CacheProxy implements IService{

    Map<Integer,Double> cache=new HashMap<>();
    private IService iService;

    public CacheProxy(IService iService) {
        this.iService = iService;
    }
    @Override
    public double compute(int parametre) {
        Double cachValue =cache.get(parametre);
        if (cachValue!=null){
            System.out.println("-------Cache Value-------");
            return cachValue;
        }
        else {
            double rslt=iService.compute(parametre);
            System.out.println("-------New value added to cache-------");
            cache.put(parametre,rslt);
            return rslt;
        }


    }

    @Override
    public void print() {

    }
}
