/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencias.Animal;

/**
 *
 * @author Andres-Marulanda
 */
public class Perro extends Animales {
    
    // Atributos de la clase hija.
    private String raza;
    
    // Constructor.
    public Perro(String raza, String nombre, int edad){
        super(nombre, edad);
        this.raza = raza;
    }
    
    public void setRaza(String raza){
        this.raza = raza;
    }
    
    public String getRaza(){
        return raza;
    }
}
