/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author enrique
 */
public class Alumno implements Comparable<Alumno> {
    private String cuenta;
    private String nombre;
    private int nota;
    
    public Alumno(String cuenta, String nombre) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.nota = 0;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        return this.getCuenta() + " " + this.getNombre();
    }

    @Override
    public int compareTo(Alumno o) {
        if (this.getNota() < o.getNota())
            return -1;
        else if (this.getNota() == o.getNota())
            return 0;
        else
            return 1;
    }

    /**
     * @return the nota
     */
    public int getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(int nota) {
        this.nota = nota;
    }
}
