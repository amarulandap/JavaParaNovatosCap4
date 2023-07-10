/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Varios;

/**
 *
 * @author Andres-Marulanda
 */
public class Rector extends Profesor {
    
    /**
     * Los atributos serán los mismos de la clase profesor, que son nombre y sueldo.
     * Los setters y los getters también serán los de la clase madre Profesor.
     */
    
    // Constructor.
    
    public Rector(String nombre, int sueldo){
        super(nombre, sueldo);
    }
    
    public void setNombre(String nombre){
        super.setNombre(nombre);
    }
    
    public String getNombre(){
        return super.getNombre();
    }
    
    public void setSueldo(int sueldo){
        super.setSueldo(sueldo);
    }
    
    public int getSueldo(){
        return (int) (1.25 * this.sueldo);  // Los rectores ganan un 25% mas que los profesores.
    }
    
    
    
}
