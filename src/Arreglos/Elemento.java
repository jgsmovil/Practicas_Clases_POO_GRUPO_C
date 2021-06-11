/*
 
 */
package Arreglos;

/**
 *
 * @author jjggs_000
 */
public class Elemento {
    
    private String titulo;
    private int duracion;
    private boolean loTengo;
    private String comentario;
    
    public Elemento(String elTitulo, int tiempo){
        titulo = elTitulo;
        duracion = tiempo;
        loTengo = false;
        comentario="";
    } 
    public String toString(){
        String aux = titulo+"("+duracion+"minutos)";
          if(loTengo)aux += "*";
             aux += ""+comentario+"\n";
             return aux;
    }
    
}
