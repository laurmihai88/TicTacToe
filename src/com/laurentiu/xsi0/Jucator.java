package com.laurentiu.xsi0;

import java.util.Scanner;

public class Jucator {
    Scanner scanner = new Scanner(System.in);
    private String nume;
    private char simbol;
    private int alegere;

    public Jucator(String nume, char simbol) {
        this.nume = nume;
        this.simbol = simbol;
    }

    public String getNume() {
        return nume;
    }

    public char getSimbol() {
        return simbol;
    }

    public int getAlegere() {
        return alegere;
    }

    public void setAlegere() {
        this.alegere = scanner.nextInt();
    }
}
