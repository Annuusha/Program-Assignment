package com.stackroute.lib;

import java.util.Scanner;
public class GuessMain{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter target number");
        int t = scan.nextInt();
        System.out.println("Enter a number");
        int n = scan.nextInt();
        Guess g=new Guess();
        boolean res=g.guess(t,n);
    }
}