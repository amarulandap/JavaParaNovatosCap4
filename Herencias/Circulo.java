/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencias;

/**
 *
 * @author Andres-Marulanda
 */
public class Circulo extends HerenciaGeometrica {
    
    // Atributos
    private float radio = 0;
    
    //Constructores
    public Circulo(){
        this.radio = 1;
    }
    
    public Circulo(float radio){
        this.radio = radio;
    }
    
    public Circulo(float radio, String color, boolean relleno){
        super(color, relleno);
        this.radio = radio;
    }
    
    //setter y getter.
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    //Métodos.
    public float obtenerArea(){
        
        final float PI = (float) 3.1416;                // Se hace un casteo ya que la constante PI es de tipo double.
        float area = 0;
        
        return area = (float) (PI * Math.pow(this.radio, 2));       
    }
    
    public float obtenerPerimetro(){
        
        final float PI = (float) 3.1416;                // Declaramos la constante PI al igual que en el área.
        float perimetro = 0;
        
        return perimetro = (float)(2 * PI * this.radio);
    }
    
    public String toString(){
        
        String cadena = "Soy un circulo de radio " + this.getRadio() + " " + super.toString(); 
        // Con super llamamos a los métodos de la clase madre.
        
        return (cadena);
    }
}
