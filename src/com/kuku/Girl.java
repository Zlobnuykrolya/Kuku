package com.kuku;

public class Girl {
     String name;
     int age;
     int height;

    public Girl(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public void goToTheCinema() {
        System.out.println("go to the Cinema " + name);
    }

    public String goToTheRestaurant(String restaurantName) {
        if (restaurantName.equals("McDonalds")) {
            return "no";
        } else {
            return "yes";
        }
    }
}
