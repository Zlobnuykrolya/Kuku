package com.kuku;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

//Task 9: Matrix
public class Matrix {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        final Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(2 * n) - n;
            }
        }

        // Task 9.1: Sort lines
        System.out.println();
        System.out.println("Sorted lines: ");
        for (int i = 0; i < n; i++) {
            //sortArray(a[i]);
        }

        showMatrix(a);

        // Task 9.2: Cyclic shift
        System.out.println();
        System.out.println("Cyclic shift: ");
        int k = 2;
        for (int m = 0; m < k; m++) {
            for (int i = 0; i < n; i++) {
                int temp = a[i][0];
                for (int j = 0; j < n - 1; j++) {
                    a[i][j] = a[i][j + 1];
                }
                a[i][n - 1] = temp;
            }
        }

        showMatrix(a);

        // Task 9.3: Max increasing number
        System.out.println();
        System.out.println("Max increasing number: ");
        int maxInreasingNum = 0;
        int maxInreasingLine = 0;
        for (int i = 0; i < n; i++) {
            int lineIncreasingNum = 0;
            for (int j = 0; j < n-1; j++) {
                if (a[i][j] < a[i][j + 1]) {
                    lineIncreasingNum++;
                } else {
                    lineIncreasingNum = 0;
                }
            }

            if (lineIncreasingNum > maxInreasingNum) {
                maxInreasingNum = lineIncreasingNum;
                maxInreasingLine = i;
            }
        }

        System.out.println(maxInreasingNum + 1 + " (line "+maxInreasingLine+")");


        // Task 9.4: Summ between positives
        System.out.println();
        System.out.println("Summ between positives: ");
        for (int i = 0; i < n; i++) {
            int sum = 0;
            boolean isSumAria = false;
            for (int j = 0; j < n; j++) {
                if (isSumAria) {
                    sum += a[i][j];
                }
                if (a[i][j] > 0) {
                    if (isSumAria) {
                        sum -= a[i][j];
                        break;
                    }
                    isSumAria = !isSumAria;
                }
            }
            System.out.println(sum);
        }

        //Task 9.5: Rotation
        System.out.println();
        System.out.println("Rotation: ");
        int[][] b = new int[a.length][a.length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[j][i] = a[a.length - i - 1][j];
            }
        }

        showMatrix(b);

        //Task 9.6: Substract averege
        System.out.println();
        System.out.println("Substructed averege: ");
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a[i][j];
            }
            int average = sum / n;
            for (int j = 0; j < n; j++) {
                a[i][j] -= average;
            }
        }

        showMatrix(a);

        // Task 9.7: Remoove zero rows/columns
        System.out.println();
        System.out.println("Remooved zero rows/columns: ");
        boolean[] notEmptyColumns = new boolean[n];
        boolean[] notEmptyRows = new boolean[n];

        int[][] c = {{1, 0, 3},
                     {0, 0, 0},
                     {7, 0, 9}};

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (c[i][j] != 0) {
                    notEmptyColumns[i] = true;
                    notEmptyRows[j] = true;
                }

            }
        }

        for (int i = 0; i < c.length; i++) {
            if (notEmptyRows[i]) {
                for (int j = 0; j < c[i].length; j++) {
                    if (notEmptyColumns[j]) {
                        System.out.print(c[i][j] + "\t");
                    }
                }
                System.out.println();
            }
        }
    }

    private static void sortArray(int[] a) {
        for (int barrier = a.length - 1; barrier >= 0; barrier--) {
            for (int i = 0; i < barrier;i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
    }

    private static void showMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
