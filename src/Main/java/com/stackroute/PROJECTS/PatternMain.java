package com.stackroute.lib;
import java.util.Scanner;

public class PatternMain {
    public static void main(String[] args) {
        System.out.println("Enetr a number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Pattern p=new Pattern();
        p.pattern(n);
    }
}
