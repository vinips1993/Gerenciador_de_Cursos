package br.com.alura;
import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {

        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);



        System.out.println(aulas);

        //aulas.remove(0);

        System.out.print(aulas);

        for (String aula : aulas) {
            System.out.println("Aulas: " + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A Primeira Aula é: " + primeiraAula);

        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("aula: " + aulas.get(i));
        }

        System.out.println(aulas.size());

        aulas.forEach(aula -> {
            System.out.println("percorrendo: ");
            System.out.println("Percorrendo: " + aula);});

        aulas.add("Aumento o nosso conhecimento");
        System.out.println(aulas);

        Collections.sort(aulas);
        System.out.println(aulas);

    }
}