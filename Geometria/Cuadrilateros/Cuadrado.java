/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometria.Cuadrilateros;
/**
 * @author Andres-Marulanda
 */

import andres_marulanda.javaparanovatoscap4.FiguraGeometrica;

public class Cuadrado implements FiguraGeometrica {
    
    //Atributos
    private float lado;      // medida del lado del cuadrado.
    
    //Constructor
    public Cuadrado(float lado){
        this.lado = lado;
    }
    
    //setters and getters
    public void setLado(float lado){
        this.lado = lado;
    }
    
    public float getLado(){
        return lado;
    }
    
    //Método para la descripción.
    public void descripcion(){
        System.out.println("Soy un cuadrado, y tengo lados opuestos paralelos y ángulos opuestos iguales.");
    }
    
    //Método para calcular el área
    public float area(){
        
        float areaCuadrado = 0;
        
        return areaCuadrado = (float) Math.pow(lado, 2);
    }
    
    //Método para calcular el perimetro.
    public float perimetro(){
        
        float perimetroCuadrado = 0;
        
        return perimetroCuadrado = 4 * this.lado;
    }
}
