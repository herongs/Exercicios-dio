import java.util.Scanner;

public class Ex04_ParEImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantNumeros, numero, pares = 0, impares = 0;

        System.out.println("Quantidade de nuemeros");
        quantNumeros = scan.nextInt();


        for (int i = 1; i <= quantNumeros ; i++) {

            System.out.println("Informe o número: ");
            numero = scan.nextInt();
            if (numero%2 == 0 )
                pares++;
            else 
                impares++;
        }

        System.out.println("Pares:" + pares);
        System.out.println("Impares: " + impares);

    
        scan.close();

    }

    
    
}

