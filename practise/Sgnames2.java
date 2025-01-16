package com.test.practise;
class Names3{
    String name;
    int id;
    Names3(String n1,int id1){
        name=n1;
        id=id1;
        System.out.println("Name:"+name);
        System.out.println("id:"+id);
    }
}

public class Sgnames2 {
    public static void main(String[] args) {
        Names3 o1=new Names3("Yuktha",9);
    }
}
