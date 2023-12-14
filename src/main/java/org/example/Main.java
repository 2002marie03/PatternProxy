package org.example;

public class Main {
    public static void main(String[] args) {
        Context context=new Context();
       /** context.setService(new CacheProxy());
        context.compute(3);
        System.out.println();
        context.compute(5);
        System.out.println();
        context.compute(3);
        System.out.println();
        context.compute(7);

        context.print();**/
       /**
        System.out.println("Cas de role est root");

        context.setService(new SecurityProxy());
        context.compute(2);**/
        SecurityContexte.authenticate("Halli","187387","root");
        context.setService(new SecurityProxy(new LoggingProxy(new CacheProxy(new IServiceImpl()))));
        context.compute(5);

    }
}