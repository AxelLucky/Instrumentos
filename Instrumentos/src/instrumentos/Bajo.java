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
public class Bajo extends Cuerdas {
    private String afinacion;
    /*Los bajos pueden tener 2 afinaciones:
    * tenor:la, re, sol, do.
    * piccolo: mi, la, re, sol 
    */

    public Bajo(String afinacion, int numerocuerdas, boolean acustica, String nombre, String color) {
        super(numerocuerdas, acustica, nombre, color);
        this.afinacion = afinacion;
    }
 
    public String getAfinacion() {
        return afinacion;
    }

    public void setAfinacion(String afinacion) {
        this.afinacion = afinacion;
    }

    @Override
    public String toString() {
        return "Bajo{" + "afinacion=" + afinacion + '}';
    }
    
    
}
