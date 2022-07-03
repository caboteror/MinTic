/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author cbotero
 */
public abstract class Figura {
    
    private String nombre;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }
    public Figura(){
        
    }
    
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    public Figura(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double calcularArea();
}
