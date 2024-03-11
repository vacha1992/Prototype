/*
 * Implementa la clase concreta Circle que representa un círculo.
 * Implementa la interfaz Shape y proporciona su propia lógica de dibujo (draw) y clonación (clone).
 */
package principal;

/**
 *
 * @author Chava
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Dibujando un círculo");
    }

    @Override
    public Shape clone() {
        return new Circle(); // Clonar el círculo
    }
}
