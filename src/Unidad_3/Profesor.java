/*
 Clase hija (subclase)
Herencia: (se hace uso tanto de atributos y sus metodos
1.- Identificar el nombre de la Java class a la cual se accede
2.- Escribir la palabra extends 
3.-Palabras reservadas a utilizar comunmente (super (invocar los atributos), @override (sobrescribir metodos)
 */
package Unidad_3;

/**
 *
 * @author jjggs_000
 */
public class Profesor extends Persona{
    
    //atributos especificos de esta clase (subclase)
    private String IdProfesor;
    //Crear constructor que al menos incluya los parametros de la clase Padre
    public Profesor(String nombre, String apellidos, int edad){
        //con super se accede a los parametros de la clase padre
        super(nombre,apellidos,edad);
        IdProfesor="Desconocido";
        
    }
    public void setIdProfesor(String IdProfesor){
        this.IdProfesor=IdProfesor;
        
    }
    
    public String getIdProfesor(){
    return IdProfesor;
}
    public void mostrarNombreApellidosYCarnet(){
        // nombre="Alfredo"; (debe marcar ERROR)
        System.out.println("Profesor de nombre:  "+getNombre()+""+getApellidos()+
                "\ncon Id de profesor:  "+getIdProfesor());
        
        //concatenar Message para que muestre en cuadro de dialogo
        //La informacion del profesor
        
    }
    
}
