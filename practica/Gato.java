/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author cbotero
 */
public class Gato extends Mascota{
    private int cantidadVidas;
    
    public Gato(String nombre, String raza,int edad, int cantidadVidas){
        super(nombre, edad, raza);
        this.cantidadVidas = cantidadVidas;
    }

    @Override
    public String toString() {
        return "\n\t Tipo mascota Gato\n" + super.toString() +"\n\tnumero de vidas: " + this.cantidadVidas;
    }    
}
