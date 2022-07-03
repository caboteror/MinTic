/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author cbotero
 */
public class Circulo extends Figura{

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI*this.radio*this.radio;
    }
    
}
