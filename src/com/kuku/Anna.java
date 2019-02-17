package com.kuku;

import java.io.IOException;

public class Anna
{public static void main(String[] args) throws IOException {
    /*Girl masha = new Girl("Masha",18,178);
    System.out.println(masha);
    Girl dasha = new Girl("Dasha",20,165);
    System.out.println(dasha);
    System.out.println(masha.age);
    System.out.println(masha.height);
    masha.goToTheCinema();
    dasha.goToTheCinema();
    Girl anna = new Girl("Anna", 28, 164);
    anna.goToTheCinema();
    System.out.println(anna.goToTheRestaurant("Stargorod"));
    System.out.println(anna.goToTheRestaurant("McDonalds"));
    Girl ira = new Girl("Ira", 29, 140);
    System.out.println(ira.goToTheRestaurant("Paris"));
    ira.goToTheCinema();*/

   /* m();
    m(10);
    m(12,12);
    m(12.0);
    System.out.println(m(1,2,3,4,5,6,7,8,9));*/
    /*Test ob = new Test(15, 20);
    int x = 10;int y = 10;
    ob.meth(x, y);
    System.out.println(x+" "+y);
    ob.meth(ob);
    System.out.println(x+" "+y);*/
    /*Test2 ob1 = new Test2(2);
    Test2 ob2;

    ob2 = ob1.incrByTen();
    System.out.println(ob1.a);
    System.out.println(ob2.a);*/

    Test3 test3 = new Test3(2);
    test3.incrByTen();
    System.out.println(test3.i);
    Test3 test4 = test3.incrByTen();
    System.out.println(test4.i);
}
    static void m () {
        System.out.println("m()");
    }
    static void m (int a) {
        System.out.println("m(int a)");
    }
    static void m (int a,int b) {
        System.out.println("m(int a,int b)");
    }
    static void m (double a) {
        System.out.println("m(double a)");
    }
    static int m (int...a) {
        System.out.println("m(int a,int b)");
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
