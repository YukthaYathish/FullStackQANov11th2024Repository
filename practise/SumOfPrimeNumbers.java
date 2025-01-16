package com.test.practise;
class Demo0{
    void primeSum(int x)
    {
        int sum=0;
        for(int k=100;k>=1;k++)
        {
            int look=0;
            for(int i=2;i<k;i++)
            {
                if(k%i==0)
                {
                    look=look+1;
                    break;
                }
                if(look==0)
                {
                    sum=sum+1;
                }
            }
        }
        System.out.println(sum);
    }
}

public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        int x=0;
        Demo0 o1=new Demo0();
        o1.primeSum(x);
    }
}
