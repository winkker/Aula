package Classes_objetos;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.nome = "laptop";
        produto.preco = 2239.99f;
        produto.desconto = 0.95f;

        System.out.printf("O %s custa R$ %.2f com o desconto" +
                "",produto.nome, (produto.preco * produto.desconto));
    }
}