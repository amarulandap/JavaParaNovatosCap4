/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencias.Automoviles;

import Herencias.Automoviles.Automovil;

/**
 *
 * @author Andres-Marulanda
 */

public class TodoTerreno extends Automovil{
    
    //Atributos.
    
    //Constructor.
    public TodoTerreno(byte consumo, String marca) {
        super(consumo, marca);
    }
    
    public byte getConsumo(){
        return (byte)(1.5 * consumo);
    }
  
}
