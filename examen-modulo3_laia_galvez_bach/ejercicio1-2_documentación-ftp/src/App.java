
/**
 * @author - Laia Galvez Bach
 * @since - 19/11/2022
 * @version - 3.0
 */

/**
 * Clase principal App.
 * Esta clase corresponde a una App que realiza el cálculo del área de una figura.
 */
public class App {

    /**
     * Método principal de la aplicación.
     * En este metodo se crea figura, calcula el area, describe propiedades y comprueba si es un cuadrado o no.
     */
    public static void main(String[] args) throws Exception {

        // Creación de instancia figura a Triángulo
        Figura figura = new Figura("Triángulo");

        System.out.println(figura.describir());

        // Calculo del area de la figura.
        double area = figura.calcularArea(5, 10);
        System.out.println("Área del triángulo: " + area);

        // Cambio de nombre de la figura de Triángulo a Cuadrado.
        String nuevoNombre = figura.cambiarNombre("Cuadrado");
        System.out.println("Nuevo nombre de la figura: " + nuevoNombre);

        // Comprobación de si es Cuadrado o no, teniendo en cuenta los lados.
        String resultadoCuadrado = figura.esCuadrado(5, 5);
        System.out.println(resultadoCuadrado);

    }

}
