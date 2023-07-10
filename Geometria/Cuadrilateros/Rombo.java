/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometria.Cuadrilateros;
/**
 * @author Andres-Marulanda
 */

import andres_marulanda.javaparanovatoscap4.FiguraGeometrica;       //importar la inrterface.

public class Rombo implements FiguraGeometrica {
    
    //Atributos
    private float lado;
    private float d;            // Diagonal menor.
    private float D;            // Diagonal mayor.
    
    
    //Constructor
    public Rombo(float lado, float d, float D){
        this.lado = lado;
        this.d = d;
        this.D = D;
    }
    
    //setters and getters
    public void setLado(float lado){
        this.lado = lado;
    }
    
    public float getLado(){
        return lado;
    }
    
    public void setd(float d){
        this.d = d;
    }
    
    public float getd(){
        return d;
    }
    
    public void setD(float D){
        this.D = D;
    }
    
    public float getD(){
        return D;
    }
    
    //Método para calcular el area.
    public float area(){
        
        float areaRombo = 0;
        
        return areaRombo = (d + D) / 2;
    }
    
    //Método para calcular el perimetro.
    public float perimetro(){
        
        float perimetroRombo = 0;
        
        return perimetroRombo = 4 * lado;
    }
    
    //Método para la descripción.
    public void descripcion(){
        
        System.out.println("Soy un Rombo, y tengo lados opuestos paralelos y ángulos opuestos iguales.");
    }
    
}
