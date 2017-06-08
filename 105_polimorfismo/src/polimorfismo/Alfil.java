/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author enrique
 */
public class Alfil extends Pieza {
    public Alfil() {
        super("Alfil");
    }
    
    @Override
    public void movimiento() {
        System.out.println("Movimiento diagonal");
    }
}
