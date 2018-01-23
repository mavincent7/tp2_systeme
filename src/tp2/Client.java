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
public class Client implements Runnable {
    
    private Patisserie patisserie;
    
    public Client(Patisserie patisserie) {
        this.patisserie = patisserie;
    }
    
    @Override
    public void run() {
        achete();
    }
    
    public void achete() {
        try {
            Gateau gateau = null;
            
            while(gateau != Gateau.GATEAU_EMPOISONNE) {
                gateau = patisserie.achete();
                System.out.println("Client : Achat d'un gâteau\n");
                Thread.sleep(500);
            }
        } catch(InterruptedException e) {
            System.out.println("Client : Interruption du sleep\n");
        }
        
    }
    
}
