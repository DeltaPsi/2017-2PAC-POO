/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.internas;

public class Externa1 {

    private int atributoExterno;

    public Externa1(int externo) {
        this.atributoExterno = externo;
        System.out.println("Creada la clase externa");
    }

    // Clase interna (Inner Class)
    class Interna {

        private int atributoInterno;

        public Interna(int interno) {
            this.atributoInterno = interno;
            System.out.println("Creada la clase interna");
        }

        public void accederAtributosExternos() {
            System.out.println("El valor del atributo externo es: " + atributoExterno);
        }
    }    
}
