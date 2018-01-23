/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mathieu VINCENT
 */
public class Patissier implements Runnable {

    private Patisserie patisserie;
    
    public Patissier(Patisserie patiserie) {
        this.patisserie = patiserie;
    }
    
    @Override
    public void run() {
        depose();
    }
    
    public void depose() {
        int compteur = 0;
        try {
            while(compteur < 10) {
                System.out.println("Patissier : Ajout d'un gateau");
                patisserie.depose(new Gateau());

                Thread.sleep(1000);

                compteur++;
            }
        } catch (InterruptedException e) {
            System.out.println("Patissier : Interruption du sleep");
        }
    }
}
