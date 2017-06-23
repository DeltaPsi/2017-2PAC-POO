/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.Iterator;

/**
 *
 * @author enrique
 */
public class ListadoAlumno implements Iterable<Alumno> {

    private Alumno[] listaAlumnos;

    public ListadoAlumno(Alumno[] listado) {
        this.listaAlumnos = listado;
    }

    // Funcion solicitada por la interface Iterable
    @Override
    public Iterator<Alumno> iterator() {
        Iterator iterator = new AlumnoIterator();
        return iterator;
    }
    
    protected class AlumnoIterator implements Iterator<Alumno> {
        int posicion;
        
        public AlumnoIterator() {
            posicion = 0;
        }

        @Override
        public boolean hasNext() {
            return posicion < listaAlumnos.length;
        }

        @Override
        public Alumno next() {
            Alumno temp = listaAlumnos[posicion];
            posicion++;
            return temp;
        }
    }
}
