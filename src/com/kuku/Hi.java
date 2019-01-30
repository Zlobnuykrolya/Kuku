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
        }

        System.out.println("Hi: " + sum);
        System.out.println("Summary: " + sum);
        System.out.println("Hello: " + sum);
        System.out.println("Sum: " + sum);
       System.out.println("i");

    }
}