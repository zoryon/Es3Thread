package com.example;

class Cavallo extends Thread {
    private final String nome;
    private final Classifica classifica;

    public Cavallo(String nome, Classifica classifica) {
        this.nome = nome;
        this.classifica = classifica;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((int) (Math.random() * 1000));
            Thread.sleep((int) (Math.random() * 5000));

            classifica.aggiungiRisultato(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}