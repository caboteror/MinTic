/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hola.mintic;

import java.util.Scanner;

/**
 *
 * @author cbotero
 */
public class Case2FuncionesyCondicionales {
    
    public static double areaRectangulo(double base, double altura){
        return base*altura;
    }
    
    public static double areaTriangulo(double base, double altura){
        return base*altura/2;
    }
    
    public static double areaFiguraIf(double base, double altura, String figura){
        double area = 0;
        
        if(figura.equals("triangulo")){
            area = areaTriangulo(base, altura);
        }else if(figura.equals("rectangulo")){
            area = areaRectangulo(base, altura);
        }else{
            System.out.println("La figura no existe");
        }
        return area;
    }
    
    public static double areaFiguraSwitch(double base, double altura, String figura){
        double area = 0;
        
        switch (figura) {
            case "triangulo":
                area = areaTriangulo(base, altura);
                break;
            case "rectangulo":
                area = areaRectangulo(base, altura);
                break;
            default:
                System.out.println("La figura no existe");
                break;
        }
        /* Como regla tambien se puede resumir así:
        switch (figura) {
            case "triangulo" -> area = areaTriangulo(base, altura);
            case "rectangulo" -> area = areaRectangulo(base, altura);
            default -> System.out.println("La figura no existe");
        }
        */
        
        return area;
    }
    
    public static void main(String[] args) {

        System.out.println("Calculando el área de la figura ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el alto de la figura: ");
        double altura = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese la base de la figura: ");
        double base = Double.parseDouble(sc.nextLine());
        System.out.println("El área de la figura como triangulo es: " + areaFiguraIf(base, altura, "triangulo"));
        System.out.println("El área de la figura como rectanguulo es: " + areaFiguraSwitch(base, altura, "rectangulo"));
        double areaFigura = areaFiguraSwitch(base, altura, "cuadrado");
        System.out.println(areaFigura>0 ? "Figura enormme": " :(");

    }
    
}
