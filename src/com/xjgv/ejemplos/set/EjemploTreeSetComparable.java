package com.xjgv.ejemplos.set;

import com.xjgv.ejemplos.modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        Set<Alumno> sa = new TreeSet<>();
        sa.add(new Alumno("Pato", 7));
        sa.add(new Alumno("Cata", 8));
        sa.add(new Alumno("Luci", 9));
        sa.add(new Alumno("Jano", 5));
        sa.add(new Alumno("Andres", 10));
        sa.add(new Alumno("Cris", 6));

        sa.forEach(System.out::println);
    }
}
