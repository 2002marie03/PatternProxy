package org.example;

public class IServiceImpl implements IService{
    @Override
    public double compute(int param) {
        System.out.println("--------Implementation--------");
        double value=6;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        return value*param;
    }
    @Override
      public  void print(){
        System.out.println("--------Implementation--------");
    }
}
