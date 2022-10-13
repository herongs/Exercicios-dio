import java.util.Scanner;

public class Ex05_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Insira o númer:");
        numero = scan.nextInt();


        System.out.println("Tabuada do " + numero);

        for (int i = 1; i <= 10; i++) {

            System.out.println(numero + " x " + i + " = " + numero*i);
            
        }

        scan.close();
    }
}
