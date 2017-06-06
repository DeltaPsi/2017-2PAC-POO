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
public class PruebaPublica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClientePublico cp = new ClientePublico("Jorge Almeida", "0001", 12000.15);
        
        System.out.println("Datos iniciales");
        cp.imprimirDatos();
        
        // Inyectar desde otro lugar un objeto con atributos publicos.
        // Los datos publicos puede seleccionarse y modificarse desde cualquier
        // objeto.
        cp.nombre = "Juan Perez";
        cp.saldo = 24000;
        
        System.out.println("Datos modificados");
        cp.imprimirDatos();
    }
    
}
