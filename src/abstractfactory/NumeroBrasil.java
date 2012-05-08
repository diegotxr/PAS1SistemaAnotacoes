/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author GilmarJr
 */
public class NumeroBrasil implements AbstractNumero{
    
    private String numero;
    
    public NumeroBrasil(String num){
        this.numero=num;
    }
    
    public void exibir(){
        System.out.print("Número: (55) "+this.getNumero());
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
