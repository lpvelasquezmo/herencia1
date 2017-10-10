/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Estudiante
 */
public abstract class Vehiculo {
    // cuando agrego abstract cada hijo deben definir los metodos abstractos 
    protected int caballosdefUERZA;

   
    
    
    public void arrancar(){
        
        System.out.println("Arrancar");
    }
    
    public abstract void detener ();
    // el papa solo los crea pero no define nada en el metodo

    public Vehiculo(int caballos) {
        
        System.out.println("Constructor padre");
    }
    
}
