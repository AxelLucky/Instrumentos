/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentos;

/**
 *
 * @author Propietario
 */
public class Instrumentos {

    /**
     * @param args the command line arguments
     */
    
    private static final boolean escuchados=true; 
    /*los instrumentos mas alla de cual sea es escuchado*/
    private String nombre;
    private String color;
        /* todo instrumento tiene un color y un nombre */

    public Instrumentos(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    public static boolean isEscuchados() {
        return escuchados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Instrumentos{" + "nombre=" + nombre + ", color=" + color + '}';
    }

    
}
    

