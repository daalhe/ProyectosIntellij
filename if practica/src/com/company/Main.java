package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Dime el primer nombre: ");
        int name1 = leer.nextInt();
        System.out.println("Dime el segundo nombre: ");
        int name2 = leer.nextInt();

        if (name1 == name2){

            System.out.println("Los nombres son iguales");

        } else if (name1 != name2){

            System.out.println("Los nombres son diferentes");

        }
    }

}
