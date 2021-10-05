package com.codewithsteph;

public class createMethod {

    public static void main(String[] args){
        //greet
        //greetUser("Steph","Waks");
        String message=greetUser("Steph","Waks");
        System.out.println(message);
    }

    public static String greetUser(String firstName, String lastName){
        return "Hello " + firstName +" "+ lastName;

    }
}
