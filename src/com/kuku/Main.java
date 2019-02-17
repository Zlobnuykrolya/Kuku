package com.kuku;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*System.out.println("Hi");
        m();
        System.out.println("Finish");
        int file = 9;
        System.out.println(file);
        int Ann = 10;
        System.out.println(Ann++);
        int read = System.in.read();
        System.out.println((char)read);*/
        /*Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);*/
       /* char a='D';
        System.out.println(a/2);
        System.out.println("\u2122\u0037");*/
        /*char c1 = '1';
        char c2 = '\u0031';
        char c3 = 49;
        System.out.println(c1+c2+c3);*/
        /*System.out.println("4/2="+4/2=="4/2=2");*/
       /* int x = 10;
        if (x < 20) {
            System.out.println("x<20");
        } else {
            System.out.println("x>20");

        }*/
       /* int age = 18; // Student
        String study;

        if (age >= 3 && age <= 6) {
            study = "kindergarden";
        } else if (age >= 7 && age <= 17) {
            study = "school";
        } else if (age >= 18 && age <= 23) {
            study = "uneversity";
        } else if (age >= 24 && age <= 64) {
            study = "work";
        } else {
            study = "relax";
        }

        System.out.println(study);*/
        /*int x = 7;
        switch (x) {
            case 1:
            System.out.println("1");
            break;
            case 2:
            System.out.println("2");
            break;
            case 3:
            System.out.println("3");
            break;
            case 4:
            System.out.println("4");
            break;
            case 5:
            System.out.println("5");
                System.out.println("work day");
            break;
            case 6:
            System.out.println("6");
            break;
            case 7:
                System.out.println("7");
            System.out.println("off day");
                break;
            default:
                System.out.println("--");
                }*/
        /*for (int i = 0; i <=10 ; i++) {
            System.out.println(i);
        }*/
        /*for (int i = 1; i <=100 ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }*/

        /*for (int i = 1; i <100; i++, System.out.println(i)) {

        }*/

       /* int[] x = {1, 2, 3, 4, 5, 6, 7};
        for (int i : x) {
            System.out.println(i);

            }

            for (int i1 = x.length - 1; i1 >= 0; i1--) {
                System.out.println(x[i1]);
        }*/

        /*for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i + " ");
        }*/


    /*static void m() {
        System.out.println("Yes");
    }*/

        /*String strInt = "123";
        String strDouble = "123.456";
        int x;
        double y;
        x = Integer.parseInt(strInt);
        y = Double.parseDouble(strDouble);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        strInt = String.valueOf(x + 1);
        strDouble = String.valueOf(y + 1);
        System.out.println("strint=" + strInt);
        System.out.println("strDouble=" + strDouble);
        String str;
        str = "nim=" + 345;
        System.out.println(str);*/

       /* int a[][] = {{1, 45},
                     {2, 100},
                     {3, 456}};*/
        /*for (int i : a) {
            System.out.println(i);
        }
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }*/

        /*Arrays.stream(a)
                .map(s->s*2)
                .forEach(s->System.out.print(s+" "));
        System.out.println(Arrays.toString(a));*/

       /* for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt+ " ");
            }
            System.out.println();

        }*/
       /* int a[] = {5, 2, 9, 15, 3, 11};*/
        /*invert(a);
        showArray(a);

        invert(a);
        showArray(a);*/
        /*sortArray(a);*/
        /*showArray(a);
        invert(a);*/
        /*showArray(a);*/

        int[] arr = {10, 20, 30, 40};
        int pos = Arrays.binarySearch(arr, 20);
        System.out.println(pos);
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

    private static void showArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    /*private static void invert(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
    }*/

}

