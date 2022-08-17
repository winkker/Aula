package Classes_objetos;

public class Produto {

    String nome;
    double preco;
   private static double desconto = 0.25f;

    double precoComDesconto(){

        return preco * ( 1 - desconto );
    }

    static double NewDesconto(double newdesconto){

        desconto = newdesconto;

        return desconto;

    }
}
