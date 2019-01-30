package com.kuku;

import java.io.IOException;
import java.util.Scanner;
import java.util.Random;


public class Hi {
    private static Object Scanner;

    public static void main(String[] args) throws IOException {
        // Task 1: Hello name
       /* System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hi " + name);*/

       //Task 2: ReversArgs
       /* for (int i = args.length - 1; i >= 0; i--) {
           System.out.print(args[i] + " ");
       }*/

        //Task 3: Random numbers
       /* System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Random rand = new Random();

        for (int i = 0; i <number ; i++) {
            int n = rand.nextInt(100);
            System.out.println(n);
        }

        for (int i = 0; i <number ; i++) {
            int n = rand.nextInt(100);
            System.out.print(n + " ");
        }*/

        //Task 4: Password
        /*String password = "Password";
        System.out.println("Enter password:");
        Scanner scanner = new Scanner(System.in);
        String userPassword = scanner.nextLine();
        if (password.equals(userPassword)) {
            System.out.println("You win!!!");
        }
        else {
            System.out.println("You loose:(");
        }*/

        //Task 5: Arguments sum
      /* int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }*/

      //Task 6:
        System.out.println("Enter n numbers:");
        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split("\\s+");

        System.out.println("Even numbers:");
        for (String numStr : split) {
            int number = Integer.parseInt(numStr);
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        System.out.println("Odd numbers:");
        for (String numStr : split) {
            int number = Integer.parseInt(numStr);
            if (number % 2 == 1) {
                System.out.println(number);
            }
        }

        int min = Integer.MAX_VALUE;
        int max = 0;
        for (String numStr : split) {
            int number = Integer.parseInt(numStr);
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);


        System.out.println("Dividable by 3 or 9:");
        for (String numStr : split) {
            int number = Integer.parseInt(numStr);
            if (number % 3 == 0 || number % 9 == 0) {
                System.out.println(number);
            }
        }

        System.out.println("Dividable by 5 and 7:");
        for (String numStr : split) {
            int number = Integer.parseInt(numStr);
            if (number % 5 == 0 && number % 7 == 0) {
                System.out.println(number);
            }
        }

        System.out.println("Different triplex:");
        for (String number : split) {
            if (number.length() == 3) {
                String[] chars = number.split("");
                if (!chars[0].equals(chars[1]) &&
                    !chars[1].equals(chars[2]) &&
                    !chars[0].equals(chars[2]) ) {
                    System.out.println(number);
                }
            }
        }

        System.out.println("Lucky numbers:");
        for (String number: split) {
            if (number.length() == 4) {
                String[] chars = number.split("");
                if (Integer.parseInt(chars[0]) + Integer.parseInt(chars[1]) ==
                    Integer.parseInt(chars[2]) + Integer.parseInt(chars[3])) {
                    System.out.println(number);
                }
            }
        }
    }
}