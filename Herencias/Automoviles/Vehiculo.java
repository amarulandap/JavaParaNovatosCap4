/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencias.Automoviles;

/**
 *
 * @author Andres-Marulanda
 */

public class Vehiculo {
    
    //Atributos
    
    protected String marca;
    
    //Constructor
    public Vehiculo(String marca){
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
