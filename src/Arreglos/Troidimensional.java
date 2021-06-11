/*
 
 */
package Arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author jjggs_000
 */
public class Troidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String valor;
        //filas-semanas (3),columnas-empleado(2),profundidad-productos(5)
        int Arreglo_Datos[][][]= new int[3][2][5];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<5;k++){
                    valor=JOptionPane.showInputDialog("Semana: " +(i+1)+" del vendedor:"+(j+1)+"del producto: "+(k+1));
                    Arreglo_Datos[i][j][k]=Integer.parseInt(valor);                }
              }
          }
        
      }
  }

