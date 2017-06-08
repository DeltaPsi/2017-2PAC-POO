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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Una objeto de la clase interna no existe hasta que un objeto de la
        // clase externa es creado.
        Externa oExterno = new Externa(1);
        Externa.Interna oInterno = oExterno.new Interna(2);
        
        // Una clase interna puede acceder a los atributos privado de un objeto
        // de clase externa.
        oInterno.accederAtributosExternos();
        
        // Tambien es posible acceder a los elementos privados de una clases
        // interna a través de la clase externa.
        Externa oExterno2 = new Externa(1, 100);
        oExterno2.accederAtributosInternos();
        
        //-------------------------------------------------------------------
        
        // Una clase anidada, difiere con la interna en que las clases 
        // son estáticas
        Externa.Anidada oAnidado = new Externa.Anidada(3);
        oAnidado.funcionNoEstatica();
        
    }
    
}
