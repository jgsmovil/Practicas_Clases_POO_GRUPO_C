/*
 
 */
package Arreglos;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author jjggs_000
 */
public class ContarVocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[]vocales = new int[5];
    
    String frase =JOptionPane.showInputDialog(null,"Introduce una frase","Contar el numero de vocales",JOptionPane.QUESTION_MESSAGE);
    char caracter;
    //con el for se hace el recorrido por el total de elementos en el objeto
    for(int i=0;i<frase.length();i++){
      //Convertir elcaracter que se paso como parametro a minusculas
      //Devolver el valor de caracter que sea igual a caracter situado en la 
      //posicion indicada por index (indice)
      //la variable caracter es la que se manejara en el switch
      caracter=Character.toLowerCase(frase.charAt(i));
      switch(caracter){
          case 'a': vocales[0]++;
                    break;
          case 'e': vocales[1]++;
                    break;
          case 'i': vocales[2]++;
                    break;
          case 'o': vocales[3]++;
                    break;
          case 'u': vocales[4]++;
                    break;
                    default:
                    break;
                    
                   
      }
      
      
      
    }
    //Se declara objeto para mostrar total de vocales en la frase introducida
    JTextArea textArea= new JTextArea("");
     //Añadir el texto al final del contenido del textarea
     
     textArea.append("Vocal\tVeces\n");
     textArea.append("****************\n");
     textArea.append("a\t"+vocales[0]+"\n");
     textArea.append("e\t"+vocales[1]+"\n");
     textArea.append("i\t"+vocales[2]+"\n");
     textArea.append("o\t"+vocales[3]+"\n");
     textArea.append("u\t"+vocales[4]+"\n");
     
     JOptionPane.showMessageDialog(null,textArea,"Apariciones vocales"
             ,JOptionPane.INFORMATION_MESSAGE);
         

    }
    
}
