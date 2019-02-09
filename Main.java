package com.industry.math;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // ctrl + alt + L

        Double liczba1 = 0.0;
        Double liczba2 = 0.0;

        Calculator calculator = new Calculator();
        NumberChecker CheckInput = new NumberChecker();

        calculator.info();

        //dane wejściowe:
        liczba1 = CheckInput.CheckIsDouble();
        liczba2 = CheckInput.CheckIsDouble();

        //obliczenia:
        System.out.printf("\n add: " + calculator.add(liczba1, liczba2) + "\n");
        System.out.printf(" sub: " + calculator.sub(liczba1, liczba2) + "\n");
        System.out.printf(" mul: " + calculator.mul(liczba1, liczba2) + "\n");
        if (liczba2 != 0) System.out.printf(" div: " + calculator.div(liczba1, liczba2) + "\n");
        else System.out.printf(" div by 0 - maybe next time :)\n");}
}
