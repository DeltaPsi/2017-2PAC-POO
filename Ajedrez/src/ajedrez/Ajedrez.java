/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

public class Ajedrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pieza[] blancas;
        
        blancas = new Pieza[16];
        
        blancas[0] = new Torre("1");
        blancas[1] = new Caballo("1");
        blancas[2] = new Alfil("1");
        blancas[3] = new Reyna( "1");
        blancas[4] = new Rey("1");
        blancas[5] = new Alfil("2");
        blancas[6] = new Caballo("2");
        blancas[7] = new Torre("2");
        
        blancas[8] = new Peon("1");
        blancas[9] = new Peon("2");
        blancas[10] = new Peon("3");
        blancas[11] = new Peon("4");
        blancas[12] = new Peon("5");
        blancas[13] = new Peon("6");
        blancas[14] = new Peon("7");
        blancas[15] = new Peon("8");
        
        for (int i = 0; i <= 7; i++) {
            blancas[i].agregarPosicion(i + 1, 'A');
            blancas[i].mover();
        }
        
        for (int j = 8; j <=  15; j++) {
            blancas[j].agregarPosicion(j + 1, 'B');
            blancas[j].mover();
        }
    }
    
}
