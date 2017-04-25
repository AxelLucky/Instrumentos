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
public class Pandero extends Percusion{
    private int ncampanillas;
    
    /*Los panderos pueden tener un numero indefinido de campanillas*/
    
    public Pandero(int ncampanillas, boolean afinado, String nombre, String color) {
        super(afinado,nombre, color);
        this.ncampanillas = ncampanillas;
    }

    public int getNcampanillas() {
        return ncampanillas;
    }

    public void setNcampanillas(int ncampanillas) {
        this.ncampanillas = ncampanillas;
    }

    @Override
    public String toString() {
        return "Pandero{" + "ncampanillas=" + ncampanillas + '}';
    }
    
}
