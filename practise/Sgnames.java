package com.test.practise;
class Names1{;
Names1(String names,int id) {
    System.out.println("Name:" + names);
    System.out.println("Id" + id);
}
Names1(String course){
    System.out.println("Course"+course);
}
Names1(int courseid, String StudentName){
    System.out.println("Student Name"+StudentName);
    System.out.println("Course id"+courseid);
}
}

public class Sgnames {
    public static void main(String[] args) {
        Names1 o1=new Names1("SGSoftware Testing",8);
        Names1 o2=new Names1("Software Testing");
        Names1 o3=new Names1(9,"Sonu");



    }
}
