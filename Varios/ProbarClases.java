/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Varios;

/**
 * @author Andres-Marulanda
 */

import java.util.Scanner;
import andres_marulanda.javaparanovatoscap4.ValidacionDatos;    // Importamos los métodos para la validación de los datos ingresados.

public class ProbarClases {

    /**
     * @param args the command line arguments
     */
    
    static Scanner leer = new Scanner(System.in);       // Leer los datos ingresados desde el teclado.
    
    public static void main(String[] args) {
        
        // probarRector();
        probarPracticaWrappers();
        
    }
    
    public static void probarRector(){
        
        System.out.println("Ingrese el nombre del profesor: ");     // Ingresamos el nombre del profesor.
        String nombreProfesor = leer.nextLine();
        
        String invitacionSalario = "Ingrese el sueldo de los docentes: ";   // Ingresamos el sueldo.
        int sueldoProfesor = ValidacionDatos.validarDatoEntero(invitacionSalario);
        
        System.out.println("Ingrese el nombre del rector: ");   // Ingresamos el nombre del rector.
        String nombreRector = leer.nextLine();
        
        // Crear los objetos.
        
        Profesor profesor1 = new Profesor(nombreProfesor, sueldoProfesor);
        Rector rector1 = new Rector(nombreRector, sueldoProfesor);
        
        System.out.println("Profesor(a): " + profesor1.getNombre() + " tiene un sueldo de: $" + profesor1.getSueldo());
        System.out.println("Rector(a): " + rector1.getNombre() + " tiene un sueldo de: $" + rector1.getSueldo());
    }
    
    public static void probarPracticaWrappers(){
        
        String invitacion1 = "Ingrese el primer número: ";
        String invitacion2 = "Ingrese el segundo número: ";
        int entero1 = ValidacionDatos.validarDatoEntero(invitacion1);
        int entero2 = ValidacionDatos.validarDatoEntero(invitacion2);
        
        Integer numero1 = new Integer(entero1);
        Integer numero2 = new Integer(entero2);
        
        PracticaWrappers ejercicios = new PracticaWrappers(entero1, entero2);   // Números enteros.
        PracticaWrappers ejercicios1 = new PracticaWrappers(numero1, numero2);  // Objetos enteros.
        
        System.out.println("Entero1: " + ejercicios.getNumero1());      // Ejercicios con números enteros (datos primitivos)
        System.out.println("Entero2: " + ejercicios.getNumero2());
         System.out.println("Número1: " + ejercicios1.getNumero1());     // Ejercicios con objetos Integer.
        System.out.println("Número2: " + ejercicios1.getNumero2());
        
        System.out.println("Suma1 = " + ejercicios.suma() + " Suma2 = " + ejercicios1.suma());
        System.out.println("Resta1 = " + ejercicios.resta()+ " Resta2 = " + ejercicios1.resta());
        System.out.println("Producto1 = " + ejercicios.producto()+ " Producto2 = " + ejercicios1.producto());
        System.out.println("Cociente1 = " + ejercicios.division()+ " Cociente2 = " + ejercicios1.division());
        System.out.println("Modulo1 = " + ejercicios.modulo() + " Modulo2 = " + ejercicios1.modulo());
    }
}
