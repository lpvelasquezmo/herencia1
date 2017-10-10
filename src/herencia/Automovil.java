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
public class Automovil  extends Vehiculo  {
    
    
    private int cantidadPuertas;
    
    // si el padre tiene una varieble en su constructor, el hijo tambien debe llamar la variable en la primera linea de su constructor

    public Automovil(int caballosFuerza, int CanPuertas) {
        super(caballosFuerza);
        this.cantidadPuertas = CanPuertas;
        System.out.println("Constructor hijo");
    }
    
    // SI NO ME GUSTAN LOS METODOS DEL PADRE LOS SOBREESCRIBO con Override
    
    @Override
    public  void arrancar(){
        System.out.println("Arrancar hijo");
    }
    
    
    public void acelerar (int cuanto){
        System.out.println("Acelerar");
        
    }

    @Override
    public void detener() {
        System.out.println("Detener hijo");
    }

   
    
}
