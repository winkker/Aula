package EstruturasDeRepeticao;

import java.util.Scanner;

public class DesafioWhile {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite -1 para sair");

        double nota = 0, notat = 0, i = 0.0f;

        while (nota != -1.0f) {

            System.out.println("Digite uma nota: ");
            nota = scan.nextDouble();
            if (nota >= 0 && nota <= 10) {
                notat = notat + nota;

                i++;

            } else {

                System.out.println("Digite uma nota valida (0 ~~ 10)");
            }


        }
        // Media das notas
        System.out.println("A media das notas é: " + notat / i);
        System.out.println("Foram colocadas : " + i + " Notas");

        scan.close();

    }
}