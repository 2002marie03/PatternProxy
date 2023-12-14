package org.example;

public class SecurityProxy implements IService{
    private IService iService;

    public SecurityProxy(IService iService) {
        this.iService = iService;
    }

    @Override
    public double compute(int param) {
        if(!SecurityContexte.role.equals("root")){
            throw new RuntimeException("No authorized ");
        }
        else {

            System.out.println("--------Proxy--------");
            return iService.compute(param);
        }


    }

    @Override
    public  void print(){
        System.out.println("--------Proxy--------");
       iService.print();

    }
}
