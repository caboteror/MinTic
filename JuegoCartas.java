/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegocartas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cbotero
 */
public class JuegoCartas {
    
    public static List<Integer> tipos(List<Integer> listaCartas){
        //[1,2,5,5,5,1,2,5,5,5]
        List<Integer> noRepetidos = new ArrayList<>();
        for(int i = 0; i<listaCartas.size(); i++){
            if(!(noRepetidos.contains(listaCartas.get(i)))){
                noRepetidos.add(listaCartas.get(i));
            }
        }
        return noRepetidos;
    } 
    
    public static List<Integer> queTipoMeFalta(ArrayList<Integer> cartasFaltantes, List<Integer> categoriaCartasBarajaCompleta, int categoria){
        List<Integer> listaFinal =  new ArrayList<>();
        // ([1,3,6,8], [1,2,5,5,5,1,2,5,5,5], 5 -> [3,8]
        /*
        Solucion 1
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        
        
        for(int i=0; i<categoriaCartasBarajaCompleta.size(); i++){
            if(categoria == categoriaCartasBarajaCompleta.get(i)){
                lista1.add(i);
            }
        }
        
        for(int i=0; i<cartasFaltantes.size(); i++){
            if(lista1.contains(cartasFaltantes.get(i))){
                lista2.add(cartasFaltantes.get(i));
            }
        }
        */
        
        /*
        Solucion 2
        */
        for(int i = 0; i<cartasFaltantes.size(); i++){
            if(categoriaCartasBarajaCompleta.get(cartasFaltantes.get(i))==categoria){
                listaFinal.add(cartasFaltantes.get(i));
            }
        }
        
        return listaFinal;
    }
    
    //[3,5,7,10,15,16],[4,10,5,8]  -> [3,7,15,16]
    public static List<Integer> meFalta(List<Integer> barajaA, List<Integer> barajaB){
        List<Integer> hacenFalta = new ArrayList<>();
        for(int i=0; i<barajaA.size(); i++){
           if(!barajaB.contains(barajaA.get(i))){
               hacenFalta.add(barajaA.get(i));
           }
        }
        
        return hacenFalta;
    }
    //([3,5,7,10,15,16],[4,10,5,8]
    public static Integer cambiar(List<Integer> repetidasJugador1, List<Integer> repetidasJugador2){
        Integer contador1 = 0;
        Integer contador2 = 0;
        
        for(int i=0; i<repetidasJugador1.size(); i++){
            if(!repetidasJugador2.contains(repetidasJugador1.get(i))){
               contador1++;
            }
        }
        
        for(int i=0; i<repetidasJugador2.size(); i++){
            if(!repetidasJugador1.contains(repetidasJugador2.get(i))){
               contador2++;
            }
        }
        
        if(contador1<=contador2){
            return contador1;
        }else{
            return contador2;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        Integer arr[] = {3,5,7,10,15,16};
        for(Integer i: arr){
            lista1.add(i);
        }
        ArrayList<Integer> lista2 = new ArrayList<>();
        Integer arr2[] = {4,10,5,8,24,32};
        for(Integer i: arr2){
            lista2.add(i);
        }
        System.err.println(cambiar(lista2, lista1));
    }
    
}
