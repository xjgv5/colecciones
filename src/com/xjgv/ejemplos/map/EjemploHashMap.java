package com.xjgv.ejemplos.map;

import java.util.HashMap;
import java.util.Map;

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



        
    }
}
