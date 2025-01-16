package com.test.practise;
class Demoo3{
    int sum=0;
    void array(int arr[]){
        for(int i=0;i<arr.length;i++){
            sum=i*5;
            if(sum % 10 ==0){
                System.out.println(sum+" ");
            }
        }
    }
}

public class multiplydemo {
    public static void main(String[] args) {
        Demoo3 o3=new Demoo3();
        int arr[]={1,2,3,4,5,6,7,8};
        o3.array(arr);
    }
;}
