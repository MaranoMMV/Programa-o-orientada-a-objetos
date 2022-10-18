/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeinterface;

/**
 *
 * @author 0219013
 */
public class ClasseA implements Evento{

    @Override
    public String mostrarValor() {
        return "Estou na classe A";
    }
    
    @Override
    public String toString(){
        return mostrarValor();
        
        
    }


    
}
