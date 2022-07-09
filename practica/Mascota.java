/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author cbotero
 */
public class Mascota {
    
    private String nombre;
    private int edad;
    private String raza;
    
    public Mascota(String nombre, int edad, String raza){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }
    
    @Override
    public String toString(){
        
        return "\tNombre: " + nombre +
                "\n\tEdad: " + edad + " años" +
                "\n\tRaza: " + raza;
    }
}
