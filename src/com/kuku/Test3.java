package com.kuku;

public class Test3 {
    int i;

    public Test3(int i) {
        this.i = i;
    }

    public Test3 incrByTen() {
        return new Test3(i + 10);
    }
}
