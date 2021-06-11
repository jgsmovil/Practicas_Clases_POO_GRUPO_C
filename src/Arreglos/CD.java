/*
 
 */
package Arreglos;

/**
 *
 * @author jjggs_000
 */
public class CD  extends Elemento{
    private String interprete;
    private int numeroDeTemas;
    
    public CD(String elTitulo,String elInterprete,int temas, int tiempo){
    super(elTitulo,tiempo);
    
    interprete = elInterprete;
    numeroDeTemas = temas;
        
    }
    public String toString(){
        String aux = super.toString();
        aux+= "El Interprete es (CD): "+interprete+"\n";
        aux+= "Los temas son: "+numeroDeTemas+"\n";
        return aux;
        
    }
    
    
}
