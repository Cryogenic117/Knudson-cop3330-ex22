/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Knudson
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, largest;

        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        num3 = input.nextInt();

        if(num1 > num2)
            largest = num1;
        else
            largest = num2;

        if(largest < num3)
            largest = num3;

        System.out.printf("The largest number is %d.", largest);
    }
}
