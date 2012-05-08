/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author GilmarJr
 */
public class EUAfactory implements Factory {

    public AbstractNumero criarNumero(String num) {
        return new NumeroEUA(num);
    }

    public AbstractEndereco criarEndereço(String cidade, String rua, String zipCode) {
        return new EnderecoEUA(cidade, rua, zipCode);
    }
}
