package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAluno {

    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Vinicius Pedro");
        alunos.add("Alberto Souza");
        alunos.add("Marcos Paula");
        alunos.add("Sergio Pereira");
        alunos.add("Renan Silva");
        alunos.add("Hamilton Carvalho");
        alunos.add("Hamilton Carvalho");

        boolean viniciusEstaMatriculado = alunos.contains("Vinicius Pedro");
        alunos.remove("Sergio Pereira");

        System.out.println(alunos);

        System.out.println(viniciusEstaMatriculado);

        System.out.println(alunos.size());

        for (String aluno : alunos
             ) {
            System.out.println(aluno);
        }

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });
        
        System.out.println(alunos);

        List<String> alunosEmLista = new ArrayList<>(alunos);

    }
}
