/*
 
 */
package Las_Figuras;

/**
 *
 * @author jjggs_000
 */
public class Circulo extends Figura{
    private double radio;
    
    public Circulo(double radio){
        this.radio=radio;
    }
      // se necesita (2*PI*radio)
    public double calcularPerimetro(){
        return 2*Math.PI*radio;
        
    }
    //la formula para determinar el area es (PI*r(2)) 
    public double calcularArea(){
        return Math.PI*(radio*radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
}
