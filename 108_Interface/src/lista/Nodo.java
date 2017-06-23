/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

public class Nodo<T> {
    private T dato;
    private Nodo<T> siguiente;
    
    public Nodo(T dato) {
        this.siguiente = null;
        this.dato = dato;
    }
    public Nodo(T dato, Nodo<T> siguiente) {
        this.siguiente = siguiente;
        this.dato = dato;
    }

    /**
     * @return the dato
     */
    public T getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(T dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}
