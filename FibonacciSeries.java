package com.arrays2;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num=10;
        int firstnum = 0;
        int secondnum = 1;
        int result;
        for(int i=0;i<=num;i++){
            result=firstnum+secondnum;
            System.out.println(firstnum+" ");
            firstnum=secondnum;
            secondnum=result;
        }
    }
}
