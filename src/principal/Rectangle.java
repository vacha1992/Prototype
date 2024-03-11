/*
 * Implementa la clase concreta Rectangle que representa un rectángulo.
 *  Implementa la interfaz Shape y proporciona su propia lógica de dibujo (draw) y clonación (clone).
 */

package principal;

/**
 *
 * @author Chava
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Dibujando un rectángulo");
    }

    @Override
    public Shape clone() {
        return new Rectangle(); // Clonar el rectángulo
    }
}
