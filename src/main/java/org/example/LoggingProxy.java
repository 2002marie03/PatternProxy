package org.example;

public class LoggingProxy implements IService{
    private IService iService;


    public LoggingProxy(IService iService) {
        this.iService = iService;
    }
    @Override
    public double compute(int param) {
        long t1=System.currentTimeMillis();
        double resultat=iService.compute(param);
        long t2=System.currentTimeMillis();
        System.out.println("Duration =>"+(t2-t1));
        return resultat;
    }

    @Override
    public void print() {

    }
}
