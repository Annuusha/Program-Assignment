package com.stackroute.lib;
import java.util.Scanner;

public class TotalMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n;
        int sum = 0;
        Total t=new Total();

        while ((n= input.nextInt()) != 0)
        {
            sum=t.total(n,sum);
        }
        System.out.println(sum);
    }
}
