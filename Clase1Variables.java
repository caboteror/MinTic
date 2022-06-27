/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hola.mintic;

/**
 *
 * @author cbotero
 */
public class Clase1Variables {

    public static void main(String[] args) {

        /*Se crean 
    Tipo nombre y termina con ;
    en lo posible inicializar las variables
    Tipo nombre = valorInicial;
         */
        //númericas
        int edad = 10;
        int edad2 = 21;
        double edadPromedio = (10.0+21.0)/2;
        //texto
        String nombre = "Carlos";
        //booleanas (Verdadero - falso)
        boolean entendi = true;
        boolean flag = true;
        
        
        //Operaciones con variables
        
        
        //Imprimmir las variiables
        System.out.println("Imprimienddo las variables ");
        System.out.println(edad);
        System.out.println("Módulo es cuanto sobra despues de la división: "+ (edad%3));
        System.out.println("Dividienndo enteros: " + (edad+edad2)/2);
        
        System.out.println("Dividienndo cono decimmales: " + edadPromedio);
        
        System.out.println("Imprimienddo el nombre " +  nombre + " Botero");
        //Asignando variable
        nombre = "Carlos ".concat("Botero");
        System.out.println("Imprimienddo el nombre " +  nombre);
        System.out.println(entendi);
        System.out.println(flag);
        System.out.println("Vandera negada " + !flag);

    }

}
