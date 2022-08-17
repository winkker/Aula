package Classes_objetos;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.nome = "laptop";
        produto.preco = 2239.99f;


        var produto2 = new Produto();
        produto2.nome = "Caneta preta";
        produto2.preco = 12.56;

        Produto.NewDesconto(0.30);


        System.out.printf("O %s custa R$ %.2f com o desconto" +
                "",produto.nome, produto.precoComDesconto());
        System.out.printf("O %s custa R$ %.2f com o desconto" +
                "",produto2.nome, produto2.precoComDesconto());




    }
}
