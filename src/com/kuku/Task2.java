package com.kuku;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter n numbers:");
        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split("\\s+");

        //Task 2.1: max & min number langth
        String maxNumber = "";
        String minNumber = "12345";

        for (String numStr : split) {
            if (numStr.length() > maxNumber.length()) {
                maxNumber = numStr;
            }

            if (numStr.length() < minNumber.length()) {
                minNumber = numStr;
            }
        }

        System.out.println("Max number: " + maxNumber + "   langth: " + maxNumber.length());
        System.out.println("Min number: " + minNumber + "   langth: " + minNumber.length());

        //Task 2.2: sort by number langht
        sortArray(split);
        System.out.println(Arrays.toString(split));
        Collections.reverse(Arrays.asList(split));
        System.out.println(Arrays.toString(split));
        Collections.reverse(Arrays.asList(split));

        //Task 2.3: more & less the average langth
        int averageLangth = (maxNumber.length() + minNumber.length()) / 2;
        System.out.println("Average langth: " + averageLangth);
        System.out.println("Big numbers: ");
        for (String numStr:split) {
            if (numStr.length() > averageLangth) {
                System.out.print(numStr + "[" + numStr.length() + "] ");
            }
        }
        System.out.println();
        System.out.println("Small numbers: ");
        for (String numStr:split) {
            if (numStr.length() < averageLangth) {
                System.out.print(numStr+ "[" + numStr.length() + "] ");
            }
        }

        //Task 2.4: Min character numbers
        System.out.println();
        System.out.println("Min character number: ");

        int minCharacterNum = Integer.MAX_VALUE;
        String minNum = "";
        for (String numStr:split) {
            int characterNum = 0;
            for (int i = numStr.length() - 1; i >= 0; i--) {
                if (numStr.indexOf(numStr.charAt(i), i + 1) == -1) {
                    characterNum++;
                }
            }
            if (characterNum <= minCharacterNum) {
                minCharacterNum = characterNum;
                minNum = numStr;
            }
        }

        System.out.println(minNum);

        //Task 2.5: Even numbers with equal numbers of odd & even numbers
        System.out.println();
        System.out.println("Eqeul odd & even numbers: ");

        for (String numStr:split) {
            int num = Integer.parseInt(numStr);
            if (num % 2 == 0) {
                int evenNum = 0;
                int oddNum = 0;
                for (int i = 0; i < numStr.length(); i++) {
                    int singlNum = Character.getNumericValue(numStr.charAt(i));
                    if (singlNum % 2 == 0) {
                        evenNum++;
                    } else {
                        oddNum++;
                    }

                    if (oddNum == evenNum) {
                        System.out.println(numStr);
                    }
                }
            }
        }

        //Task 2.6: Ascending number
        System.out.println();
        System.out.println("Eqeul odd & even numbers: ");

        for (String numStr:split) {
            boolean isAscending = true;
            for (int i = 1; i < numStr.length(); i++) {
                if (Character.getNumericValue(numStr.charAt(i - 1)) >= Character.getNumericValue(numStr.charAt(i))) {
                    isAscending = false;
                }
            }
            if (isAscending) {
                System.out.println(numStr);
                break;
            }
        }

        //Task 2.7: Different number
        System.out.println();
        System.out.println("Different numbers: ");

        for (String numStr : split) {
            boolean numbersAreUnique = true;
            for (int i = 0; i < numStr.length(); i++) {
                numbersAreUnique &= numStr.indexOf(numStr.charAt(i), 0) == i &&
                                    numStr.indexOf(numStr.charAt(i), i + 1) == -1;
            }

            if (numbersAreUnique) {
                System.out.println(numStr);
                break;
            }
        }

        //Task 8.2: Matrix
        System.out.println();
        System.out.println("Matrix: ");
        int k = 4;
        int n = 7;
        int num = 1;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num++ + "\t");
            }
            System.out.println();
        }

    }

    private static void sortArray(String[] a) {
        for (int barrier = a.length - 1; barrier >= 0; barrier--) {
            for (int i = 0; i < barrier;i++) {
                if (a[i].length() > a[i + 1].length()) {
                    String temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
    }
}

