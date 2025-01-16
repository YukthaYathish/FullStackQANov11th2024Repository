package com.test.practise;
class demo3 {
    {
        System.out.println("All the instances");
        System.out.println("this is first instance");

    }
    {
        System.out.println("this is the second instance");

    }
    {
        System.out.println("this is third instance");
    }
    static{
        System.out.println("it is a static block");
    }

        }

public class multipleinstance {
    public static void main(String[] args) {
        demo3 d3=new demo3();
    }
}
