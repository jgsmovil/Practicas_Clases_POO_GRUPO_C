/*
 
 */
package Interfaces;

/**
 *
 * @author jjggs_000
 */
public class Cliente implements Imprimiendo{
    private String rut;
    private String nombre;
    
    public Cliente(String rut, String nombre){
        this.rut=rut;
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getRut(){
        return rut;
    }
    public void setRut(String rut){
        this.rut=rut;
    }

    @Override
    public String imprimir() {
       return this.nombre+"*"+this.rut;        
    }
    
}
