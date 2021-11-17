package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        marco comunicador = new marco();
        comunicador.setVisible(true);
        comunicador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

    class marco extends JFrame {

        public marco(){
            setSize(500,500);
        }
    }
