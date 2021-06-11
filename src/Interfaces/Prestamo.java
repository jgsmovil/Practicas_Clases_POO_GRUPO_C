/*
 Implementando en java class  el uso de multiples interfaces
 */
package Interfaces;

/**
 *
 * @author jjggs_000
 */

public class Prestamo implements Autor,Libro,Editorial {
    
   public void titulo(){
       System.out.println("El principito");
   } 
   public void nombre(){
       System.out.println("Antonio D Saint");
               
   }
    
}
