/**
 * @author - Laia Galvez Bach
 * @since - 19/11/2022
 * @version - 3.0
 */

// Clase que representa una figura geométrica
public class Figura {

    // nombre de la figura
    private String nombre;

    /**
     * Constructor de figura.
     * @param nombre - {String} Corresponde al nombre de la figura.
     */
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    

    /**
     * Calcula el área de un triángulo.
     * @param base - {double} base del triangulo.
     * @param altura - {double} altura del triangulo.
     * @return - devuelve el area del triangulo
     */
    public double calcularArea(double base, double altura) {
        return (base * altura) / 2; 
    }

    /**
     * Descripción de la figura.
     * @return - devuelve una cadena con la descripción de la figura.
     */
    public String describir() {
        return "Esta es una figura llamada: " + nombre;
    }

    /**
     * Cambia el nombre de la figura.
     * @param nuevoNombre - {String} - hace referencia al nuevo nombre
     * @return - devuelve el nuevo nombre de la figura.
     */
    public String cambiarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
        return this.nombre;
    }

    /**
     * Verifica si una figura es un cuadrado.
     * @param lado1 {double} - longitud primer lado.
     * @param lado2 {double} - longitud segundo lado.
     * @return - devuelve una cadena de texto dependiendo de si es cuadrado o no.
     */
    public String esCuadrado(double lado1, double lado2) {
        if (lado1 == lado2) {
            return "Es un cuadrado.";
        } else {
            return "No es un cuadrado.";
        }
    }
}

