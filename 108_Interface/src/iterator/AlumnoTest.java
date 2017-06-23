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
public class AlumnoTest {
    public static void main(String[] args) {
        Alumno excelencia = new Alumno("0001", "Juan Lopez");
        excelencia.setNota(100);
        Alumno reprobado = new Alumno("0002", "Martin Alvarado");
        reprobado.setNota(64);
        
        int comprobacion = excelencia.compareTo(excelencia);
        System.out.println(comprobacion);
    }
}
