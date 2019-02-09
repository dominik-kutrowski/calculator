package com.industry.math;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberChecker {

    Exception exception;
    Double StringIsDouble;


    public Double CheckIsDouble(){
        Scanner LineReader = new Scanner(System.in);
        do {
            exception = null;
            System.out.print("Liczba: ");
            try {
                StringIsDouble = LineReader.nextDouble();
            } catch (InputMismatchException e) {
                LineReader.next();
                exception = e;
            }
        } while (exception != null);
        return StringIsDouble;
    }
}
