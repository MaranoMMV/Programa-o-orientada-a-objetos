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
public class Generica extends SuperGenerica {
    // Atributo
    private int docId;
    // Construtor
    public Generica(){
        super();
    this.docId = 123456789; 
    }
    // Métodos
    /**
     * @return the docId
     */
    public int getDocId() {
        return docId;
    }

    /**
     * @param docId the docId to set
     */
    public void setDocId(int docId) {
        this.docId = docId;
    }
    
    
    @Override
    public String toString(){
    return "\n Id com documento " +
            super.toString() + 
            "\n Doc num: " + this.getDocId();
    }
}