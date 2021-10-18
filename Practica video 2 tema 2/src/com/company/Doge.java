package com.company;

import java.sql.SQLOutput;

public class Doge {
    public String name;
    public int age;
    public String race;
    public boolean dangerous;

    public void displayDoge(){
        System.out.println("Nombre: " + name);
        System.out.println("Edat: " + age);
        System.out.println("Raza: " + race);
        System.out.println("Peligroso: " + dangerous);


    }

    public int sumaredad(){

        age = age + 1;

        return age;

    }

}
