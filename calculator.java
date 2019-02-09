package com.industry.math;

//import java.time.*;

public class Calculator {

    private Double x;
    private Double y;
    /*private LocalTime timePoint;
    private LocalDate datePoint;*/

    public Calculator() {
    }

    public Double add(Double x, Double y){ return x+y; }
    public Double sub(Double x, Double y){ return x-y; }
    public Double mul(Double x, Double y){ return x*y; }
    public Double div(Double x, Double y){ return x/y; }

    public void info() {
        System.out.println("\n");
        System.out.println("Dziś jest: 2019.01.18");
        System.out.println("\n");
        System.out.println("Jestem klasą: kalkólutator, wersja z błedami, ortograficznymi");
        System.out.println("Lepszą nie będę, jakkolwiek, będę próbowała :)");
        System.out.println("\n");
    }
}
