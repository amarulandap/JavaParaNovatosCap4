/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package andres_marulanda.javaparanovatoscap4;
/**
 * @author Andres-Marulanda
 */

//Solo se usa el java.----.---- cuando se desea importar un paquete básico del JDk de Java.

import Geometria.Triangulos.*;
import Geometria.Cuadrilateros.*;
import java.util.Scanner;

public class Pruebas {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        float lado = 0;
        float lado1 = 5;
        float d = 4;
        float D = 8;
        float baseInferior = 8;
        float baseSuperior = 6;
        float altura = 4;
        
        Equilatero trianguloEquilatero = new Equilatero();
        Isosceles trianguloIsosceles = new Isosceles();
        Escaleno trianguloEscaleno = new Escaleno();
        
        System.out.println ("Ingrese la medida de los lados: ");
        try{
            lado = leer.nextFloat();
        }catch(Exception e){
            System.err.println("Valor erroneo");
        }
        Cuadrado cuadrado = new Cuadrado(lado);
        Rectangulo rectangulo = new Rectangulo(lado, lado1);
        Rombo rombo = new Rombo(lado1, d, D);
        Trapecios trapecio = new Trapecios(lado1, baseInferior, baseSuperior, altura);
        
        trianguloEquilatero.descripcion();
        trianguloIsosceles.descripcion();
        trianguloEscaleno.descripcion();
        
        cuadrado.descripcion();
        rectangulo.descripcion();
        rombo.descripcion();
        trapecio.descripcion();
        
    }
}

