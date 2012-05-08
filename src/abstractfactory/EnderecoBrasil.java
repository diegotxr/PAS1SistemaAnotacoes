/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author GilmarJr
 */
public class EnderecoBrasil implements AbstractEndereco {

    private String cep;
    private String rua;
    private String cidade;

    public EnderecoBrasil(String rua, String cidade, String cep) {
        this.cep = cep;
        this.cidade = cidade;
        this.rua = rua;
    }

    public void Validar() {
        if (this.getCep().length() == 9) {
            if (this.getCep().charAt(5) == '-') {
                System.out.println("\no cep é valido");
            } else {
                System.out.println("\no cep é invalido");
            }
        } else {
            System.out.println("\no cep é invalido");
        }
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        String dados = "";
        dados += "\nRua: " + getRua();
        dados += "\nCidade: " + getCidade();
        dados += "\nCEP: " + getCep();
        return dados;
    }

    @Override
    public void exibir() {
        System.out.println("" + toString());
    }
}
