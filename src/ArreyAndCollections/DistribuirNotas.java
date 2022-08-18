package ArreyAndCollections;

import java.util.Scanner;

public class DistribuirNotas {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);
        double[] notas = new double[]{10, 10, 10, 10};


        var aluno = new Alunos("Pedro", notas);

        System.out.println(aluno.nomeAluno + aluno.notasAluno.toString());
    }


}