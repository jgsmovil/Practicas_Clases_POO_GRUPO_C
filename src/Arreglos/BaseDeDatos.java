/*
 
 */
package Arreglos;

import java.util.ArrayList;

/**
 *
 * @author jjggs_000
 */
public class BaseDeDatos {

    private ArrayList<Elemento> elementos;
    protected String auxStr;

    public BaseDeDatos() {
        elementos = new ArrayList<Elemento>();
    }

    public void agregarElemento(Elemento elElemento) {
        elementos.add(elElemento);
    }

    public String toString() {
        auxStr = "Contenido de la Base de Datos\n";
        auxStr += elementos.toString();
        return auxStr;
    }

}
