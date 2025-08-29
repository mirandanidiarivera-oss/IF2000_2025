/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author miran
 */
public class Quiz_3 {
 public static void main(String[]args){
     
     int n = 8;
     
     for (int i = 1; i <=n; i++) {
         for (int j = 1; j <=n; j++) {
          if  (1 == 1 || j == 1 || j == n){
              System.out.print("*");     
     }
          else if (i == (n /2) + 1 && j == (n/2)+ 1){
             System.out.print("*");    
         }
          else{
             System.out.print("*");    
          }
 }
    System.out.println();
 }
}
}
