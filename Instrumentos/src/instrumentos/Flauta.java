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
public class Flauta extends Viento{
    private String material;
    /*es tomado como clasificacion el material en el que esta hecho ya que 
    * afecta el sonido
    */
    public Flauta(String material, String nombre, String color) {
        super(nombre, color);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Flauta{" + "material=" + material + '}';
    }
    
}
