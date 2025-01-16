package com.test.practise;
class Demoo7{
    void array(int arr1[],int arr2[],int arr3[]){
        int b[]=new int[arr1.length+arr2.length+arr3.length];
        int p=0;
        for(int i=0;i<arr1.length;i++){
            b[p]=arr1[i];
            p++;
        }
        for(int i=0;i<arr2.length;i++){
            b[p]=arr2[i];
            p++;
        }
        for(int i=0;i<arr3.length;i++){
            b[p]=arr3[i];
            p++;
        }
        int sum=0;
        for(int i=0;i<b.length/2;i++){
            sum=sum+b[i];
            System.out.print(sum+" ");
        }
    }
}

public class parameterDemo {
    public static void main(String[] args) {
        Demoo7 o7=new Demoo7();
        int arr1[]={1,2,3};
        int arr2[]={4,5,6};
        int arr3[]={7,8,9};
        o7.array(arr1,arr2,arr3);
    }
}
