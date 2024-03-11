/*
 * Contiene el programa principal (main method) donde se ejemplifica el uso del patrón Prototype.
 * Se crea una instancia inicial de una figura geométrica y luego se clona para crear una nueva instancia.
 */

package principal;

/**
 *
 * @author Chava
 */
public class PrototypeExample {
    public static void main(String[] args) {
        // Crear una instancia inicial de un círculo
        Shape initialCircle = new Circle();
        initialCircle.draw();

        // Clonar el círculo para crear una nueva instancia
        Shape clonedCircle = initialCircle.clone();
        clonedCircle.draw();

        // Crear una instancia inicial de un rectángulo
        Shape initialRectangle = new Rectangle();
        initialRectangle.draw();

        // Clonar el rectángulo para crear una nueva instancia
        Shape clonedRectangle = initialRectangle.clone();
        clonedRectangle.draw();
    }
    
}
