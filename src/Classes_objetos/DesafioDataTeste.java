package Classes_objetos;

import java.util.Scanner;

public class DesafioDataTeste {

    public static void main(String[] args) {

        var data1 = new DesafioData();
        var data2 = new DesafioData();

        Scanner scan = new Scanner(System.in);

        //Recebe data 1
        System.out.println("Digite o dia ");
        data1.dia = scan.nextInt();
        System.out.println("Digite o mes ");
        data1.mes = scan.nextInt();
        System.out.println("Digite o ano ");
        data1.ano = scan.nextInt();
        //Recebe data 2
        System.out.println("Digite o dia ");
        data2.dia = scan.nextInt();
        System.out.println("Digite o mes ");
        data2.mes = scan.nextInt();
        System.out.println("Digite o ano ");
        data2.ano = scan.nextInt();



        System.out.printf("Paulo nasceu %s e Laura nasceu %s",
                data1.dataFormatada(), data2.dataFormatada());



    }
}
