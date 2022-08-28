package ArreyAndCollections.colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AulaSet {

    public static void main(String[] args) {


        Set<String> frutas = new HashSet<>(); // coleção sem ordenação
        Set<Integer> anos = new TreeSet<>(); // respeita a ordem de entrada

        frutas.add("Abacaxi");
        frutas.add("Manga");
        frutas.add("Mamao");
        frutas.add("uva");
        frutas.add("banana");
        frutas.add("Maca");
        frutas.add("xuxu");

        anos.add(1);
        anos.add(2);
        anos.add(3);
        anos.add(4);
        anos.add(5);
        anos.add(6);


        for (int aanos : anos) {

            System.out.println(aanos);


        }
        for (String ffrutas : frutas) {

            System.out.println(ffrutas);


        }
        System.out.println(frutas.size());

    }


}


