package com.test.practise;
class Demo9{
    void PrimeCount(int x)
    {
        int count=0;
        for(int k=100;k<=200;k++)
        {
            int look=0;
            for(int i=2;i<k;i++)
            {
                if(k%i==0)
                {
                    look=look+1;
                    break;
                }
            }
            if(look==0)
            {
                count=count+1;
            }
        }
        System.out.println(count);
    }
}

public class PrimenumberCount {
    public static void main(String[] args) {
        int x=0;
        Demo9 o=new Demo9();
        o.PrimeCount(x);
    }
}
