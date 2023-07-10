/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades.Matematicas;

/**
 *
 * @author Andres-Marulanda
 */
public class Potenciar {
 
    /**
     * La clase Potenciar solo tendrpa dos métodos sobrecargados y de clase.
     */
    
    public static double potencia(double base, byte exponente){
        
        double resultado = 1;           // Almacenar el resultado de la potenciación.
        byte contador = 0;
        
        while (contador < exponente){
            resultado *= base;
            contador++;
        }
        return resultado;
    }
    
    
    public static int potencia(int base, byte exponente){
        
        int resultado = 1;              // Almacenar el resultado de la potenciación.
        byte contador = 0;
        
        while (contador < exponente){
            resultado *= base;
            contador++;
        }
        return resultado;
    }
}
