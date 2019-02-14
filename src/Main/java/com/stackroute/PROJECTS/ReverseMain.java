package com.stackroute.lib;
import java.util.Scanner;

public class ReverseMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = scan.next();
        Reverse r=new Reverse();
        String res=r.reverse(s);
        System.out.println(res);
    }
}
