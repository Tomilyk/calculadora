package com.tomilyk.calculadora;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Alumno {
    int id;
    String matricula;
    String nombre;
    String apellido;
    String curso;
    int calificacion;
    int edad;

    Alumno(int id, String matricula, String nombre, String apellido, String curso, int calificacion, int edad) {
        this.id = id;
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " (" + curso + ", " + calificacion + ", " + edad + ")";
    }
}

@RestController
@RequestMapping("/array")
public class SortArray {
    @GetMapping("/alumnos")
    public static String lista() {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno(1, "12315463", "Pedro Antonio", "Morales Gonzalez", "Microservicios", 9, 35));
        listaAlumnos.add(new Alumno(2, "12315463", "Juan Manuel", "Rorigues Saro", "Microservicios", 9, 35));
        listaAlumnos.add(new Alumno(3, "12315463", "Rodolfo", "Loez Silva", "Microservicios", 9, 35));
        listaAlumnos.add(new Alumno(4, "12315463", "Jose", "Garrido Ramirez", "Microservicios", 9, 35));
        listaAlumnos.add(new Alumno(5, "12315463", "Nigue Angel", "Torres Moreno", "Microservicios", 9, 35));
        listaAlumnos.add(new Alumno(6, "12315463", "Francisco", "Vera Mila", "Microservicios", 9, 36));
        listaAlumnos.add(new Alumno(7, "12315463", "Maria Antonieta", "Jimenez Gomez", "Microservicios", 9, 35));
        listaAlumnos.add(new Alumno(8, "12315463", "Tere Angela", "Fernandez Gutierrez", "Microservicios", 9, 35));
        listaAlumnos.add(new Alumno(9, "12315463", "Beatriz", "Lima Limon", "Microserzicios", 9, 35));
        listaAlumnos.add(new Alumno(10, "12315463", "Sebastian", "Duran Duarte", "Microservicios", 9, 35));
        listaAlumnos.add(new Alumno(11, "12315463", "Gregorio", "Ortiz Mora", "Microservicios", 9, 35));
        listaAlumnos.add(new Alumno(12, "12315463", "Irma", "Muños Avila", "Microservicios", 9, 3));
        listaAlumnos.add(new Alumno(13, "12315463", "Alejandro", "Coronel Melendez", "Microservicios", 9, 35));
        listaAlumnos.add(new Alumno(14, "12315463", "Karen Berenice", "Ventura Gonzalez", "Microservicios", 9, 35));
        listaAlumnos.add(new Alumno(15, "12315463", "Nicolas Isidro", "Garcia Pimienta", "Microservicios", 9, 35));
        listaAlumnos.add(new Alumno(16, "12315463", "Liliana Lautar", "Martinez Lopez", "Microserviciod", 9, 35));

        // Ordenar por apellido
        Collections.sort(listaAlumnos, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno a1, Alumno a2) {
                return a1.apellido.compareTo(a2.apellido);
            }
        });
        String salida="";
        for (Alumno idx: listaAlumnos) {
            salida += idx.toString() + "\n";
        }
        return salida;
    }
}
