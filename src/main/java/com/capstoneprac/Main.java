package com.capstoneprac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hello and welcome to the morgage calculator! ");
        System.out.print("Enter your principle to get us started ");
        double principle = input.nextDouble();
        System.out.print("Enter your annual interest rate ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter how many years the loan is for ");
        double years = input.nextInt();

        monthlyPayments( years * 12);
        monthlyInterestrate(annualInterestRate /100/12);
        MonthlyInterestPayment (1 + years * annualInterestRate / Math.pow())
        totalInterestofLoan()

        }
        public static void monthlyPayments(double monthlyPayments){
        System.out.println(" You will be paying this many times " + monthlyPayments + " for the duration of the loan ");
        }
        public static void monthlyInterestrate(double annualInterestRate){
        System.out.println(" This is your monthly interest rate " + annualInterestRate + " for the loan ");
        }
        public static void MonthlyInterestPayment (double monthlyPayments ){}
    }
