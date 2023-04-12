package org.practice.exceptionHandling.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
    public void ioExceptionOccurs() {
        try {
            FileReader file = new FileReader("C:\\Mohan\\Java\\Workspace\\test.txt");
            BufferedReader fileInput = new BufferedReader(file);
            for (int counter = 0; counter < 10; counter++) {
                System.out.println(fileInput.readLine());
            }
            fileInput.close();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void classNotFoundTest() {
        try {
            Class.forName("GeeksForGeeks");
        } catch (ClassNotFoundException e) {
            System.out.println(">>>>>>>>>>>"+e.getMessage());
        }
    }
    public static void main(String[] args) {
        CheckedExceptionExample obj = new CheckedExceptionExample();
        obj.ioExceptionOccurs();
        obj.classNotFoundTest();
    }
}
