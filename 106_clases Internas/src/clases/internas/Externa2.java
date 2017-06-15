/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.internas;

public class Externa2 {

    private int atributoExterno;
    private Interna objInterno;

    public Externa2(int externo, int interno) {
        this.atributoExterno = externo;
        // Una vez creado el objeto de la clase interna se pueden acceder
        // a los métodos y miembros de la clase
        this.objInterno = new Interna(interno);
    }

    public void accederAtributosInternos() {
        System.out.println("El valor del atributo interno es: " + objInterno.atributoInterno);
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
