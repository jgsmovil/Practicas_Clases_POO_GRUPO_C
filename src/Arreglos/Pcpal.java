/*
   Declarar arreglo que se utilice como paso de parametros 
 */
package Arreglos;

/**
 *
 * @author jjggs_000
 */
public class Pcpal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int datos[]={1,2,3,4,5};
     //pasar el arreglo al metodo sum
     sum(datos);
              
    }
    public static void sum(int[]datos){
        //Obtener la suma de los valores del arreglo "datos"
        int sum=0;
           for(int i=0;i<datos.length;i++)
               sum+=datos[i];
           System.out.println("Suma de los valores del arreglo DATOS: "+sum);
    }
    
    
}
