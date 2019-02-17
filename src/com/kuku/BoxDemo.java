package com.kuku;

public class BoxDemo {
public static void main(String args[]) {
    Box mybox1 = new Box();
    Box mybox2 = new Box(11.0,12.0,13.0);
    double vol;

    mybox1.width = 10;
    mybox1.height = 20;
    mybox1.depth = 15;

    mybox2.width = 3;
    mybox2.height = 6;
    mybox2.depth = 9;

    double volume = mybox1.volume();
    mybox2.volume();

    mybox1 = null;
    System.out.println(mybox1);
    System.gc();




    /*vol = mybox1.width * mybox1.hight * mybox1.depth;
    System.out.println("Объем равен: " + vol);

    vol = mybox2.width * mybox2.hight * mybox2.depth;
    System.out.println("Объем равен: " + vol);*/
}
}
