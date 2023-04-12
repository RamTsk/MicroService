package org.practice.exceptionHandling.exercise;

public class UnCheckedExeptionExample {
    static int divideByZero(int a, int b) {
        return a / b;
    }

    static int computeDivision(int a, int b) {
        int res = 0;
        try {
            res = divideByZero(a, b);
        } catch (NumberFormatException  e) {
            System.out.println("Exception is occurred"+e.toString());
        }
        return res;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            computeDivision(a, b);
        }catch(ArithmeticException arth){
            System.out.println("Exception is occurred"+arth.toString());
        }
    }
}
