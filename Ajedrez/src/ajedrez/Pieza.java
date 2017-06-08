/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

public class Pieza {
    private String nombre;
    private Posicion posicion;
    
    public Pieza(String nombre) {
        this.nombre = this.getClass().getSimpleName() + " " + nombre;
    }
    
    public void agregarPosicion(int fila, char columna){
        this.posicion = new Posicion(fila, columna);
    }
    public void mover() {
        System.out.println("Pieza moviendose");
    }
    
    /// Clase Interna (Inner class)
    class Posicion {
        private int fila;
        private char columna;
        
        public Posicion(int fila, char columna) {
            this.setFila(fila);
            this.setColumna(columna);
        }
        
        public int getFila() {
            return this.fila;
        }
        
        public char getColumna() {
            return this.columna;
        }
        
        public void setFila(int fila) {
            this.fila = fila;
        }
        
        public void setColumna(char columna) {
            this.columna = columna;
        }
    }
}
