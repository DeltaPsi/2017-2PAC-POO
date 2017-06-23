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
public class Condor extends Ave implements IVuela {
    public Condor() {
        super.setNombre("Condor");
    }
    
    @Override
    public void volar() {
        System.out.println("Condor vuela");
    }


    
}
