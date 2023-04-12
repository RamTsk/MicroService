package org.practice.exceptionHandling.exercise;

public class HandlingRunTimeExcep {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException var4) {
            System.out.println(var4.getMessage());
        }

    }
}
