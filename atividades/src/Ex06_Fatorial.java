import java.util.Scanner;

public class Ex06_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, soma = 1;

        System.out.println("Insira o número:");
        numero = scan.nextInt();


        System.out.println("Tabuada do " + numero);

        for (int i = numero; i > 0; i--) {

            soma = soma * i;
            
        }

        System.out.println("Fatorial de " + numero + " = " + soma);
        
        scan.close();
    }
}
