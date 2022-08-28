package ArreyAndCollections;

public class Alunos {

    String nomeAluno;
    double[] notasAluno = new double[4];


    Alunos(String nomeAluno, double[] notasAluno) {
        if (nomeAluno != null && notasAluno != null) {

            this.nomeAluno = nomeAluno;
            System.arraycopy(notasAluno, 0, this.notasAluno, 0, 4);


        }


    }
}
//}