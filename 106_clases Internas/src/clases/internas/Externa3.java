/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.internas;

public class Externa3 {
    
    private static int atributoExterno;
    
    public static void setAtributoExternoStatic(int atributo) {
        atributoExterno = atributo;
    }
    
    // Clase anidada (Nested Class)
    static class Anidada {

        public Anidada(int anidado) {
            System.out.println("Creada la clase anidada");
        }
        
        public void funcionNoEstatica() {
            System.out.println("Llamado a funcion no estatica");
        }
        
        public static void accederAtributosEstaticosExternos() {
            System.out.println("El atributo static externo es: " + atributoExterno);
        }
    }
}
