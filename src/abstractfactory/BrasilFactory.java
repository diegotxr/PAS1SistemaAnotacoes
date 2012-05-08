/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author GilmarJr
 */
public class BrasilFactory implements Factory{
    
     public AbstractNumero criarNumero(String num){
        return new NumeroBrasil(num);
    }
    
    public AbstractEndereco criarEndereço(String cidade,String rua,String cep){
        return new EnderecoBrasil(cidade,rua,cep);
    }
    
}
