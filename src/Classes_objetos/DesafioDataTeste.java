package Classes_objetos;

import java.util.Scanner;

public class DesafioDataTeste {

    public static void main(String[] args) {

        var dataPaulo = new DesafioData();
        var dataLaura = new DesafioData();

        Scanner scan = new Scanner(System.in);

        //Recebe data Paulo
        System.out.println("Digite o dia de nascimento de Paulo");
        dataPaulo.dia = scan.nextInt();
        System.out.println("Digite o mes de nascimento de Paulo");
        dataPaulo.mes = scan.nextInt();
        System.out.println("Digite o ano de nascimento de Paulo");
        dataPaulo.ano = scan.nextInt();
        //Recebe data Laura
        System.out.println("Digite o dia de nascimento de Laura");
        dataLaura.dia = scan.nextInt();
        System.out.println("Digite o mes de nascimento de Laura");
        dataLaura.mes = scan.nextInt();
        System.out.println("Digite o ano de nascimento de Laura");
        dataLaura.ano = scan.nextInt();



        System.out.printf("Paulo nasceu %d/%d/%d e laura nasceu %d/%d/%d",
                dataPaulo.dia, dataPaulo.mes, dataPaulo.ano, dataLaura.dia,
                dataLaura.mes, dataLaura.ano);



    }
}
