/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author GilmarJr
 */
public class NumeroEUA  implements AbstractNumero{
   
    private String numero;
    
    public NumeroEUA(String n){
        this.numero=n;
    }
    
    public void exibir(){
        System.out.println("(1) "+this.getNumero());
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
   
}
