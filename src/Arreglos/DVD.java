/*
 
 */
package Arreglos;

/**
 *
 * @author jjggs_000
 */
public class DVD extends Elemento {
    private String director;
    
    public DVD(String elTitulo,String elDirector, int time){
        super(elTitulo,time);
        director = elDirector;
    }
   public String toString(){
       String aux = super.toString();
       aux+= "El director es (DVD): "+director+"\n";
       return aux;
   } 
}
