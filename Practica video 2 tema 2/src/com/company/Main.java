package com.company;

public class Main {

    public static void main(String[] args) {

        //Creació d'objecte
        Doge doge1;
        Doge doge2;
        Doge doge3;
        cat cat1;
        doge1 = new Doge();
        doge2 = new Doge();
        doge3 = new Doge();
        cat1 = new cat();


        //Assignació de valors
        doge1.name = "Thor";
        doge1.age = 10;
        doge1.race = "Labrador";
        doge1.dangerous = false;

        doge2.name = "Marilin";
        doge2.age = 11;
        doge2.race = "Bichón Maltes";
        doge2.dangerous = false;

        doge3.name = "Dana";
        doge3.age = 19;
        doge3.race = "Coker";
        doge3.dangerous = true;

        cat1.name = "Simba";
        cat1.age = 1;
        cat1.race = "Gato";
        cat1.dangerous = true;

        //Execuxió de mètode
        doge1.displayDoge();
        System.out.println();
        doge2.displayDoge();
        System.out.println();
        doge3.displayDoge();
        System.out.println();
        cat1.displayCats();


    }
}
