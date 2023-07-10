/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Varios;

/**
 *
 * @author Andres-Marulanda
 */
public class Profesor {
    
    // Atributos.
    
    protected String nombre;
    protected int sueldo;
    
    // Constructores.
    
    public Profesor(){
        
    }
    
    public Profesor(String nombre, int sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    // Setters and Getters.
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setSueldo(int sueldo){
        this.sueldo = sueldo;
    }
    
    public int getSueldo(){
        return sueldo;
    }
}
