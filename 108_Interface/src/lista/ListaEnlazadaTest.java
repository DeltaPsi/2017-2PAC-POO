/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author enrique
 */
public class ListaEnlazadaTest {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada<>();
        
        lista.insertarUltimo(1);
        lista.insertarUltimo(2);
        lista.insertarUltimo(3);
        
        lista.imprimirNodos();
    }
}
