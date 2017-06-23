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
public class ListadoAlumnoTest {
    public static void main(String[] args) {                
        Alumno a1 = new Alumno("0001", "Olga Elvir");
        Alumno a2 = new Alumno("0002", "Alberto Armas");
        Alumno a3 = new Alumno("0003", "Jorge Ramos");
        Alumno a4 = new Alumno("0004", "Carmen Aristegui");
        
        Alumno[] alumnos = {a1, a2, a3, a4};        
        ListadoAlumno lista = new ListadoAlumno(alumnos);
        
        
        // Iterar por medio de for
        System.out.println("Iteracion por medio de FOR");
        for (Alumno temp : lista) {
            System.out.println(temp);
        }
        
        // Iterar por medio de while
        System.out.println("Iteracion por medio de WHILE");
        Iterator<Alumno> it1 = lista.iterator();
        
        while (it1.hasNext()) {
            Alumno temp = it1.next();
            System.out.println(temp);
        }
    }
}
