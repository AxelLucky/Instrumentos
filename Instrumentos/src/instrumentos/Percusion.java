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
public class Percusion extends Instrumentos{
    private boolean afinado;
    private static final boolean golpeados=true;
    /*Todos los instrumentos de percusion son golpeados o sacudidos,
    *pero estos pueden ser afinados o no
    */
    
    public Percusion(boolean afinado, String nombre,String color) {
        super(nombre,color);
        this.afinado = afinado;
    }

    public boolean isAfinado() {
        return afinado;
    }

    public void setAfinado(boolean afinado) {
        this.afinado = afinado;
    }

    public static boolean isGolpeados() {
        return golpeados;
    }
    
    @Override
    public String toString() {
        return "Percusion{" + "afinado=" + afinado + '}';
    }
    public void altura(){
        if (afinado)
            System.out.println("Instrumento de altura definida");
        else
            System.out.println("Instrumento de altura indefinida");
    }
}
