package com.xjgv.ejemplos.set;

import com.xjgv.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class EjemploArrayList {
    public static void main(String[] args) {
        List<Alumno> al = new ArrayList<>();
        System.out.println(al + ", size: " + al.size());
        System.out.println("Esta vacia: " + al.isEmpty());
        al.add(new Alumno("Pato", 7));
        al.add(new Alumno("Cata", 8));
        al.add(new Alumno("Luci", 9));
        al.add(2, new Alumno("Jano", 5));
        al.add(new Alumno("Andres", 10));
        al.add(new Alumno("Cris", 6));
        al.add(new Alumno("Cris", 7));
        System.out.println(al + ", size: " + al.size());
        System.out.println("Esta vacia: " + al.isEmpty());

    }
}
