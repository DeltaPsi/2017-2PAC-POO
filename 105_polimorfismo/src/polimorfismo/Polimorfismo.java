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
public class Polimorfismo {

    // Este método utiliza un argumento Pieza para llamar a su método movimiento
    public static void mover(Pieza pieza) {
        pieza.movimiento();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Es posible establecer, utilizando una estructura comun subclases
        Pieza pieza1 = new Alfil();
        Pieza pieza2 = new Torre();
        
        // En este caso utilizando un mismo esquema se puede llamar a cualquier
        // subtipo de Pieza
        mover(pieza1);
        mover(pieza2);
        mover(new Torre());
    }
    
}
