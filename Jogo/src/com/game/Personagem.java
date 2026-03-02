package com.game;

public class Personagem {

    private String nome;
    private int nivel;
    private int vida;

    // Construtor vazio
    public Personagem() {
    }

    // Construtor com parâmetros
    public Personagem(String nome, int nivel, int vida) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
    }

    // Método específico
    public void subirNivel() {
        nivel++;
        vida += 20;
        System.out.println(nome + " subiu de nível!");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", vida=" + vida +
                '}';
    }
}