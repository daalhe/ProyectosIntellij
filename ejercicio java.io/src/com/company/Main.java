package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número: ");
        int num = sc.nextInt();

        System.out.println(num + " por uno: " + num * 1);
        System.out.println(num + " por dos: " + num * 2);
        System.out.println(num + " por tres: " + num * 3);
        System.out.println(num + " por cuatro: " + num * 4);
        System.out.println(num + " por cinco: " + num * 5);
        System.out.println(num + " por seis: " + num * 6);
        System.out.println(num + " por siete: " + num * 7);
        System.out.println(num + " por ocho: " + num * 8);
        System.out.println(num + " por nueve: " + num * 9);
        System.out.println(num + " por diez: " + num * 10);
    }
}
