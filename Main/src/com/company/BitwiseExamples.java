package com.company;

public class BitwiseExamples {
    public static int countSetBits(int n){
        int count = 0;
        while(n != 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }


}