package com.xjgv.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashsetBuscarDuplicado2 {
    public static void main(String[] args) {
        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Robalo",
        "Atún", "Lenguado", "Corvina", "Pejerrey"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        for(String pez: peces){

            if (unicos.add(pez) == false){
                System.out.println("El elemento : " + pez + " está duplicado");
                duplicados.add(pez);
            }
        }

        System.out.println(unicos);
        System.out.println("********************************");
        System.out.println(duplicados);
    }
}
