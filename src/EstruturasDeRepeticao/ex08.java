package EstruturasDeRepeticao;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String palavra;

        System.out.println("Digite uma palavra: ");
        palavra = scan.nextLine();

        for (int i = 0; i < palavra.length(); i++) System.out.println(palavra.charAt(i));

    }


}
