/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package andres_marulanda.javaparanovatoscap4;
/**
 * @author Andres-Marulanda
 */

import andres_marulanda.javaparanovatoscap4.ValidacionDatos.*;
import Herencias.Animal.Animales;
import Herencias.Animal.Perro;
import Herencias.Animal.Gato;

import Herencias.HerenciaGeometrica;
import Herencias.Circulo;
import Herencias.Rectangulo;
import Herencias.Cuadrado;

public class PruebasObjetos1 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        pruebaAnimal();
        pruebaHerenciaGeometrica();
        pruebaCirculo();
        pruebaRectangulo();
        pruebaCuadrado();
    }
    
    public static void pruebaAnimal(){
        
        String nombreAnimal = ValidacionDatos.validarCadenasDeCaracteres("Nombre del animal: ");
        int edadAnimal = ValidacionDatos.validarDatoEntero("Edad del Animal en meses: ");
        int numeroAnimales = 0;
        
        boolean comparacion;
        
        // Crear el objeto de la clase Animal.
        Animales animal = new Animales (nombreAnimal, edadAnimal);
        
        // Mostrar el animal creado.
        System.out.println("El nombre del Animal es: " + animal.getNombre() + " Y la edad es: " + animal.getEdad() + " meses");
        
        //Clonar el animal: asignarle a animal clonado los valores de los atributos del animal que invoca.
        Animales animalClonado = animal.clone();
        
        //Mostrar el animal clonado.
        System.out.println("El nombre del Animal clonado es: " + animalClonado.getNombre() + " Y la edad es: " + animalClonado.getEdad() + " meses");
        
        //validar que son iguales.
        comparacion = animal.equals(animalClonado);
        System.out.println(comparacion);
        
        Animales perro = new Animales("Perro", 36);
        Animales gato = new Animales("Gato", 48);
        
        Animales perro1 = new Animales(perro);      // Usar de los constructores copia.
        Animales gato1 = new Animales(gato);
        
        Perro pitbull = new Perro("Pitbull", "Killer", 2);
        Gato  criollo = new Gato("Horus", 20);
        
        System.out.println("\nAnimal: " + perro.getNombre() + " " + perro.getEdad() + " meses");
        System.out.println("Animal: " + gato.getNombre() + " " + gato.getEdad() + " meses");
        System.out.println("Animal_1: " + perro1.getNombre() + " " + perro1.getEdad() + " meses");
        System.out.println("Animal_1: " + gato1.getNombre() + " " + gato1.getEdad() + " meses");
        
        System.out.println("\nPitbull: " + pitbull.getNombre() + " " + pitbull.getEdad() + " meses" + " " + pitbull.getRaza());
        System.out.println("Crillo: " + criollo.getNombre() + " " + criollo.getEdad() + " meses" + criollo.getVidas() + " vidas");
        
        System.out.println("\nNúmero de animales: " + Animales.getNumAnimales());
        
        criollo.restarVidas();
        
        System.out.println("\nCriollo: " + criollo.getNombre() + " " + criollo.getEdad() + " meses " + criollo.getVidas() + " vidas");  
    }
    
    public static void pruebaHerenciaGeometrica(){
        
        HerenciaGeometrica figura1 = new HerenciaGeometrica();                       // Objeto de color rojo y relleno.
        HerenciaGeometrica figura2 = new HerenciaGeometrica("Azul", true);          // Objeto de color azul y sin relleno.
        
        System.out.println("El color de la figura 1 es: " + figura1.getColor());
        System.out.println("¿La figura 1 tiene relleno? " + figura1.isRelleno());
        
        // Para la figura numero 2 usaremos el toString.
        System.out.println(figura2.toString());
        
    }
    
    public static void pruebaCirculo(){
        
        Circulo circulo1 = new Circulo();               // Circulo de radio 1.
        Circulo circulo2 = new Circulo((float)2.5);     // Circulo de radio 2,5. Se puede hacer casteo de los parámetros de una función.
        Circulo circulo3 = new Circulo(8, "Verde", false);
        
        System.out.println("Áreas: Circulo 1: " + circulo1.obtenerArea() + " Circulo 2: " + circulo2.obtenerArea()
                + " Circulo3: " + circulo3.obtenerArea()  );
        
        System.out.println("Perímetros: Circulo 1: " + circulo1.obtenerPerimetro() + " Circulo 2: " + circulo2.obtenerPerimetro()
                + " Circulo 3: " + circulo3.obtenerPerimetro());
        
        System.out.println(circulo1.toString());        
        System.out.println(circulo2.toString());
        System.out.println(circulo3.toString());
        
    }
    
    public static void pruebaRectangulo(){
        
        Rectangulo rectangulo1 = new Rectangulo();                          // Rectángulo de alto = 5 y Ancho = 10.
        Rectangulo rectangulo2 = new Rectangulo((float)20.3, (float)6.5);   // Alto = 6.5, Ancho = 20.3.
        Rectangulo rectangulo3 = new Rectangulo((float)25.9, (float)7, "Morado", false);
        
        System.out.println("Áreas: Rectángulo 1: " + rectangulo1.obtenerArea() + " Rectángulo 2: " + rectangulo2.obtenerArea() 
            + " Rectángulo 3: " + rectangulo3.obtenerArea());
        
        System.out.println("Perímetros: Rectángulo 1: " + rectangulo1.obtenerPerimetro() + " Rectángulo 2: " + rectangulo2.obtenerPerimetro()
            + " Rectángulo 3: " + rectangulo3.obtenerPerimetro());
        
        System.out.println(rectangulo1.toString());        
        System.out.println(rectangulo2.toString());
        System.out.println(rectangulo3.toString());
    }
    
    public static void pruebaCuadrado(){
        
        Cuadrado cuadrado1 = new Cuadrado();                            // Cuadrado de lado 5.
       
        Cuadrado cuadrado2 = new Cuadrado(10);                          // Cuadrado de lado 10.
        
        Cuadrado cuadrado3 = new Cuadrado(15, "Naranja", true);
        
        cuadrado1.setAlto(cuadrado1.getLado());    // Obtengo el valor del lado y le doy dicho valor al alto y el ancho del rectángulo.
        cuadrado1.setAncho(cuadrado1.getLado());
        
        cuadrado2.setAlto(cuadrado2.getAlto());
        cuadrado2.setAncho(cuadrado2.getAncho());
        
        cuadrado3.setAlto(cuadrado3.getAlto());
        cuadrado3.setAncho((float)cuadrado3.getAncho());
        
        System.out.println(cuadrado1.toString());
        System.out.println(cuadrado2.toString());
        System.out.println(cuadrado3.toString());
        
    }
    
}
