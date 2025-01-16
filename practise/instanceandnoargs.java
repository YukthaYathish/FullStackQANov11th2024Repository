package com.test.practise;
class demo{
     static String fullNAme;
     static int age;
}
class demo1{
    demo1(){
        demo d=new demo();
        d.fullNAme="Yuktha";
        d.age=20;
    }
}


public class instanceandnoargs {
    public static void main(String[] args) {
        demo1 d1=new demo1();
        System.out.println(demo.fullNAme);
        System.out.println(demo.age);
    }
}
