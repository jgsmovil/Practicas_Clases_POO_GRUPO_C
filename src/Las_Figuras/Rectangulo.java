/*
 Hereda de clase abstracta figura
 */
package Las_Figuras;

/**
 *
 * @author jjggs_000
 */
public class Rectangulo extends Figura {
    //declarar variables
    private double base;
    private double altura;
   //inicializar variables
public Rectangulo(double base,double altura){
    this.base=base;
    this.altura=altura;
    
}
//metodo para calcular perimetro del rectangulo
public double calcularPerimetro(){
    // 2 veces la suma de los dos lados contiguos
    return (base*2+altura*2);
}
//metodo para calcular area del rectangulo
public double calcularArea(){
    return base*altura;
}

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
