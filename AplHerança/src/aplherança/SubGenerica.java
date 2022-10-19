/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplherança;

/**
 *
 * @author 0219013
 */
public class SubGenerica extends Generica {
    //Atributos
    private String digito;
    private String novaId;
    
    //Construtor
    public SubGenerica( String digito ){
        super();
        super.setId("\n Sub Genérica  ");
        this.digito = digito;
        this.novaId = super.getDocId() + " - " + digito;
    }

    /**
     * @return the digito
     */
    public String getDigito() {
        return digito;
    }

    /**
     * @return the novaId
     */
    public String getNovaId() {
        return novaId;
    }
    public String toString(){
        return "\n Nova identidade: " +
                super.getId() +
                this.getNovaId();
    }
}
