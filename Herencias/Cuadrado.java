/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencias;

/**
 *
 * @author Andres-Marulanda
 */
public class Cuadrado extends Rectangulo {
    
    // Atributos.
    private float lado;     // Un cuadrado es un rectangulo donde alto = ancho.
    
    // Constructores.
    public Cuadrado(){
        this.lado = 5;
    }
    
    public Cuadrado(float lado){
        super(lado, lado);
    }
    
    public Cuadrado(float lado, String color, boolean relleno){         // Constructor con los atributos de la clase Herencia.
        super(lado, lado, color, relleno);      
    }
    
    
    // Setters and getters.
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    // Métodos.
    public void setAncho(float lado){       // Darle al ancho el valor del lado.
        this.ancho = lado;
    }
    
    public void setAlto(float lado){        // Darle al alto el valor del lado.
        this.alto = lado;
    }
    
    public String toString(){
        
        String cadena = "Soy un Cuadrado cuyos lados miden: " + this.getLado() + " y a la vez " + super.toString();
        return cadena;
    }
    
    // Los métodos para calcular el área y el perimetro son los mismos de la clase Rectángulo.
    
    
}
