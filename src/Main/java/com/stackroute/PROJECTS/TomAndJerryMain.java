package com.stackroute.lib;
import java.util.Scanner;

public class TomAndJerryMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
        TomAndJerry tj=new  TomAndJerry();
        String res=tj.tomAndJerry(n);
        System.out.println(res);

    }
}
