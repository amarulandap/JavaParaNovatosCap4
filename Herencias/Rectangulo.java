/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencias;

/**
 *
 * @author Andres-Marulanda
 */
public class Rectangulo extends HerenciaGeometrica {
    
    //Atributos.
    protected float ancho;
    protected float alto;
    
    //Constructores.
    // Al igual que en el caso del circulo, implementa el constructor de la clase madre que no tiene parámetros.
    public Rectangulo(){                        // Constructor que inicializará los atributos en 5 y 10 respectivamente.
        this.alto = 5;                          
        this.ancho = 10;
    }
    
    public Rectangulo(float ancho, float alto){
        this.alto = alto;
        this.ancho = ancho;
    }
    
    // Llamado al constructor de la clase Herencia. A la vez nos sirve como puente para la clase Cuadrado.
    public Rectangulo(float ancho, float alto, String color, boolean relleno){
        super(color, relleno);
        this.alto = alto;
        this.ancho = ancho;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }
    
    public float obtenerArea(){
        
        float area = 0;
        
        return area = this.alto * this.ancho;           // Área = base x Altura.
    }
    
    public float obtenerPerimetro(){
        float perimetro = 0;
        
        return perimetro = 2 * this.getAlto() + 2 * this.getAncho();
    }
    
    public String toString(){
        
        String cadena = "Soy un rectángulo de Alto: " + this.alto + " y Ancho: " + this.ancho + " y " + super.toString();
        
        return(cadena);
    }
    
}
