/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

public class Rey extends Pieza {

    public Rey(String nombre) {
        super(nombre);
    }

    @Override
    public void mover() {
        System.out.println("Libre. Un cuadro a la vez");
    }
    
}
