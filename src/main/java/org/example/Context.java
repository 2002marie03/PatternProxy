package org.example;

public class Context {

    private IService iService=new IServiceImpl();

    public double compute(int param){
        System.out.println("--------Client--------");
        double rslt=iService.compute(param);
        System.out.println("           Resultat =>"+rslt);
        return rslt;
    }


    public  void print(){
        System.out.println("--------Client--------");
        iService.print();
    }
    public void setService(IService proxy) {
        this.iService = proxy;
    }
}
