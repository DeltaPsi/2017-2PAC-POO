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
public class ClientePrivado {
    
    // Atributos privados    
    private String nombre;
    private String cuenta;
    private double saldo;
    
    public ClientePrivado(String nombre, String cuenta, double saldo) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    public void imprimirDatos() {
        System.out.println(String.format("La cuenta %s pertenece a %s con"
            + " un saldo de %0,2.2f", this.getCuenta(), this.getNombre(), this.getSaldo()));
    }
    
    // Metodos GET y SET. Así como están definidos son atributos de solo lectura
    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    private void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
