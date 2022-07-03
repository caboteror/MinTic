/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author cbotero
 */
public class Pintura2 {
    
    public static void main(String[] args){
        
        Dibujo dibujo1 = new Dibujo();
        
        Figura[] figuras = new Figura[4];
       
        figuras[0]= new Rectangulo(1, 3);
        figuras[1] = new Rectangulo(2, 2);
        figuras[2] = new Circulo(2);
        figuras[3] = new Circulo(4);
        
        Rectangulo[] rectangulos = new Rectangulo[2];
        
        rectangulos[0]  = new Rectangulo(4, 3);
        
        rectangulos[0].esCuadrado();
        
        dibujo1.figuras = figuras;
        
       
        double areaDibujo = dibujo1.calcularAreaDibujo();
        
        
        System.out.println("El área del dibujo es: " + areaDibujo);
        
        
        
        
    }
    
}
