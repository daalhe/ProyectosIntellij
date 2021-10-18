package com.company;
import java.sql.SQLOutput;
import   java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Programa que calcula la media de tres numeros\n \n");

        System.out.println("Escriu el primer número: ");
        int n1 = num.nextInt();

        System.out.println("Escriu el segon número: ");
        int n2 = num.nextInt();

        System.out.println("Escriu el tercer número: ");
        int n3 = num.nextInt();

        System.out.println("Escriu el quart número: ");
        float Resultat = (float) (n1 + n2 + n3) / 3;

        System.out.println("El resultat de la mitjana dels tres números és: " + Resultat);


    }
}
