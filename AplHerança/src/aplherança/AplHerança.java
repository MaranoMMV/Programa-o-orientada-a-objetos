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
public class AplHerança {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Main é a ultima coisa que fazemos//
        // TODO code application logic here
        
         SuperGenerica sg = new SuperGenerica();
         System.out.println( sg );
         
        Generica g = new Generica();
         System.out.println( g );
         
         SubGenerica sub = new SubGenerica(" N ");
         System.out.println( sub );
    }
}
