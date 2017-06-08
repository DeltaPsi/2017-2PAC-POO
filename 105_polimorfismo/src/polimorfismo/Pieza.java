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
public class Pieza {
    private String nombre;
    
    public Pieza(String nombre) {
        this.nombre = nombre;
    }
    
    public void movimiento() {
        System.out.println("Pieza moviendose");
    }
}
