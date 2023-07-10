/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Varios;

/**
 *
 * @author Andres-Marulanda
 */
public class PracticaWrappers {
    
    /**
     * Nos permiten tratar un dato primitivo como si fuera un objeto.
     * byte -- Byte.
     * short -- Short.
     * int -- Integer.
     * long -- Long.
     * boolean -- Boolean.
     * float -- Float.
     * double -- Double.
     * char -- Char.
     */
    
    private Integer numero1;
    private Integer numero2;
    
    // Constructores.
    
    public PracticaWrappers(){
        
    }
    
    public PracticaWrappers(Integer numero1, Integer numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    // setters and getters.
    
    public void setNumero1(Integer numero1){
        this.numero1 = numero1;
    }
    
    public Integer getNumero1(){
        return numero1;
    }
    
    public void setNumero2(Integer numero2){
        this.numero2 = numero2;
    }
    
    public Integer getNumero2(){
        return numero2;
    }
    
    // Suma.
    
    public Integer suma(){
        return (this.numero1 + this.numero2);
    }
    
    // Resta.
    
    public Integer resta(){
        return (this.getNumero1() - this.getNumero2());
    }
    
    // Multiplicación.
    
    public Integer producto(){
        return (this.numero1 * this.numero2);
    }
    
    // Cociente.
    
    public Double division(){
        
        double cociente = 0;
        
        if (this.numero2 == 0){
            System.out.println("Error, ingrese un número diferente de cero.");
        }else{
            cociente = (this.numero1 / this.numero2);
        }
        
        return cociente;
    }
    
    // Módulo.
    
    public Double modulo(){
        
        double modulo = 0;
        
        if (this.numero2 == 0){
            System.out.println("Error, ingrese un número diferente de cero.");
        }else{
            modulo = (this.numero1 % this.numero2);
        }
        
        return modulo;
    }
    
}
