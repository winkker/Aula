package ArreyAndCollections.colecoes;

import java.util.Objects;

public class Frutas {


    String nome;

    Frutas(String nome) {

        this.nome = nome;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Frutas frutas = (Frutas) o;

        return nome.equals(frutas.nome);
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }

    @Override
    public String toString() {
        return "Frutas{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
