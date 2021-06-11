/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author jjggs_000
 */
public class nDimen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] numeros;
        int i, j;

        numeros = new int[2][3];
       for (i = 0; i<numeros.length;i++){
            for (j =0;j<numeros[i].length;j++) {
                numeros[i][j]=0;
                
            }
            
            
        }
       for (i =0;i<numeros.length;i++) {
            for (j =0;j<numeros[i].length;j++) {
                System.out.println(numeros[i][j] + "");

            }
            System.out.println("\n");
        
       }
    }
}
    
    

