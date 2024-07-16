package com.app;

import java.util.Scanner;

public class AppFizzBuzz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int number = scanner.nextInt();
        
        // System.out.println(evaluateNumber(number));

        for (int i = 1; i <= number; i++) {
            System.out.println(evaluateNumber(i));
        }

        scanner.close();
    }

    public static String evaluateNumber(int number) {
        boolean divisibleBy3 = (number % 3 == 0);
        boolean divisibleBy5 = (number % 5 == 0);
        boolean contains3 = String.valueOf(number).contains("3");
        boolean contains5 = String.valueOf(number).contains("5");

        if ((divisibleBy3 || contains3) && (divisibleBy5 || contains5)) {
            return "FizzBuzz";
        } else if (divisibleBy3 || contains3) {
            return "Fizz";
        } else if (divisibleBy5 || contains5) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
