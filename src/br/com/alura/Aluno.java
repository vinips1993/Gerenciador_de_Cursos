package br.com.alura;

public class Aluno {

    private String nome;
    private int numeroDaMatricula;

    public Aluno(String nome, int numeroDaMatricula) {
        this.nome = nome;
        this.numeroDaMatricula = numeroDaMatricula;
        this.numeroMatricula = numeroMatricula;
    }

    private String numeroMatricula;

    public String getNome() {
        return nome;
    }
    public int getNumeroDaMatricula() {
        return numeroDaMatricula;
    }

    @Override
    public String toString() {
        return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
    }

}

