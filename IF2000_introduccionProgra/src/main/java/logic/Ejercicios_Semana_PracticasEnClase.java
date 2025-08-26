

package logic;

/**
 **************
 *            *
 *            * 
 *            *
 *            *
 *            *
 **************
 */
public class Ejercicios_Semana_PracticasEnClase {
   
    public Ejercicios_Semana_PracticasEnClase (){
     
            
        }
      
public void quizz_B_piramide(int n){
    for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=(n-i); j++) {
                System.out.print(" ");
            }//end for interno1
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("*");
            }//end for interno2
            System.out.println(" ");
        }//end for externo
}
    
 public void tarea_figura_A(int n){
    for (int row = 0; row < n; row++) {
        for (int col = 0; col < n; col++) {
            if (row == 0 || row == n - 1) {
                System.out.print("*");
            } else {
                if (col == 0 || col == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
}       

public void tarea_figura_B(int n) {
    for (int row = 0; row < n; row++) {
        for (int space = 0; space < row; space++) {
            System.out.print(" ");
        }
        for (int star = 0; star < n - row; star++) {
            System.out.print("*");
        }
           System.out.println();
    }
}

public void tarea_figura_C(int n) {
    for (int row = n; row >= 1; row--) {
        for (int col = 0; col < row; col++) {
            System.out.print("*");
        }
          System.out.println(); 
    }
}


public void ejercicioF() {
String [][] tablero = new String [8][8];
System.out.println("Ejercicio F: Tablero con fichas N y R");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    tablero[i][j] = "N";
                } else {
                    tablero[i][j] = "R";
                }
            }
        }
for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
        
}

















 
    
    
    
    
    
    
 
    
  
    

