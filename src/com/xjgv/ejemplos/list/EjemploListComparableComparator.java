package com.xjgv.ejemplos.list;

import com.xjgv.ejemplos.modelo.Alumno;

import java.util.*;

import static java.util.Comparator.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {
        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato", 7));
        sa.add(new Alumno("Cata", 8));
        sa.add(new Alumno("Luci", 9));
        sa.add(new Alumno("Jano", 5));
        sa.add(new Alumno("Andres", 10));
        sa.add(new Alumno("Cris", 6));
        sa.add(new Alumno("Cris", 7));

        //Collections.sort(sa, (a,b) -> a.getNota().compareTo(b.getNota()));
        //sa.sort((a,b) -> a.getNota().compareTo(b.getNota()));
        sa.sort(comparing((Alumno::getNombre)).reversed());
        sa.forEach(System.out::println);
    }
}
