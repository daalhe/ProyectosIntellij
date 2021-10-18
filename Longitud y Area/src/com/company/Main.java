package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double longitud = 0;
        int radio = 0;
        Scanner leer = new Scanner(System.in);
        double area = 0;

        System.out.println("Dime el radio: ");
        radio = leer.nextInt();
        longitud = 2*3.14*radio;
        area = radio*3.14*(2*2);
        System.out.println("Longitud igual: " + longitud);
        System.out.println("Area igual: " + area);
    }
}
