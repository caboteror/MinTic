/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author cbotero
 */
public class Dibujo {
    
    public Figura[] figuras;
    
    
    public double calcularAreaDibujo(){
        double areaDibujo = 0;
        
        for(Figura figura: figuras){
            areaDibujo += figura.calcularArea();
        }
        return areaDibujo;
    }
    
}
