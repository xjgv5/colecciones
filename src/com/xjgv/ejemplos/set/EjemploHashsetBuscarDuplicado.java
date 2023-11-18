package com.xjgv.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashsetBuscarDuplicado {
    public static void main(String[] args) {
        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Robalo",
        "Atún", "Lenguado"};

        Set<String> unicos = new HashSet<>();
        for(String pez: peces){

            if (!unicos.add(pez.toUpperCase())){
                System.out.println("El elemento : " + pez + " está duplicado");
            }
        }

        System.out.println(unicos);
    }
}
