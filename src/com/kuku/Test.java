package com.kuku;

public class Test {
    int a, b;
    Test(int i,int j) {
        a = i;
        b = j;
    }
    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }
    void meth(int a,int b) {
        a *= 2;
        b /= 2;
    }
}

