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
public class Singleton {
    private String nombre;

    private static Singleton soyUnico;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private Singleton(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es: " + this.nombre);
    }

    public static Singleton getSingletonInstance(String nombre) {
        if (soyUnico == null){
            soyUnico = new Singleton(nombre);
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase Singleton");
        }
        
        return soyUnico;
    }
    
    //Sobreescribimos el metodo clone, para que no se pueda clonar un objeto de esta clase
    @Override
    public Singleton clone(){
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede clonar un objeto de la clase Singleton");
        }
        return null; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
