package org.example;

public class SecurityContexte {

    public static String username="hallo";
    public static String password="hallo";
    public static String role="hallo";

    public static void authenticate(String nm, String pwd,String r){
        username=nm;
        password=pwd;
        role=r;

    }


}
