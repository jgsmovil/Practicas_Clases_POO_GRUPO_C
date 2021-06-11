/*
 
 */
package Interfaces;

/**
 *
 * @author jjggs_000
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("03-Jun_2021","Num_Cliente:1");
        Admin admnin_1 = new Admin("JGS","abc");
        
        
        Imprimir copia = new Imprimir(admnin_1);
        copia.imprimirObjetoPorImpresora();
    }
    
}
