/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencias.Animal;

/**
 *
 * @author Andres-Marulanda
 */
public class Gato extends Animales{
    
    //Atributos propios de la clase gato.
    private static int vidas;
    
    //Constructor.
    public Gato(String nombre, int edad){
        super(nombre, edad);
        vidas = 7;
    }
    
    public int getVidas(){
        return vidas;
    }
    
    public void restarVidas(){
        vidas -= 1;
    }
}
