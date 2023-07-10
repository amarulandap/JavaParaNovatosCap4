/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencias.Automoviles;

import Herencias.Automoviles.Vehiculo;

/**
 *
 * @author Andres-Marulanda
 */

public class Automovil extends Vehiculo {
    
    //Atributos propios.
    protected byte consumo;       //Consumo de combustible.
    
    //Constructor
    public Automovil(byte consumo, String marca) {
        super(marca);
        this.consumo = consumo;
    }
    
    //Setters and getters
    public byte getConsumo() {
        return consumo;
    }

    public void setConsumo(byte consumo) {
        this.consumo = consumo;
    }   
}

