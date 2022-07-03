/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author cbotero
 */
public class Rectangulo extends Figura implements IOperaciones{
    
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.base*this.altura;
    }
    
    public void esCuadrado(){
        if(this.base == this.altura){
            System.out.println("Es un cuadrado");
        }else{
            System.out.println("No es un cuadrado");
        }
    }
    
    public Rectangulo(double base, double altura){
        this.altura = altura;
        this.base = base;
    }
    
    public Rectangulo(double base, double altura, String nombre){
        super(nombre);
        this.altura = altura;
        this.base = base;
        
    }
    
    public Rectangulo(double base, double altura, String nombre, String color){
        super(nombre, color);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularPerimetro() {
        return 2*this.altura+2*this.base;
    }

    
    
    
}
