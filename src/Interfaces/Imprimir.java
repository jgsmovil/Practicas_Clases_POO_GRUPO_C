/*
 Desde esta java class se declara el metodo que se ejecutara
  desde la Interface misma q llamaremos "Imprimiendo"
 */
package Interfaces;

/**
 *
 * @author jjggs_000
 */
public class Imprimir {
    private Imprimiendo ob;
    
    public Imprimir(Imprimiendo ob){
        this.ob=ob;
    }
    
    public void imprimirObjetoPorImpresora(){
        System.out.println(this.ob.imprimir());
    }
    
}
