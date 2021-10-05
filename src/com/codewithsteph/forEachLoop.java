package com.codewithsteph;

public class forEachLoop {
    public static void main(String [] args){
        String[] fruits={"Apple","Mango","Orange"};

        for(int i=fruits.length;i>0;i++)
        {
            System.out.println(fruits[i]);
        }
        //always forward only -->for each loo
        for (String fruit:fruits)
            System.out.println(fruit);

    }
}
