package com.mrcruz;

public class Main {

    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.enqueue(new No("No 1"));
        fila.enqueue(new No("No 2"));
        fila.enqueue(new No("No 3"));
        fila.enqueue(new No("No 4"));

        System.out.println(fila);
        System.out.println(fila.dequeue());
        System.out.println(fila);
        fila.enqueue(new No("Último"));
        System.out.println(fila);
        System.out.println(fila.first());
    }
}
