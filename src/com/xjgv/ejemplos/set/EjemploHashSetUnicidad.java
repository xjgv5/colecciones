package com.xjgv.ejemplos.set;

import com.xjgv.ejemplos.modelo.Alumno;

import java.util.HashSet;
import java.util.Iterator;
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


        //iterando un elemento
        System.out.println("Iterando con un foreach ");
        for (Alumno a: sa){
            System.out.println(a.getNombre());
        }
        System.out.println("********************************");
        System.out.println("Iterando usando un while y un iterator");
        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }
        System.out.println("********************************");
        System.out.println("Iterando usanto stream");
        sa.forEach(System.out::println);
    }
}
