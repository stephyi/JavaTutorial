package com.codewithsteph;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        // write your code here
        //declare variable


        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        float interest_rate = (float) readNumber("Annual Interset Rate: ", 1, 30);
        byte period = (byte) readNumber("Period(years): ", 1, 30);
        //variable is scoped to the block in which it is defined

        getMortgage(principal,interest_rate,period);
        getPaymentSchedule(principal,interest_rate,period);


    }


    public static double readNumber(String prompt, double min, double max)
        {
            Scanner scanner = new Scanner(System.in);
            double value;

            while (true)
            {
                System.out.print(prompt);
                value = scanner.nextDouble();

                if (value >= min && value <= max)
                    break;
                System.out.println("Please enter a value between" + min + " and " + max);
            }
            return value;
        }

        public static double paymentSchedule(int principal,float interest_rate,byte period,short numberOfPaymentsMade){
            short numberOfPayments = (short) (period * MONTHS_IN_YEAR);
            float monthlyInterest = interest_rate / PERCENT / MONTHS_IN_YEAR;

            double balance= principal
                    * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

            return balance;

        }

        public static double calculateMortgage( int principal, float interest_rate, byte period)
        {



            short numberOfPayments = (short) (period * MONTHS_IN_YEAR);
            float monthlyInterest = interest_rate / PERCENT / MONTHS_IN_YEAR;


            double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

            return mortgage;

        }

        public static void getMortgage(int principal, float interest_rate, byte period){

            double mortgage = calculateMortgage(principal, interest_rate, period);

            String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
            System.out.println("\nMORTGAGE");
            System.out.println("-----------------");
            System.out.println("Monthly Payments: " + mortgageFormatted);

        }

        public static void getPaymentSchedule(int principal, float interest_rate, byte period){

            System.out.println("\nPAYMENT SCHEDULE");
            System.out.println("-----------------");

            for(short month=1;month<=period*MONTHS_IN_YEAR;month++)
            {
                double balance=paymentSchedule(principal,interest_rate,period,month);
                System.out.println(NumberFormat.getCurrencyInstance().format(balance));

            }


        }

    }


