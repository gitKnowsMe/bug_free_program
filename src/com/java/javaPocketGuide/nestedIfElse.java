package com.java.javaPocketGuide;

public class nestedIfElse {
    public static void main(String[] args) {
        int num = 0;

        if (num>0){
            System.out.println("positive");
        }else{
            if(num<0){
                System.out.println("negative");
            }else{
                System.out.println("is 0");
            }
        }
    }
}
