package com.company;

public class Main {

    public static void main(String[] args) {

            //Creació d'objecte
            Futbol Futbol1;
            Futbol Futbol2;
            Futbol Futbol3;
            Futbol1 = new Futbol();
            Futbol2 = new Futbol();
            Futbol3 = new Futbol();

            //Assignació de valors
            Futbol1.name = "Mesut Özil";
            Futbol1.dorsal = 10;
            Futbol1.club = "Fenerbahçe";
            Futbol1.edad = 32;
            Futbol1.activo = true;

            Futbol2.name = "Ángel Di María";
            Futbol2.dorsal = 11;
            Futbol2.club = "PSG";
            Futbol2.edad = 33;
            Futbol2.activo = true;

            Futbol3.name = "Cristiano Ronaldo";
            Futbol3.dorsal = 7;
            Futbol3.club = "Manchester United";
            Futbol3.edad = 36;
            Futbol3.activo = true;

            //Execució del mètode
            Futbol1.displayFutbol();
            System.out.println();
            Futbol2.displayFutbol();
            System.out.println();
            Futbol3.displayFutbol();


        }
}
