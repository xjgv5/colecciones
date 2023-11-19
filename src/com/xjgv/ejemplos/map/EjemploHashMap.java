package com.xjgv.ejemplos.map;

import java.util.*;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String, String> persona = new HashMap<>();
        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("email", "john.doe@email.com");
        persona.put("edad", "30");

        String nombre, apellido, email, edad;
        nombre = persona.get("nombre");
        apellido = persona.get("apellido");
        System.out.println("nombre : " + nombre);
        System.out.println("apellido : " + apellido);

        String valorApellido = persona.remove("apellido");
        System.out.println("eliminado : " + valorApellido);
        System.out.println(persona);

        boolean b = persona.containsKey("apellido");
        System.out.println("b = " + b);

        b = persona.containsValue("John");
        System.out.println("contiene John ? : " + b);

        System.out.println("--------------------------------");
        Collection<String> valores = persona.values();
        valores.forEach(System.out::println);

        System.out.println("--------------------------------");
        Set<String> llaves = persona.keySet();
        llaves.forEach(System.out::println);

        System.out.println("---------------------------------");
        for (Map.Entry<String, String> par: persona.entrySet()){
            System.out.println(par.getKey() + " => " + par.getValue());
        }

        System.out.println("---------------------------------");

        for (String llave : persona.keySet()){
            String valor = persona.get(llave);
            System.out.println(llave + " => " + valor);
        }

        System.out.println("---------------------------------");
        persona.forEach((llave, valor) -> {
            System.out.println(llave + " => " + valor);
        });

        System.out.println("-----------------------------------");
        System.out.println("total : " + persona.size());
        System.out.println("Contiene elementos : " + !persona.isEmpty());
   

    }
}
