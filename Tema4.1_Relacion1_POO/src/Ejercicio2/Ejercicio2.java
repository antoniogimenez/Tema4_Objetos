/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cubo miCubo = new Cubo(5);
        
        miCubo.pintar();
        
        miCubo.rellenar(4);
        miCubo.pintar();
        
        miCubo.rellenar(2);
        miCubo.pintar();
        
        miCubo.vaciar();
        miCubo.pintar();
        
       
    }
    
}
