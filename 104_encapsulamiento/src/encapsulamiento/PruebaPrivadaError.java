/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

import encapsulamiento.ClientePublico;

/**
 *
 * @author enrique
 */
public class PruebaPrivadaError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClientePrivado cp = new ClientePrivado("Jorge Almeida", "0001", 12000.15);
        
        System.out.println("Datos iniciales");
        cp.imprimirDatos();
        
        // Como este objeto tiene todos sus atributos privados, no se pueden
        // acceder directamente
        cp.nombre = "Juan Perez";
        cp.saldo = 24000;
        
        System.out.println("Datos modificados");
        cp.imprimirDatos();
    }
    
}
