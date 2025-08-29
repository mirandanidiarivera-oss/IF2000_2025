
package logic;

/**
 *
 * @author miran
 */
public class Quiz_3 {

    public void Ejer_quiz() {
        int filas = 5;
        int columnas = 9;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                if (i == 0 || i == filas - 1) {
                 
                    System.out.print("* ");
                } else if (j == 0 || j == columnas - 1) {
               
                    System.out.print("* ");
                } else if (i == filas / 2 && j == columnas / 2) {
                  
                    System.out.print("* ");
                } else {
                  
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
   