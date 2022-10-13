import java.util.Scanner;

public class Ex03_MaiorEMedia {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, maior = 0, soma = 0, media;
        int count = 0;

        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();
            count += 1;
            soma += numero;
            if(numero > maior)
                maior = numero;
        }
        while(count < 5);

        media = soma/count;

        System.out.println("A média é: " + media);
        System.out.println("O Maior número é " + maior);

        scan.close();

    }
}
