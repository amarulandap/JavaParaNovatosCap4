/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package andres_marulanda.javaparanovatoscap4;
/**
 * @author Andres-Marulanda
 */

import java.util.Scanner;
import Geometria.Cuadrilateros.*;
import Utilidades.Matematicas.*;
import andres_marulanda.javaparanovatoscap4.ValidacionDatos;

public class PruebasObjetos {

    /**
     * @param args the command line arguments
     */
    
    static Scanner leer = new Scanner (System.in);  //Variable global.
    
    public static void main(String[] args) {
        
       // pruebaNaveEspacial();
       // pruebaCuadrilateros();
       pruebaSumarYPotenciar();
      
        
    }
    
    public static void pruebaNaveEspacial(){
        
        byte numeroVidas;
        
        System.out.println("Ingrese el número de vidas de la nave: ");
        try{
            numeroVidas = leer.nextByte();
        }catch(Exception e){
            System.err.println("Error, debe ingresar un número entero");
            numeroVidas = 0;
            // e.printStackTrace();
        } 
        
        if(numeroVidas <= 0){
            System.out.println("Error, el número debe ser positivo y mayor que cero");
            numeroVidas = 0;
        }
        
        System.out.println("Número de naves: " + NaveEspacial.getCantidadNaves());  //invoco el método cantidadNaves sin instanciar un objeto.
        
        NaveEspacial nave1 = new NaveEspacial(numeroVidas);
        System.out.println("Número de naves: " + NaveEspacial.getCantidadNaves());
        
        NaveEspacial nave2 = new NaveEspacial(numeroVidas);
        System.out.println("Número de naves: " + NaveEspacial.getCantidadNaves());
        
        System.out.println("Nave 1: Vidas " + nave1.getNumeroVidas());
        System.out.println("Nave 2: Vidas " + nave2.getNumeroVidas());
        
    }
    
    public static void pruebaCuadrilateros(){
        
        float lados = 0;    //longitud lados del cuadrado.
        float lado1 = 0;    //longitud lado del rectángulo.
        float lado2 = 0;    //longitud lado2 del rectángulo.
        
                      
        lados = ValidacionDatos.validarDato("Ingrese la medida de los lados: "); //Solicitar medidas lados del cuadrado.   
        lado1 = ValidacionDatos.validarDato("Ingrese la medida de1 lado1 del rectángulo: ");  //Solicitar medida lado1 rectángulo.  
        lado2 = ValidacionDatos.validarDato("Ingrese la medida de1 lado2 del rectángulo: ");  //Solicitar medida lado2 rectángulo.
        
        Cuadrado cuadrado = new Cuadrado(lados);
        System.out.println("El área del cuadrado es: " + cuadrado.getLado() + " * " + cuadrado.getLado() + " = " + cuadrado.area());
        System.out.println("El perimetro del cuadrado es: " + " 4 * " + cuadrado.getLado() + " = " + cuadrado.perimetro());
        
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        System.out.println("El área del rectángulo es: " + rectangulo.getLado1() + " * " + rectangulo.getLado2() + " = " + rectangulo.area());
        System.out.println("El perimetro del rectángulo es: " + " 2 * " + rectangulo.getLado1() + " + " + " 2 * " + rectangulo.getLado2() + " = " + rectangulo.perimetro());     
    } 
    
    public static void pruebaSumarYPotenciar(){
        
        byte opcion = 0;
        
        // Variables para la clase Sumar.
        int sumando = 0;
        int sumando_1 = 0;
        double sumando1 = 0;
        double sumando2 = 0;
        int resultadoSumaEnteros = 0;
        double resultadoSumaReales = 0;
        
        
        // variables para la clasePotenciar
        byte exponente = 0;
        int base1 = 0;
        double base2 = 0;
        int resultadoPotencia1 = 1;
        double resultadoPotencia2 = 1;
        
        
        //Menu de opciones
        System.out.println("Menu de opciones.");
        System.out.println("1. Sumar números enteros.");
        System.out.println("2. Sumar números reales.");
        System.out.println("3. Potenciar números enteros.");
        System.out.println("4. Potenciar números reales.");
        opcion = (byte) ValidacionDatos.validarDatoEntero("Seleccione una opción:");
        
        if(opcion == 1){
            sumando = ValidacionDatos.validarDatoEntero("Ingrese el sumando: ");
            sumando_1 = ValidacionDatos.validarDatoEntero("Ingrese el sumando: "); 
            resultadoSumaEnteros = Sumar.suma(sumando_1, sumando);
            System.out.println("Suma = " + resultadoSumaEnteros);
        }
        
        else if(opcion == 2){
            sumando1 = ValidacionDatos.validarDatoDouble("Ingrese el sumando: ");
            sumando2 = ValidacionDatos.validarDatoDouble("Ingrese el sumando: ");
            resultadoSumaReales = Sumar.suma(sumando1, sumando2);
            
            System.out.println("Suma = " + resultadoSumaReales);
        }
        
        else if(opcion == 3){
            base1 = ValidacionDatos.validarDatoEntero("Ingrese la base: ");
            exponente = (byte) ValidacionDatos.validarDatoEntero("Ingrese el exponente: ");      // Casteo a tipo Byte.
            resultadoPotencia1 = Potenciar.potencia(base1, exponente);
            System.out.println(base1 + "**" + exponente + "=" + resultadoPotencia1);
        }
        
        else if(opcion == 4){
            base2 = ValidacionDatos.validarDatoDouble("Ingrese la base: ");
            exponente = (byte) ValidacionDatos.validarDatoEntero("Ingrese el exponente: ");
            resultadoPotencia2 = Potenciar.potencia(base2, exponente);
            System.out.println(base2 + "**" + exponente + "=" + resultadoPotencia2);
        }
        
        else{
            System.out.println("Opción erronea.");
        }
        
        
    }
     
}
