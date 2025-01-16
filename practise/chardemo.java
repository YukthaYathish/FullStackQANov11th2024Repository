package com.test.practise;
class Character{
    void Assign(char ch[][]){
        for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[1][i]);
        }
    }
}
public class chardemo {
    public static void main(String[] args) {
        Character o3=new Character();
        char ch[][]={{'A','B'},{'C','D'}};
        o3.Assign(ch);


    }
}
