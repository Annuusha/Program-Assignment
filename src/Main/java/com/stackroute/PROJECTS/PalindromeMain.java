package com.stackroute.lib;
import java.util.*;

public class PalindromeMain {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int x=scan.nextInt();
        Palindrome p=new Palindrome();
        String res=p.palindrome(x);
        System.out.println(res);
    }
}
