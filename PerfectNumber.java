package com.arrays2;

public class PerfectNumber {
    public static void main(String[] args) {
        int n=45;
        int total=0;
        for(int i=1;i<n;i++) {
            if (n % i == 0) {
                total = total + i;
            }
        }
        if(total==n)
            System.out.println("It is a perfect number");
        else
            System.out.println("It is not a perfect number");
    }
}

