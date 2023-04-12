package org.practice.exceptionHandling.exercise;

public class ThrowTest {
    static void funThrow() {
        try {
            System.out.println("Inside fun(). ");
            throw new IllegalAccessException("demo");
        } catch(IllegalAccessException e){
            System.out.println(e.toString());
        }
    }
    static void funThrows() throws IllegalAccessException {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[]){
        funThrow();
        try {
            funThrows();
        } catch(IllegalAccessException e){
            System.out.println(e.toString());
        }
    }
}
