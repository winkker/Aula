package EstruturasDeRepeticao;

import java.util.Scanner;

public class Ex04 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int contador = 0;
        int numero = 0;
        System.out.print("Digite um numero: ");
        numero = scan.nextInt();

        for (int i = 2; i < numero; i++) {

            if (numero % i == 0) contador++;

        }
        switch (contador) {

            case 0:
                System.out.println("O numero é primo");
                break;

            default:
                System.out.println("O numero não é primo");

        }


    }
}
