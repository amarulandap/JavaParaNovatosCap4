/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometria.Cuadrilateros;
/**
 * @author Andres-Marulanda
 */

import andres_marulanda.javaparanovatoscap4.FiguraGeometrica;       // Importamos la interface;

public class Trapecios implements FiguraGeometrica {
    
    //Atributos
    private float lado;
    private float baseSuperior;
    private float baseInferior;
    private float altura;
    
    //Constructor
    public Trapecios(float lado, float baseSuperior, float baseInferior, float altura){
        this.lado = lado;
        this.baseInferior = baseInferior;
        this.baseSuperior = baseSuperior;
        this.altura = altura;
    }
    
    //Setters and getters.
    public void setLado(float lado){
        this.lado = lado;  
    }
    
    public float getLado(){
        return lado;
    }
    
    public void setBaseInferior(float baseInferior){
        this.baseInferior = baseInferior;
    }
    
    public float getBaseInferior(){
        return baseInferior;
    }
    
    public void setBaseSuperior(float baseSuperior){
        this.baseSuperior = baseSuperior;
    }
    
    public float getBaseSuperior(float baseSuperior){
        return baseSuperior;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public float getAltura(){
        return altura;
    }
    
    //Método para calcular el area.
    public float area(){
        
        float areaTrapecio = 0;
        
        return areaTrapecio = altura * ((baseInferior + baseSuperior) / 2);
    }
    
    public float perimetro(){
        
        float perimetroTrapecio = 0;
        
        return perimetroTrapecio = (2 * lado) + baseInferior + baseSuperior;
    }
    
    //Método para la descripción.
    public void descripcion(){
        
        System.out.println("Soy un Trapecio, y soy del tipo cuadrilátero convexo y dos de mis lados paralelos no son iguales");
    }
    
}
