/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

public class Peon extends Pieza {

    public Peon(String nombre) {
        super(nombre);
    }

    @Override
    public void mover() {
        System.out.println("Un cuadro a la vez. Horizontal");
    }
    
}
