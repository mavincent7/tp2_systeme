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
        boolean fullStock = false;
        try {
            while(!fullStock) {
                if(patisserie.getStock().remainingCapacity() != 0) {
                    System.out.println("Patissier : Ajout d'un gateau\n");
                    patisserie.depose(new Gateau());
                    Thread.sleep(1000);
                } else {
                    System.out.println("Patissier : Stock de la patisserie plein\n");
                    fullStock = true;
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Patissier : Interruption du sleep\n");
        }
    }
}
