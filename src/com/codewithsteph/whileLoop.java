package com.codewithsteph;

import java.util.Locale;
import java.util.Scanner;

public class whileLoop {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int i=5;
        String input ="";
        while(!input.equals("quit") ){
            System.out.println("Input:");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        do {
            System.out.println("Input:");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }while(!input.equals("quit"));

    }
}
