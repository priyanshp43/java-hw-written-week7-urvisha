package homework_week_7;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Programme_1_OddEvenTernaryOperator {
    public static void main(String[] args) {

        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);

        // CLosing the scanner Object
        scanner.close();
    }

    // Checking the number is odd or even
    public static void isItOddOrEvenNumber(int number) {

        // Ternery operator is used
        // ? operator is shorthand way of writing an if-else statement.
        // condition ? expression1 : expression2
        //condition: A boolean expression.
        //expression1: The value to return if the condition is true.
        //expression2: The value to return if the condition is false.

        String evenorodd = (number % 2==0) ? "Even" : "odd";
        System.out.println("The " + number + " is " + evenorodd + " number");
    }
    }
