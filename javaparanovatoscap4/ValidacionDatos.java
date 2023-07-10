/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andres_marulanda.javaparanovatoscap4;

import java.util.Scanner;

/**
 *
 * @author Andres-Marulanda
 */


public class ValidacionDatos {
    
    // Atributos.
    
    // Constructor.
    
    // Crtear una variabl global para leer los datos ingresados por los usuarios.
    
    static Scanner leer = new Scanner(System.in);
    
    
    // Método para validar datos reales tipo float.
    
    public static float validarDato(String invitacion){
            
        float dato = 0;
        System.out.println(invitacion);
            
        try{
            dato = leer.nextFloat();    
        }catch(Exception e){
            System.err.println("Valor erroneo");
            dato = 0;
        }
        return dato;
    }
    
    // Validar datos reales tipo double.
    
    public static double validarDatoDouble (String invitacion){
        
        double dato = 0;
        System.out.println(invitacion);
        
        try{
            dato = leer.nextDouble();
        }catch(Exception e){
            System.out.println("Valor erroneo");
            dato = 0;
        }
        return dato;    
    }
    
    // Validar datos enteros.
    
    public static int validarDatoEntero(String invitacion){
        
        int dato = 0;
        System.out.println(invitacion);
        
        try{
            dato = leer.nextInt();
        }catch(Exception e){
            System.out.println("Valor erroneo");
            dato = 0;
        }
        return dato;
    }
    
    // Validar los String.
    
    public static String validarCadenasDeCaracteres(String invitacion){
        
        String cadena = "";
        System.out.println(invitacion);
        
        try{
            cadena = leer.nextLine();
        }catch(Exception e){
            System.out.println("valor erroneo");
            cadena = "";
        }
        
        return cadena;
    }
    
}
