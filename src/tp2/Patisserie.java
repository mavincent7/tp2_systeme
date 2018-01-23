/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author Mathieu VINCENT
 */
public class Patisserie {
    BlockingQueue stock = new ArrayBlockingQueue(15);
    
    public void depose(Gateau gateau) {
        try {
            stock.put(gateau);
            System.out.println("Patisserie : Ajout d'un gâteau\n");
        } catch (InterruptedException e) {
            System.out.println("Patisserie : Interruption de depose\n");
        }        
    }
    
    public Gateau achete() {
        Gateau retour = null;
        try {
            retour = (Gateau)stock.take();
        } catch (InterruptedException ex) {
            System.out.println("Patisserie : Interruption de achete\n");
        }
        return retour;
    }
    
    public BlockingQueue getStock() {
        return stock;
    }
}
