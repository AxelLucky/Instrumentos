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
public class Viento extends Instrumentos{
    public static final boolean soplados=true;
    /*Todos los instrumentos de viento son soplados para emitir sonido*/

    public Viento(String nombre, String color) {
        super(nombre, color);
    }

    public static boolean isSoplados() {
        return soplados;
    }
  
    @Override
    public String toString() {
        return "Viento{" + '}';
    }
    
}
