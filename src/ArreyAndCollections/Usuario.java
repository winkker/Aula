package ArreyAndCollections;

public class Usuario {


    String nome;
    String nivelDeAcesaso;


    public boolean equals(Object objeto) {

        if (objeto instanceof Usuario) {
            Usuario usuarioTeste = (Usuario) objeto;

            boolean nome = this.nome.equals(usuarioTeste.nome);
            boolean nivelDeAcesso = this.nivelDeAcesaso.equals(usuarioTeste.nivelDeAcesaso);

            return nome && nivelDeAcesso;

        } else {

            return false;
        }


    }


}
