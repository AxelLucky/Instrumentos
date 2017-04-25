/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentos;

/**
 *
 * @author Alejandro Puig
 */
public class Guitarra extends Cuerdas{
    private String tipo;
    /* Pueden ser de tipo flamenco, rockera, funk,pop.Dependiendo del estilo de 
    *  musica que se toca
    */

    public Guitarra(String tipo, int numerocuerdas, boolean acustica, String nombre, String color) {
        super(numerocuerdas, acustica, nombre, color);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Guitarra{" + "tipo=" + tipo + '}';
    }
    
}
