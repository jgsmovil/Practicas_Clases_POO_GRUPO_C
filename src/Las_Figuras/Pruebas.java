/*
 
 */
package Las_Figuras;

/**
 *
 * @author jjggs_000
 */
public class Pruebas {

              //Practicas Clase POO   
    public static void main(String[] args) {
        //se crea el primer para la clase Rectangulo
        Rectangulo r1= new Rectangulo(2.0,4.0);
        
        System.out.println("RECTANGULOS");
        System.out.println("Perimetros");
        //Se calcula el perimetro del rectangulo
        System.out.println("El Perimetro del rectangulo es:"+r1.getBase()+"y altura"+r1.getAltura()+"es: "+r1.calcularPerimetro());
        
        //Se calcula el area del rectangulo
        System.out.println("El Area del rectangulo es:"+r1.getBase()+"y altura"+r1.getAltura()+"es: "+r1.calcularArea());
        
        // se declaran objetos y valores para la clase circulo
        //Se crea el primer objeto de la clase circulo
        Circulo c1= new Circulo(2);
        System.out.println("CIRCULOS");
        System.out.println("Perimetros");
        //se muestra el perimetro del circulo 
        System.out.println("El perimetro del circulo es: "+c1.getRadio()+":"+c1.calcularPerimetro());
        
        //se muestra el area del circulo 
        System.out.println("El area del circulo es: "+c1.getRadio()+":"+c1.calcularArea());
        
        
    }
    
}
