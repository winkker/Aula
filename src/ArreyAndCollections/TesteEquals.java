package ArreyAndCollections;

public class TesteEquals {





    public static void main(String[] args) {


        var usuario01 = new Usuario();
        var usuario02 = new Usuario();




        usuario01.nome = "Joao";
        usuario01.nivelDeAcesaso = "full";
        usuario02.nome = "Joao";
        usuario02.nivelDeAcesaso = "full";

        System.out.println(usuario01 == usuario02);
        System.out.println(usuario01.equals(usuario02));



    }




}
