package com.xjgv.ejemplos.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private Integer nota;

    public Alumno() {
    }

    public Alumno(String nombre, Integer nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return
                "Nombre='" + nombre + '\'' +
                ", Nota=" + nota;
    }

    @Override
    public int compareTo(Alumno a) {
        if (this.nombre == null){
            return 0;
        }
        return nombre.compareTo(a.getNombre());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Alumno alumno = (Alumno) o;

        if (!Objects.equals(nombre, alumno.nombre)) return false;
        return Objects.equals(nota, alumno.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }
}
