package br.com.alura;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Ricardo Silva", 78965);
        Aluno a3 = new Aluno("Gabriel Ribeiro", 95146);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados nesse curso: ");
        javaColecoes.getAlunos().forEach(a ->{
            System.out.println(a);
        });

        System.out.println("O Aluno "+ a1 + "está matrículado? ");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno turini = new Aluno("Rodrigo Turini",34672);
        System.out.println("E esse Turini está matriculado?");
        System.out.println(turini);

        System.out.println("O a1 é igual ao Turini?");
        System.out.println(a1.equals(turini));

        //Se Dois objetos são equals eles necessariamente necessitam ter o mesmo hashcode

        System.out.println(a1.hashCode() == turini.hashCode());

    }
}
