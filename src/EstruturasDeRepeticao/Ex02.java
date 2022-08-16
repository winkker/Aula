package EstruturasDeRepeticao;

import java.util.Scanner;

public class Ex02 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        System.out.println("Digite um ano: ");
        i = scan.nextInt();

        if(i % 4 == 0) System.out.println("Ano Bissexto");
        if(i % 4 != 0) System.out.println("Ano não  Bissexto");
    }
}
