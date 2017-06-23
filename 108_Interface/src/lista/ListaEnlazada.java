/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.function.Consumer;

/**
 *
 * @author enrique
 */
public class ListaEnlazada<T> implements {
    private Nodo<T> primero;
    
    public ListaEnlazada() {
        this.primero = null;
    }
    
    public void vaciar() {
        this.primero = null;
    }
    
    public boolean estaVacia() {
        return this.primero == null;
    }
    
    public void insertarPrimero(T t) {
        Nodo<T> nuevo = new Nodo<>(t);
        
        if (!this.estaVacia()) {
            nuevo.setSiguiente(this.primero);
        }
        
        this.primero = nuevo;
    }
    
    public void insertarUltimo(T t) {
        Nodo<T> nuevo, temp;
                
        nuevo = new Nodo<>(t);
        
        if (this.estaVacia()) {
            this.insertarPrimero(t);
        } else {
            temp = primero;
            
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            
            temp.setSiguiente(nuevo);
        }
    }
    
    public void imprimirNodos() {
        Nodo<T> temp = this.primero;
        
        do {
            System.out.println(temp.getDato());            
            temp = temp.getSiguiente();                    
        } while (temp != null);
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action); //To change body of generated methods, choose Tools | Templates.
    }
}
