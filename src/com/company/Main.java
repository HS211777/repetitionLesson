package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

    final double VAT = 0.2;
    double userInput = input.nextDouble();
    System.out.println("Enter the price without VAT: ");
    userInput = Math.round(userInput*100.00)/100.00;
    double tax = userInput * VAT;
    tax = Math.round(tax*100.00)/100.00;
    double output = tax + userInput;
    System.out.println(output);
    }
}
