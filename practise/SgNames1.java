package com.test.practise;
class Names{
    String name;
    int id;
    Names(){
        name="SgSoftware";
        id=5;
        System.out.println("NAme :"+name);
        System.out.println("id"+id);
    }
}

class StudentName{
    String sname;
    int sid;
    StudentName(){
        sname="yuktha";
        sid=9;
        System.out.println("Student name:"+sname);
        System.out.println("Studdnt id"+sid);
    }
}

public class SgNames1 {
    public static void main(String[] args) {
        Names n1=new Names();
        StudentName s1=new StudentName();




    }
}
