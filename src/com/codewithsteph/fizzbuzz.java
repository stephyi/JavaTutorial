package com.codewithsteph;

import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Number:");
        int num=scanner.nextInt();

        if (num% 5 ==0 )
        {
            if (num % 3 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        }
        else if (num % 3==0)
            System.out.println("Buzz");
        else
            System.out.println(num);

    }
}
