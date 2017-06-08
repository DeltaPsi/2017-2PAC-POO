/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.internas;

/**
 *
 * @author enrique
 */
public class Externa {

    private int atrExterno;
    private Interna oInterna;

    public Externa(int externo) {
        this.atrExterno = externo;
        System.out.println("Creada la clase externa");
    }
    
    public Externa(int externo, int interno) {
        this.atrExterno = externo;
        // Una vez creado el objeto de la clase interna se pueden acceder
        // a los métodos y miembros de la clase
        this.oInterna = new Interna(interno);
    }
    
    public void accederAtributosInternos() {
        System.out.println("El valor interno es: " + oInterna.atrInterno);
    }

    // Clase interna (Inner Class)
    class Interna {

        private int atrInterno;

        public Interna(int interno) {
            this.atrInterno = interno;
            System.out.println("Creada la clase interna");
        }

        public void accederAtributosExternos() {
            System.out.println("El valor externo es: " + atrExterno);
        }
    }

    // Clase anidada (Nested Class)
    static class Anidada {

        private int atrAnidado;

        public Anidada(int anidado) {
            this.atrAnidado = anidado;
            System.out.println("Creada la clase anidada");
        }
        
        public void funcionNoEstatica() {
            System.out.println("Llamado a funcion no estatica");
        }
    }
}
