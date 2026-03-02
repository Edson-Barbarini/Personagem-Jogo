package com.game;

public class Main {

    public static void main(String[] args) {

        Personagem p1 = new Personagem("EdsonX", 1, 100);

        System.out.println(p1);

        p1.subirNivel();

        System.out.println("Depois de subir de nível:");
        System.out.println(p1);
    }
}