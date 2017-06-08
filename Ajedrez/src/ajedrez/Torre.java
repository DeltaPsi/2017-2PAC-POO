/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

public class Torre extends Pieza {

    public Torre(String nombre) {
        super(nombre);
    }

    @Override
    public void mover() {
        System.out.println("Vertical y horizontal");
    }
    
    public void enroque() {
        System.out.println("Movimiento de la torre y el rey");
    }
}
