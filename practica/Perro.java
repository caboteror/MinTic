/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author cbotero
 */
public class Perro extends Mascota{
    private String color;
    
    public Perro(String nombre, int edad, String raza, String color){
        super(nombre, edad, raza);
        this.color = color;
    }
    
    public String toString(){
        return "\n\tTipo mascota Perro\n"+super.toString()+"\n\tColor: "+this.color;
    }
}
