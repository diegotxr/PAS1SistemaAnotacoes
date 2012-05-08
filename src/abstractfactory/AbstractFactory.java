/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author GilmarJr
 */
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factory fabrica = new BrasilFactory();
        AbstractNumero numero = fabrica.criarNumero("3233-8852");
        numero.exibir();
        AbstractEndereco residencia = fabrica.criarEndereço("João Pessoa", "Eptácio Pessoa", "12345-123");
        residencia.exibir();
        residencia.Validar();


    }
}
