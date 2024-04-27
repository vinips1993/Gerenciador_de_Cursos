package br.com.alura;

public class Aluno {

    private String nome;
    private int numeroDaMatricula;

    public Aluno(String nome, int numeroDaMatricula) {
        if (nome == null) {
            throw new NullPointerException("Nome não pode ser null");
        }
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
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;
        return this.nome.equals(outro.nome);
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }

    @Override
    public String toString() {
        return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
    }

}

