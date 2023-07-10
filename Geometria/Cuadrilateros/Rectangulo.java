/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometria.Cuadrilateros;
/**
 * @author Andres-Marulanda
 */

import andres_marulanda.javaparanovatoscap4.FiguraGeometrica;

public class Rectangulo implements FiguraGeometrica {
    
    //Atributos
    private float lado1;    //Longitud de los lados.
    private float lado2;
    
    //Constructor
    public Rectangulo(float lado1, float lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    // setters and getters.
    public void setLado1(float lado1){
        this.lado1 = lado1;
    }
    
    public float getLado1(){
        return lado1;
    }
    
    public void setLado2(float lado2){
        this.lado2 = lado2;
    }
    
    public float getLado2(){
        return lado2;
    }
    
    //Método para calcular el area.
    public float area(){
        
        float areaRectangulo = 0;
        
        return areaRectangulo = lado1 * lado2;
    }
    
    //Método para calcular el perimetro.
    public float perimetro(){
        
        float perimetroRectangulo = 0;
        
        return perimetroRectangulo = (2 * lado1) + (2 * lado2);
    }
    
    //Método para la descripción.
    public void descripcion(){
        
        System.out.println("Soy un Rectángulo, y tengo lados opuestos paralelos y ángulos opuestos iguales.");
    }
    
}
