/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencias.Animal;

/**
 *
 * @author Andres-Marulanda
 */
public class Animales extends Object {
    
    // Atributos
    
    protected String nombre;
    protected int edad;
    protected static int numAnimales;     // Atributo de clase que no podrá ser modificado por ningún objeto.
    
    
    // Constructor
    public Animales(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        numAnimales++;
    }
    
    // Constructor copia.
    public Animales(Animales animal){
        this.nombre = animal.nombre;
        this.edad = animal.edad;
        numAnimales++;
    }
    
    //Setters and getters.
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public static int getNumAnimales(){
        return numAnimales;
    }
    

    // Métodos clone e equals sobreescritos.
    public Animales clone(){
        
        Animales clonado = new Animales(this.nombre, this.edad);        // Animal clonado recibe los atributos del animal que invoca el método.
        return clonado;
    }
    
    public boolean equals(Animales animal){
        
        boolean resultado;
        
        // this. corresponde a los atributos del objeto que invoca el método.
        // animal. correspode a los atributos del clon.
        
        if(animal.getNombre() == this.getNombre() && animal.getEdad() == this.getEdad()){
            resultado = true;
        }else{
            resultado = false;
        }
        
        return resultado;
    }
    
}
