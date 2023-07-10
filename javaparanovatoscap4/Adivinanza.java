/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andres_marulanda.javaparanovatoscap4;

/**
 *
 * @author Andres-Marulanda
 */
public class Adivinanza {
    
    // Atributos.
    
    //Constructores.
    
    // la clase genera un mensaje de error ya que se está tratando de invocar al constructor dentro de si mismo.
    // recursive constructor invocation.
    
    /**
     * public Adivinanza(int i){
        this(10);                                 // Invocando al mismo constructor.
        System.out.println("Mi numero es " + i);
    }
    
    public Adivinanza(String s){
        this("Soy un enigma");
        System.out.println(s);
    }*/
    
    public void saluda(){
        System.out.println("Hola");
    }
    
}
