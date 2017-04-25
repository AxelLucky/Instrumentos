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
public class Cuerdas extends Instrumentos {
    
    private int numerocuerdas;
    private boolean acustica;
    /*un instrumento de cuerdas tiene un numero definido de cuerdas y pueden ser acusticos o electroacusticos*/

    public Cuerdas(int numerocuerdas, boolean acustica, String nombre, String color) {
        super(nombre, color);
        this.numerocuerdas = numerocuerdas;
        this.acustica = acustica;
    }
    
    public int getNumerocuerdas() {
        return numerocuerdas;
    }

    public void setAcustica(boolean acustica) {
        this.acustica = acustica;
    }

    public boolean isAcustica() {
        return acustica;
    }

    public void setNumerocuerdas(int numerocuerdas) {
        this.numerocuerdas = numerocuerdas;
    }
    
    public void electrica(){
    if (acustica)
                System.out.println("Es un instrumento acustico");
    else
                System.out.println("Es un instrumento electrico");
    }

    @Override
    public String toString() {
        return "Cuerdas{" + "numerocuerdas=" + numerocuerdas + ", acustica=" + acustica + '}';
    }
    
}
