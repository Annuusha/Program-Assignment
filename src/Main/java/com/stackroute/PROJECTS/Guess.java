package com.stackroute.lib;

import java.util.Scanner;

public class Guess {
    public boolean guess(int t, int n){
        boolean flag= false;
        Scanner scan = new Scanner(System.in);
        while(flag)
        {
            if(n>t) {
                System.out.println("Guessed number is greater than target");
                n=scan.nextInt();

            }
            else if(n<t)
            {
                System.out.println("Guessed number is less than target");
                n=scan.nextInt();

            }
            else
            {
                System.out.println("Guessed number matched the target");
                flag=true;
            }
        }
        return flag;
    }
}