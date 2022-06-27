/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hola.mintic;

/**
 *
 * @author cbotero
 */
public class EjemploArregloSimple {
    
    public static void buscarConFor(){
        int numeros[] = {1,2,3,7,5,6}; 
        for(int numero:numeros){
            if(numero % 2 == 0){
                System.out.println("Encontramos un número par");
                break;
            }else{
                System.out.println("Ejecutamos una acción");
            }
        }
    }
    
    public static void buscarConwhlile(){
        int numeros[] = {1,3,7,5,6}; 
        int i = 0;
        while(numeros[i]% 2 != 0){
            System.out.println("Ejecutamos una acción");
            i++;
        }
        if(numeros[i] % 2 == 0){
            System.out.println("Encontramos un número par");
        }
    }
    
    public static void main(String[] args) {
        buscarConFor();
        buscarConwhlile();
        
    }
    
}
