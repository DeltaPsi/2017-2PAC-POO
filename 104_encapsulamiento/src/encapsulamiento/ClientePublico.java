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
public class ClientePublico {
    // Atributos publicos    
    public String nombre;
    public String cuenta;
    public double saldo;
    
    public ClientePublico(String nombre, String cuenta, double saldo) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    public void imprimirDatos() {
        System.out.println(String.format("La cuenta %s pertenece a %s con"
            + " un saldo de %0,2.2f", this.cuenta, this.nombre, this.saldo));
    }
}
