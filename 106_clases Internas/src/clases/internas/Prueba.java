/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.internas;

public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("**** Prueba del Externo 1 ****");
        // Una objeto de la clase interna no existe hasta que un objeto de la
        // clase externa es creado.
        Externa1 oExterno1 = new Externa1(1);
        Externa1.Interna oInterno = oExterno1.new Interna(2);
        
        // Una clase interna puede acceder a los atributos privado de un objeto
        // de clase externa.
        oInterno.accederAtributosExternos();
        
        //-------------------------------------------------------------------
        System.out.println("**** Prueba del Externo 2 ****");
        // Tambien es posible acceder a los elementos privados de una clases
        // interna a través de la clase externa.
        Externa2 oExterno2 = new Externa2(1, 100);
        oExterno2.accederAtributosInternos();
        
        //-------------------------------------------------------------------
        System.out.println("**** Prueba del Externo 3 ****");
        // Las clases anidadas son clases estáticas. Sin embargo, permiten crear
        // objetos, como puede verse a continuación
        Externa3.setAtributoExternoStatic(100);
        Externa3.Anidada oAnidado = new Externa3.Anidada(0);
        oAnidado.funcionNoEstatica();
        // Los métodos estáticos, solo pueden accederse a través de la clase.
        Externa3.Anidada.accederAtributosEstaticosExternos();
       }
    
}
