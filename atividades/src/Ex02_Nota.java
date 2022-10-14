package atividades.src;

import java.util.Scanner;

public class Ex02_Nota {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float nota;

        while (true) {
            System.out.println("Nota: ");
            nota = scan.nextFloat();

            if((nota >= 0) && (nota <= 10)){
                System.out.println("Nota Válida");
                break;
            }   
            else
                System.out.println("Insira uma nota Válida: ");

        }

        
    
        scan.close();

    }
}