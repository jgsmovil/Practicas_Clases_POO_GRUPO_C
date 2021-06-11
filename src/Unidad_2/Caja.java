/*
 sobecarga de metodos
 */
package Unidad_2;

/**
 *
 * @author jjggs_000
 */
public class Caja {

    //declaracion de variables
    double alto;
    double ancho;
    double largo;

    public  Caja(double a, double b, double c) {
        alto = a;
        ancho = b;
        largo = c;
    }

    /*public Caja() {
        alto = -1;
        ancho = -1;
        largo = -1;
    }*/
    Caja(double obj){
        alto=obj.alto;
        ancho=obj.ancho;
        largo=obj.largo;
    } 

    /*public  Caja(double longitud) {
        alto = ancho = largo = longitud;
    }*/

}
