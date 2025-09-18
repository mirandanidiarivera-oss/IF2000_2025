package com.mycompany.if2000_introduccionprogra;


import logic.Ejercicios_Semana_PracticasEnClase;
import logic.Quiz_3;
import logic.Lab_1;
import domain.Lab_2; 
import domain.*;
import java.time.LocalDate;

public class IF2000_introduccionProgra {
    public static void main(String[] args) {
        // ======================
        // Ejercicios de práctica
        // ======================
        Client c1 = new Client("Ana",  "1", "8888-8888", "San José");
        Client c2 = new Client("Luis", "2", "9999-9999", "Heredia");

        Bank bank1 = new Bank("Banco Nacional");
        Bank bank2 = new Bank("Banco de Costa Rica");

        Savings  acc1 = new Savings("A001", 1000, c1, LocalDate.now(), 6, 0.02);
        Checking acc2 = new Checking("C001",  500, c2, 0.01);

        bank1.addAccount(acc1);
        bank2.addAccount(acc2);

        LogBook log = new LogBook();

        acc1.deposit(200);
        log.addEvent("Deposit", acc1);

        acc1.calculateInterest();
        log.addEvent("Interest Applied", acc1);

        Bank.sinpe(acc1, acc2, 300, bank1, bank2);
        log.addEvent("SINPE Transfer (From)", acc1);
        log.addEvent("SINPE Transfer (To)",   acc2);

        log.showEvents();
        
        
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

        // ======================
        // Quiz 3
        // ======================
        System.out.println("\n=== Quiz 3 ===");
        Quiz_3 q = new Quiz_3();
        q.Ejer_quiz();

        // ======================
        // Laboratorio 1
        // ======================
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

        // ======================
        // Laboratorio 2
        // ======================
        System.out.println("\n=== Lab 2 ===");
        Lab_2 L = new Lab_2();

        L.ejercicio13();      
        L.ejercicio14();         
        L.ejercicio15(2, 5);    
        L.ejercicio16();        
        L.ejercicio17();        
        L.ejercicio18();         
        L.ejercicio19();         
        L.ejercicio20();         
        L.ejercicio21();         
        L.ejercicio22();         
        L.ejercicio24();        
        L.ejercicio25();         
        L.ejercicio26();         
        L.ejercicio27();         

        System.out.println("\n=== Fin del programa ===");  
        
        
        
    }
}