/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jjggs_000
 */
public class Main {
    private BaseDeDatos db;
    
    public void DemoBaseDeDatos(){
        System.out.println("Iniciando DEMO");
        db = new BaseDeDatos();
        Elemento elem;
               //Agregando CD's
        elem = new CD("Boleros","Trio",14,35);
        db.agregarElemento(elem);
        elem = new CD("Country","Boys",10,25);
        db.agregarElemento(elem);
              //Agregando DVD's
        elem = new DVD("Rey Arturo","Steven",100);
        db.agregarElemento(elem);
        elem = new DVD("Sahara","Daniels",120);
        db.agregarElemento(elem);
        
           //Agregando Libros
        elem = new Libro("Star Wars",1800);
        db.agregarElemento(elem);
        elem = new Libro("Las mil y una noche",1500);
        db.agregarElemento(elem);
        
        System.out.println(db.toString());
        System.out.println("Terminando DEMO");
    }
    
    
}
