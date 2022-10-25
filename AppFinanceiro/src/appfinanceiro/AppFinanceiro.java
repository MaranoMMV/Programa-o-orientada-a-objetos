/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appfinanceiro;

import clientes.Conta;

/**
 *
 * @author 0219013
 */
public class AppFinanceiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta cliente = new Conta();
        System.out.println("Hellow World");
        System.out.println( cliente );
        cliente.depositar(1500.0f);
        System.out.println( cliente );
        cliente.sacar(200.0f);
        System.out.println( cliente );
        
        
    }
    
}
