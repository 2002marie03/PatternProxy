package org.example;

import java.util.HashMap;
import java.util.Map;

public class Proxy implements IService{


    private IService iService;

    public Proxy(IService iService) {
        this.iService = iService;
    }

    @Override
    public double compute(int parametre) {


            double rslt=iService.compute(parametre);
            System.out.println("-------New value added to cache-------");
            return rslt;



    }

    @Override
    public void print() {

    }
}
