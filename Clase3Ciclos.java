/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hola.mintic;

/**
 *
 * @author cbotero
 */
public class Clase3Ciclos {
    
    public static boolean esPrimo(int num){
        for(int i = 2; i< num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        int i= 1;
        while(i<=100){
            if(esPrimo(i)){
                System.out.println(i);
            }
            i++;
        }
    }
    
}
