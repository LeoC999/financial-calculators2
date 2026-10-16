package com.capstoneprac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hello and welcome to the morgage calculatorr! ");
        System.out.print("Enter your principle to get us started ");
        double principle = input.nextDouble();
        System.out.print("Enter your annual interest rate ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter how many years the loan is for ");
        int years = input.nextInt();

        monthlyPayments( years * 12);

        }
        public static void monthlyPayments(double monthlyPayments){
        System.out.print(" ");
        }
    }
