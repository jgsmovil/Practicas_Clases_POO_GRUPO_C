/*
 Implementando en java class  el uso de multiples interfaces
 */
package Interfaces;

/**
 *
 * @author jjggs_000
 */

public class Prestamo implements Autor,Libro,Editorial {
    
   @Override
   public void titulo(){
       System.out.println("Eclipse");
   } 
   @Override
   public void nombre(){
       System.out.println("Stephenie Meye");
               
   }
    
}
