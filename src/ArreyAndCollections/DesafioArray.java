package ArreyAndCollections;

import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {

//      Declaração de variaveis
        var scan = new Scanner(System.in);
        int numeroDeNotas = 0;
        double total = 0;
//      declaração do array
        System.out.println("Quantas notas deseja colocar? ");
        numeroDeNotas = scan.nextInt();
        double[] notas = new double[numeroDeNotas];

        for (int i = 0; i < notas.length; i++) {

            System.out.printf("Digite a nota " + (i + 1) + " :");
            notas[i] = scan.nextDouble();

        }
        for (double nota : notas) {


            total = total + nota;

        }

        System.out.println("A media do aluno é: " + total / notas.length);
    }


}



