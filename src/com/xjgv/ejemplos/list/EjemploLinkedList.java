package com.xjgv.ejemplos.list;

import com.xjgv.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

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
        System.out.println(enlazada.get(3));
        Alumno alm = enlazada.remove(1);
        System.out.println("El alumno : " + alm.getNombre() + " ha sido removido");
        Alumno alm2 = enlazada.peekLast();
        enlazada.pollFirst();
        enlazada.forEach(System.out::println);
        enlazada.set(1, new Alumno("Carlos", 2));

        System.out.println("------------------------------");
        ListIterator<Alumno> li = enlazada.listIterator();

        while (li.hasNext()){
            System.out.println(li.next());
        }

        System.out.println("-------------------------------");
        while (li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}
