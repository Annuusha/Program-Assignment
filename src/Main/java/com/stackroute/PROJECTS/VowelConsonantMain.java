package com.stackroute.lib;
import java.util.Scanner;

public class VowelConsonantMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = scan.next();
        VowelConsonant vc=new VowelConsonant();
        String res=vc.vowelConsonant(s);
        System.out.println(res);
    }
    }
