/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author enrique
 */
public class PruebaPrivadaAcierto {

    public static void main(String[] args) {
        ClientePrivado cp = new ClientePrivado("Jorge Almeida", "0001", 12000.15);
        System.out.println(cp.getNombre());
    }
}
