

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
}


 
        
    
    
    
    
    
 
    
    
    

