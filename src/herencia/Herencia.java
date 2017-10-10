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
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo v = new Vehiculo(10) {

            @Override
            public void detener() {
            }
        };
        v.arrancar();
        v.detener();
        Automovil a= new Automovil(10,4);
        a.acelerar(10);
        a.arrancar();
        a.detener();
        
        
    }
    
}
