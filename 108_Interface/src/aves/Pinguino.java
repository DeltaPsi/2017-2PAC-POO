package aves;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enrique
 */
public class Pinguino extends Ave implements INada {

    public Pinguino() {
        super.setNombre("Pingüino");
    }
    
    @Override
    public void nadar() {
        System.out.println("Pingüino nada");
    }
    
}
