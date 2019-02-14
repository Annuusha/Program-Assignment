package com.stackroute.lib;
import java.util.Scanner;

public class CharacterCheckMain {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);
        CharacterCheck cc=new CharacterCheck();
        String res=cc.characterCheck(c);
        System.out.println(res);
    }
}
