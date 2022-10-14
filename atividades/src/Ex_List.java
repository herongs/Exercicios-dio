package atividades.src;

import java.util.ArrayList;
import java.util.List;

public class Ex_List {
    public static void main(String[] args) {
        //Dada uma lista com 7 notas de um aluno {7,8.5,9.3,5,7,8,3.6}, faça:
    
        //List notas = new ArrayList();
        //List<Double> notas = new ArrayList<>();
        //ArrayList<Double> notas = new ArrayList<>();
        //List<Double> notas = new ArrayList<>(Arrays.asList{7d,8.5,9.3,5d,7d,8d,3.6});
        
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(8.0);
        notas.add(3.6);
        
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4,8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0:");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas) System.out.println(nota);


    }
}
