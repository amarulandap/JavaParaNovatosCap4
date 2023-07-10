/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andres_marulanda.javaparanovatoscap4;

/**
 * @author Andres-Marulanda
 */

public class NaveEspacial {
    
    //Atributos
    
    private static int cantidadNaves = 0;   //Clase.
    private byte numeroVidas;   //Instancia.
    
    //Constructor
    
    public NaveEspacial(byte numeroVidas){
        
        this.numeroVidas = numeroVidas;
        contarNave();
    }
    
    // setters and getters
    
    public void setNumeroVidas(byte numeroVidas){
        
        this.numeroVidas = numeroVidas;
    }
    
    public byte getNumeroVidas(){
        
        return numeroVidas;
    }
    
    public static int getCantidadNaves(){   //Método de clase.
        
        return cantidadNaves;
    }
    
    public void contarNave(){
        
        this.cantidadNaves++;
    }
}
