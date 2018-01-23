/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mathieu VINCENT
 */
public class Patisserie {
    static List<Gateau> stock = new ArrayList<>();
    
    public synchronized void depose(Gateau gateau) {
        stock.add(gateau);
        System.out.println("Patisserie : Ajout d'un gâteau");
        if(!stock.isEmpty()) {
            this.notify();
        }
    }
    
    public synchronized Gateau achete() {
        while(stock.isEmpty()) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                
            }
        }
        Gateau retour = stock.get(0);
        stock.remove(0);
        return retour;
    }
    
    public List<Gateau> getStock() {
        return stock;
    }
}
