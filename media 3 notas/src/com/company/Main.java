package com.company;

public class Main {

    public static void main(String[] args) {
	// programa que saque una media de tres notas x2,
            // primer trimestre
        float num1 = 5.5f;
        float num2 = 6;
        float num3 = 10;
        float resultado1 = ((num1 + num2 + num3) /3);

        System.out.println("La media del primer trimestre és: " + resultado1);

            // segundo trimestre
        float num4 = 5.75f;
        float num5 = 10;
        float num6 = 8;
        float resultado2 = ((num4 + num5 + num6) /3);

        System.out.println("La media del segon trimestre és: " + resultado2);

        if (resultado1 > resultado2){
            System.out.println("Has empeorado");
        }
        else if (resultado1 < resultado2){
            System.out.println("Has mejorado");
        }





    }
}
