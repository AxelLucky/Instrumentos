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
public class Pruebainstrumentos {
    public static void main (String [] args){
        Guitarra g =new Guitarra("Flamenco",6,true,"Guitarra","Maple");
        Bajo b=new Bajo("tenor",4,false,"Bajo","Blanco con negro");
        Bateria bat=new Bateria(5,3,false,"Bateria","Negra");
        Flauta f=new Flauta("madera","Flauta", "Hueso");
        Pandero p=new Pandero(8,false,"Pandero","rojo");
        
        System.out.println("En mi casa tengo una "+g.getNombre()+" "+g.getTipo()
                +" de color "+g.getColor());
        g.electrica();
        System.out.println(" ");
        System.out.println("Tambien tengo un "+b.getNombre()+" "
                +b.getAfinacion()+" de color "+b.getColor());
        b.electrica();
        System.out.println(" ");
        System.out.println("En mi casa tengo una "+bat.getNombre()+" con "
                +bat.getNtarolas()+" tarolas y "+bat.getNplatillos()+
                " platillos de color "+bat.getColor());
        bat.altura();
        System.out.println(" ");
        System.out.println("En mi casa tengo una "+p.getNombre()+" con "
                +p.getNcampanillas()+" campanitas y de color "+p.getColor());
        p.altura();
        System.out.println(" ");
        System.out.println("En mi casa tengo una "+f.getNombre()+" hecha de "
                +f.getMaterial()+" de color "+f.getColor());
    }
}
