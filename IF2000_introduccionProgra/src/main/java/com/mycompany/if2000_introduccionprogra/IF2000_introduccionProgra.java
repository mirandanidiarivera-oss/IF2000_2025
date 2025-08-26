

package com.mycompany.if2000_introduccionprogra;

import logic.Ejercicios_Semana_PracticasEnClase;

/**
 *
 * @author miran
 */
/**public class IF2000_introduccionProgra {

    public static void main(String[] args) {
       String Name = "Nidia";
       System.out.println("Hello world");
       System.out.println("Name:"+Name);
        
    } 
}
*/



public class IF2000_introduccionProgra {
    public static void main(String[] args) {
        Ejercicios_Semana_PracticasEnClase ej = new Ejercicios_Semana_PracticasEnClase();

        System.out.println("Figura A:");
        ej.tarea_figura_A(5);
        System.out.println(); // Línea en blanco para separar

        System.out.println("Figura B:");
        ej.tarea_figura_B(5);
        System.out.println(); // Línea en blanco para separar

        System.out.println("Figura C:");
        ej.tarea_figura_C(5);
        System.out.println(); // Línea final
        
        
        
        ej.ejercicioF();
    }
}


