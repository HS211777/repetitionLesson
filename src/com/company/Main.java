package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

    final double VAT = 0.2;
    boolean end = false;
    while (!end){
        System.out.println("Enter the price without VAT: ");
        double userInput = input.nextDouble();
        userInput = Math.round(userInput*100.00)/100.00;
        double tax = userInput * VAT;
        tax = Math.round(tax*100.00)/100.00;
        double output = tax + userInput;
        System.out.println("£"+output);
        System.out.println("go again? Y/N");
        String repeat = input.next();
        if (repeat.equalsIgnoreCase("n")){
            end = true;
        }
    }
    }
}
