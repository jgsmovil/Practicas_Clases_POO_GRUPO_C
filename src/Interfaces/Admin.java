/*
 
 */
package Interfaces;

/**
 *
 * @author jjggs_000
 */
public class Admin implements Imprimiendo {
    private  String usuario;
    private  String pass;
    
    public Admin(String usuario,String pass){
        this.usuario=usuario;
        this.pass=pass;
        
    } 
    public String getPass(){
        return pass;
    }
    public void setPass(){
        this.pass=pass;
    }
    public String getUsuario(){
           return usuario;
    }
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }

    @Override
    public String imprimir() {
        return this.usuario+"*"+this.pass;
    }
}
