package com.mrcruz;

public class Main {

    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.enqueue("No 1");
        fila.enqueue("No 2");
        fila.enqueue("No 3");
        fila.enqueue("No 4");

        System.out.println(fila);
        System.out.println(fila.dequeue());
        System.out.println(fila);
        fila.enqueue("Último");
        System.out.println(fila);
        System.out.println(fila.first());
    }
}
