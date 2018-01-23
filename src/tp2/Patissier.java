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
    private int nbClient;
    
    public Patissier(Patisserie patiserie, int nbClient) {
        this.patisserie = patiserie;
        this.nbClient = nbClient;
    }
    
    @Override
    public void run() {
        depose();
    }
    
    public void depose() {
        int compteur = 0;
        try {
            while(compteur < 20 && patisserie.getStock().remainingCapacity() != 0) {
                System.out.println(String.format("Patissier : Ajout d'un gateau (%d)\n",compteur));
                patisserie.depose(new Gateau());
                Thread.sleep(250);
                compteur++;
            }
            for(int i=0; i<nbClient; i++) {
                System.out.println("Patissier : Ajout d'un gâteau empoisonné\n");
                patisserie.depose(Gateau.GATEAU_EMPOISONNE);
            }            
        } catch (InterruptedException e) {
            System.out.println("Patissier : Interruption du sleep\n");
        }
    }
}
