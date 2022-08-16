package EstruturasDeRepeticao;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero, contador ;

        System.out.println("Digite os numeros a serem somados, " +
                " /n caso deseje enserrar o programa digite um numero negativo");
        numero =  scan.nextInt();
        contador = numero;
        while (numero > 0){

            System.out.println("Digite o proximo numero");
            numero = scan.nextInt();
            contador += numero;
            System.out.printf("O total até agora: %d", contador );
            System.out.println("");

        }
        System.out.println("O total é: " + contador);
    }
}
