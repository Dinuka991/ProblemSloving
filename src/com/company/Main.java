package com.company;

public class Main {

    public static void main(String[] args) {
       if(checkPrime(7)){
           System.out.println(1);
       }else {
           System.out.println(0);
       }
    }

    public static  boolean checkPrime(float x) {

        for (int i = 2; i < 10; i++) {
            if (x % i == 0){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

}
