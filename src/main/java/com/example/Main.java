package com.example;

public class Main {
    public static void main(String[] args) {
        Classifica classifica = new Classifica();
        Cavallo[] cavalli = new Cavallo[20];

        for (int i = 0; i < 20; i++) {
            cavalli[i] = new Cavallo("Cavallo num. " + (i + 1), classifica);
            cavalli[i].start();
        }

        for (Cavallo cavallo : cavalli) {
            try {
                cavallo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        classifica.stampaClassifica();
    }
}
