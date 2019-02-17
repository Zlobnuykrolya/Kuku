package com.kuku;

public class Test2 {
    Test2(int i) {
        a = i;
    }
    int a;
    Test2 incrByTen() {
        Test2 temp = new Test2(a+10);
        return temp;
    }
}
