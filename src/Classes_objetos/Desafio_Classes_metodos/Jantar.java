package Classes_objetos.Desafio_Classes_metodos;

public class Jantar {
    public static void main(String[] args) {

//      Instancia 3 comedas
        var macarrao = new Comida("Macarrao", 0.450f);
        var queijo = new Comida("Queijo", 0.55f);
        var molho = new Comida("Molho", 0.100f);

//      Instancia 1 pessoa

        var joao = new Pessoa("Joao", 75.3f);

        System.out.println(joao.peso);
        joao.Comer(macarrao);
        System.out.println(joao.peso);
        joao.Comer(queijo);
        System.out.println(joao.peso);
        joao.Comer(molho);
        System.out.println(joao.peso);
    }
}
