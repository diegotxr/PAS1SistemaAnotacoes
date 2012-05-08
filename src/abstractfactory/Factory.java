/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author GilmarJr
 */
public interface Factory {
    
     public AbstractNumero criarNumero(String num);
    
    public AbstractEndereco criarEndereço(String cidade,String rua,String cep);


      
    
}
