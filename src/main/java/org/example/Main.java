package org.example;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        String username,password ;
        Scanner sc=new Scanner(System.in);
        System.out.println("If Login press L");
        String xyz=sc.next();
        if (xyz.equalsIgnoreCase("l")){
            System.out.println("Your username please:");
            username= sc.next();
            System.out.println("Password:");
            password=sc.next();
            LoginSignup.login(username,password);
        }else {
            System.out.println("Signup page ");
            System.out.println("Your username please:");
            username= sc.next();
            System.out.println("Password:");
            password=sc.next();
            LoginSignup.signup(username,password);
            return;
        }
    }


}