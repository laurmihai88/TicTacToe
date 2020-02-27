package com.laurentiu.xsi0;

public class Xsi0 {
    public static void main(String[] args) {
        Jucator jucator1 = new Jucator("Laur",'X');
        Jucator jucator2 = new Jucator("Vlad",'0');
        TablaDeJoc tablaDeJoc = new TablaDeJoc();

        Arbitru arbitru = new Arbitru(jucator1,jucator2,tablaDeJoc);
        arbitru.mutare(tablaDeJoc);
    }
}
