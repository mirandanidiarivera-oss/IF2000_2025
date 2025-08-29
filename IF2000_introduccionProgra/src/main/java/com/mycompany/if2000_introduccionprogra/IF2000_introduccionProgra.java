package com.mycompany.if2000_introduccionprogra;

import logic.Ejercicios_Semana_PracticasEnClase;
import logic.Quiz_3;
import logic.Lab_1;

public class IF2000_introduccionProgra {
    public static void main(String[] args) {
        // Ejercicios de práctica en clase
        Ejercicios_Semana_PracticasEnClase ej = new Ejercicios_Semana_PracticasEnClase();

        System.out.println("=== Figuras ===");
        System.out.println("Figura A:");
        ej.tarea_figura_A(5);
        System.out.println();

        System.out.println("Figura B:");
        ej.tarea_figura_B(5);
        System.out.println();

        System.out.println("Figura C:");
        ej.tarea_figura_C(5);
        System.out.println();

        ej.ejercicioF();

        System.out.println("\n=== Quiz 3 ===");
        Quiz_3 q = new Quiz_3();
        q.Ejer_quiz();

        System.out.println("\n=== Lab 1 ===");
        Lab_1 lb = new Lab_1();

        lb.ejercicio1();
        lb.ejercicio2();
        lb.ejercicio3();
        lb.ejercicio4();
        lb.ejercicio5();
        lb.ejercicio6();
        lb.ejercicio7_Pulsaciones();
        lb.ejercicio8();
        lb.ejercicio9();
        lb.ejercicio10();
        lb.ejercicio11_generarPrimos();
        lb.ejercicio12();

        System.out.println("\n=== Fin del programa ===");
    }
}







