package EstruturasDeRepeticao;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        int maiorn = 0;
        System.out.println("Digite 10 valores inteiros: ");

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %d valor: ", i + 1, " /n ");
            numero = scan.nextInt();
            if (maiorn < numero) maiorn = numero;

        }
        System.out.printf("O Maior numero foi %d", maiorn );

    }


}
