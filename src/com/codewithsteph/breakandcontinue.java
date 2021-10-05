package com.codewithsteph;

import java.util.Scanner;

public class breakandcontinue {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int i=5;
        String input ="";
        while(true ) {
            System.out.println("Input:");
            input = scanner.next().toLowerCase();
            if(input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);

        }
    }
}
