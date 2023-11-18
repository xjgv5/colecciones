package com.xjgv.ejemplos.set;

import com.xjgv.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size: " + enlazada.size());
        System.out.println("Esta vacia: " + enlazada.isEmpty());
        enlazada.add(new Alumno("Pato", 7));
        enlazada.add(new Alumno("Cata", 8));
        enlazada.add(new Alumno("Luci", 9));
        enlazada.add(new Alumno("Jano", 5));
        enlazada.add(new Alumno("Andres", 10));
        enlazada.add(new Alumno("Cris", 6));
        enlazada.add(new Alumno("Cris", 7));

        enlazada.addFirst(new Alumno("Luca", 9));
        enlazada.addLast(new Alumno("Jere", 7));
        System.out.println(enlazada + "\n" + "size: " +  enlazada.size());

        System.out.println(enlazada.getFirst());
        System.out.println(enlazada.getLast());
   
    }
}
