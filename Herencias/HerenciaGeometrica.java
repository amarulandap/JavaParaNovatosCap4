/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencias;

/**
 *
 * @author Andres-Marulanda
 */
public class HerenciaGeometrica {
    
    // Superclase Figura.
    
    //Atributos.
    
    // Atributos de instancia.
    protected String color;         
    protected boolean relleno;      // Especificar si la figura tendrá o no relleno.
    
    // Constructores.
    public HerenciaGeometrica(){    // Constructor sin argumentos que inicializa ambos atributos.
        this.color = "rojo";
        this.relleno = true;
    }
    
    public HerenciaGeometrica(String color, boolean relleno){
        this.color = color;
        this.relleno = relleno;
    }
    
    //Setters y getters.
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }
     
    public String toString(){
        
        String cadena = " ";
        
        if (this.relleno == true){
            cadena = "Soy una figura de color " + this.color + " y estoy rellena.";
        }else if (this.relleno == false){
            cadena = "Soy una figura de color " + this.color + " y no estoy rellena.";
        }
        return cadena;
    }
}
