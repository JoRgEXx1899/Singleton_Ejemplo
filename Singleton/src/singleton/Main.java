/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author DANIEL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Singleton jorge = Singleton.getSingletonInstance("Jorge Gomez");
        Singleton daniel = Singleton.getSingletonInstance("Daniel Vanegas");
        
        // jorge y daniel son referencias a un Único objeto de la clase Singleton
        System.out.println(daniel.getNombre());
        System.out.println(jorge.getNombre());
        
        // No se permite clonar un objeto de esta clase
        try{
            Singleton richard = jorge.clone();
            System.out.println(richard.getNombre());
        }catch (NullPointerException ex){
            ex.printStackTrace();
        }    }
    
}
