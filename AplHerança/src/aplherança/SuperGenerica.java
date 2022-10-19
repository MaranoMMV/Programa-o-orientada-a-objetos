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
public class SuperGenerica {
    // Atributos
    
        private String id;
    
    // Construtor
    
        SuperGenerica(){
            this.id = "Super Genérico";
        }
        
    // Métodos

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }



    @Override
    public String toString(){
        return "Nome = " + this.getId();
    }
}