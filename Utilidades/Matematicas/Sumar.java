/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades.Matematicas;

/**
 *
 * @author Andres-Marulanda
 */
public class Sumar {
    
    /** la clase Sumar solo tendrá dos métodos Suma sobrecargados.
     *  Serán dos métodos de clase.
     */
    
    public static int suma(int sumando1, int sumando2){
        
        int resultado = 0;          // Almacenar el resultado de la suma.
        
        resultado = sumando1 + sumando2;
        
        return resultado;
    }
    
    
    public static double suma(double sumando1, double sumando2){
        
        double resultado = 0;
        
        resultado = sumando1 + sumando2;
        
        return resultado;
           
    }
    
}
