/*
 Clase Padre
 */
package Unidad_3;

/**
 *
 * @author jjggs_000
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    
    // se declara un constructor
public Persona(String nombre, String apellidos, int edad){
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.edad=edad;
    
          //Tarea:agragar dos atributos mas
}    
public String getNombre(){
    return nombre;
}

public String getApellidos(){
    return apellidos;
}
public int getEdad(){
    return edad;
}    
    
    
}
