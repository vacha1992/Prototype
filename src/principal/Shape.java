/*
 *  Define la interfaz Shape que representa una figura geométrica.  
 *  Contiene el método draw para dibujar la figura y el método clone 
 *  que será implementado por las clases concretas para permitir la clonación de instancias.
 */
package principal;

/**
 *
 * @author Chava
 */

public interface Shape extends Cloneable{
    void draw();
    Shape clone();
}
