/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

/**
 *
 * @author Mathieu VINCENT
 */
public class TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Patisserie patisserie = new Patisserie();
        
        Thread producteur = new Thread(new Patissier(patisserie));
        Thread consommateur1 = new Thread(new Client(patisserie));
        Thread consommateur2 = new Thread(new Client(patisserie));
        Thread consommateur3 = new Thread(new Client(patisserie));
        Thread consommateur4 = new Thread(new Client(patisserie));
        
        consommateur1.start();
        consommateur2.start();
        consommateur3.start();
        consommateur4.start();
        producteur.start();        
    }
    
}
