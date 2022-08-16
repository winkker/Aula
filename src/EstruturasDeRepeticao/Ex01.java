package EstruturasDeRepeticao;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;

        System.out.println("Digite um valor entre 0 e 10: ");
        i = scan.nextInt();

        if (i >= 0 && i <= 10) {
            if(i % 2 == 0) {
                System.out.println(i +" é um numero par");
            }else{
                System.out.println("è um numero impar");
            }

        } else {
            System.out.println("Valor invalido");
        }
    }
}
