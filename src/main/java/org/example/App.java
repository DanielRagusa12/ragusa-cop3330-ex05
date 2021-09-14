package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        String String_1;
        System.out.print("What is the first number? ");
        Scanner input=new Scanner(System.in);
        String_1=input.next();

        String String_2;
        System.out.print("What is the second number? ");
        Scanner input2=new Scanner(System.in);
        String_2=input2.next();

        int Num_1=Integer.parseInt(String_1);
        int Num_2=Integer.parseInt(String_2);

        int add=Num_1+Num_2;
        int subtract=Num_1-Num_2;
        int multiply=Num_1*Num_2;
        int divide=Num_1/Num_2;
        String Final=((String_1 )+ " + " +(String_2 )+ " = "+( add)+"\n"+(String_1 )+ " - " +(String_2 )+ " = "+( subtract)+"\n"+(String_1 )+ " * " +(String_2 )+ " = "+( multiply)+"\n"+(String_1 )+ " / " +(String_2 )+ " = "+( divide)+"\n");

        System.out.print(Final);


    }
}
