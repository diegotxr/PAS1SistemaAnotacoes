/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author GilmarJr
 */
public class EnderecoEUA implements AbstractEndereco {

    private String zipCode;
    private String rua;
    private String cidade;

    public EnderecoEUA(String rua, String cidade, String zipCode) {
        this.zipCode = zipCode;
        this.cidade = cidade;
        this.rua = rua;
    }

    public void Validar() {
        if (this.getZipCode().length() == 10) {
            if (this.getZipCode().charAt(5) == '-') {
                System.out.println("\nthe zip code is valid");
            } else {
                System.out.println("\nthe zip code is invalid");
            }
        } else {
            System.out.println("\nthe zip code is invalid");
        }
    }

    /**
     * @return the cep
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param cep the cep to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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
        dados += "\nStreet: " + getRua();
        dados += "\nCity: " + getCidade();
        dados += "\nZip Code: " + getZipCode();
        return dados;
    }

    @Override
    public void exibir() {
        System.out.println("" + toString());
    }
}
