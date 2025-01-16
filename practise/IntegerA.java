package com.test.practise;
class Integer{
    Integer(int a[]){
    for(int i=a.length-1;i>=0;i--)
    {
        System.out.println("elements in reverse order"+a);
    }
}

public class IntegerA {
    public static void main(String[] args) {
        int a[]={10,20,30};
        Integer i1=new Integer(a);
    }
}
}
