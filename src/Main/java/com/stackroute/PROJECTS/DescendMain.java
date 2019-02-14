package com.stackroute.lib;
import java.util.Scanner;

public class DescendMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scan.nextInt();
        Descend d=new Descend();
        String res=d.descend(x);
        System.out.println(res);
    }
}
