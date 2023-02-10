package com.mrcruz;
public class Main {

    public static void main(String[] args) {

        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.add("A");
        lista.add("B");
        lista.add("C");

        System.out.println(lista);
        lista.add("D");
        System.out.println(lista);
        System.out.println(lista.get(1));
        System.out.println(lista.remove(3));
        System.out.println(lista);

    }
}
