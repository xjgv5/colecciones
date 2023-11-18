package com.xjgv.ejemplos.set;

import com.xjgv.ejemplos.modelo.Alumno;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        Set<Alumno> sa = new HashSet<>();
        sa.add(new Alumno("Pato", 7));
        sa.add(new Alumno("Cata", 8));
        sa.add(new Alumno("Luci", 9));
        sa.add(new Alumno("Jano", 5));
        sa.add(new Alumno("Andres", 10));
        sa.add(new Alumno("Cris", 6));
        sa.add(new Alumno("Cris", 7));


        sa.forEach(System.out::println);
    }
}
