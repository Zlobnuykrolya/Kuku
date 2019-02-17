package com.kuku;

 class Box {
    /*public int width;
    public int hight;
    public int depth;*/

    double width;
    double height;
    double depth;

     public Box() {
         System.out.println("Hi");

     }

     public Box(double width, double height, double depth) {
         this.width = width;
         this.height = height;
         this.depth = depth;
     }

     @Override
     protected void finalize() throws Throwable {
         System.out.println("Чао!");
     }

     double volume() {

        return width*height*depth;




    }}
