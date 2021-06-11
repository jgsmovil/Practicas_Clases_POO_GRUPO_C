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
public class Multid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declarar e inicializar array 2D
        int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };
 
        // imprimir array 2D
        for (int i=0; i< 3 ; i++)
        {
            for (int j=0; j < 3 ; j++)
                System.out.print(arr + " ");
 
            System.out.println();
        }
       }
    }
    
