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
public class Bateria extends Percusion{
    private int ntarolas;
    private int nplatillos;
    /*Una bateria puede tener un numero indefinido de tarolas y platillos asi 
    * que se permitira incluirlo manualmente.
    */
    public Bateria(int ntarolas, int nplatillos, boolean afinado, String nombre, String color) {
        super(afinado, nombre, color);
        this.ntarolas = ntarolas;
        this.nplatillos = nplatillos;
    }
    
    public int getNtarolas() {
        return ntarolas;
    }

    public void setNtarolas(int ntarolas) {
        this.ntarolas = ntarolas;
    }

    public int getNplatillos() {
        return nplatillos;
    }

    public void setNplatillos(int nplatillos) {
        this.nplatillos = nplatillos;
    }

    @Override
    public String toString() {
        return "Bateria{" + "ntarolas=" + ntarolas + ", nplatillos=" + nplatillos + '}';
    }
    
    
}
