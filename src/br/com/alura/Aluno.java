package br.com.alura;

public class Aluno {

    private String nome;
    private int numeroDaMatricula;
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

