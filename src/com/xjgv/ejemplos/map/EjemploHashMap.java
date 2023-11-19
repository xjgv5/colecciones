package com.xjgv.ejemplos.map;

import java.util.*;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String, Object> persona = new HashMap<>();
        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("email", "john.doe@email.com");
        persona.put("edad", 30);

        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        persona.put("direccion", direccion);

        String nombre, apellido;
        nombre = (String) persona.get("nombre");
        apellido = (String) persona.get("apellido");
        System.out.println("nombre : " + nombre);
        System.out.println("apellido : " + apellido);

        String valorApellido = (String) persona.remove("apellido");
        System.out.println("eliminado : " + valorApellido);
        System.out.println(persona);

        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        String barrio = direccionPersona.getOrDefault("barrio", "La playa");
        boolean b = persona.containsKey("apellido");
        System.out.println("b = " + b);

        b = persona.containsValue("John");
        System.out.println("contiene John ? : " + b);

        System.out.println("--------------------------------");
        Collection<Object> valores = persona.values();
        valores.forEach(System.out::println);

        System.out.println("--------------------------------");
        Set<String> llaves = persona.keySet();
        llaves.forEach(System.out::println);

        System.out.println("---------------------------------");
        for (Map.Entry<String, Object> par: persona.entrySet()){
            System.out.println(par.getKey() + " => " + par.getValue());
        }

        System.out.println("---------------------------------");

        for (String llave : persona.keySet()){
            Object valor = persona.get(llave);
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
