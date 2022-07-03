/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author cbotero
 */
public class Pintura {
    
    
    public static void main(String[] args){
        Dibujo miDibujo = new Dibujo();
        
        Figura[] figuras = new Figura[3];
        
        Figura rectangulo = new Rectangulo(4, 2);
        Figura circulo1 = new Circulo(3);
        Circulo circulo2 = new Circulo(4);
        
        figuras[0] = rectangulo;
        figuras[1] = circulo1;
        figuras[2] = circulo2;
        
        miDibujo.figuras = figuras;
        
        System.out.println("Rectangulo1 " + rectangulo.calcularArea());
        System.out.println("Circulo1 " + circulo1.calcularArea());
        System.out.println("Circulo2 " + circulo2.calcularArea());
        
        System.out.println("El área del dibujo es: " + miDibujo.calcularAreaDibujo());
        
        
    }
    
}
