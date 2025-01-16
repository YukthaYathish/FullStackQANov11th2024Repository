package com.test.practise;
class Demoo2{
    void arry(short arr[][]){
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i][i]+"");
        }
    }
}

public class shortDemo {
    public static void main(String[] args) {
        Demoo2 d2=new Demoo2();
        short arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        d2.arry(arr);
    }
}
