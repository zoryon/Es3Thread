package com.example;

import java.util.ArrayList;

class Classifica {
    private ArrayList<Cavallo> risultati = new ArrayList<>();

    public void aggiungiRisultato(Cavallo cavallo) {
        risultati.add(cavallo);
    }

    public void stampaClassifica() {
        System.out.println("Classifica finale:");
        for (int i = 0; i < risultati.size(); i++) {
            System.out.println((i + 1) + ") " + risultati.get(i).getNome());
        }
    }
}