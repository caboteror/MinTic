/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author cbotero
 */
public class Vacuna {
    
    private static List<Mascota> mascotas = new ArrayList<Mascota>();
    
    public static void procesar(){
        
        
        
        Scanner sc = new Scanner(System.in);
        String comando = sc.nextLine();
        
        char opcion = comando.charAt(0);
        
        while(opcion == '1' || opcion == '2'){
            if(opcion == '1'){
                agregarMascota(comando);
            }else{
                listarMascotas();
            }
            comando = sc.nextLine();
            opcion = comando.charAt(0);
        }
        
    }
    
    public static void agregarMascota(String datos){
        
        String comandosLista[] = datos.split("#");
        List<String> comandosAgregar = new ArrayList<String>();
        comandosAgregar = Arrays.asList(comandosLista);
        
        String tipoMascota = comandosAgregar.get(1);
        String nombre = comandosAgregar.get(2);
        int edad = Integer.parseInt(comandosAgregar.get(3));
        String raza = comandosAgregar.get(4);
                
        
        if(tipoMascota.equals("Perro")){
            String color = comandosAgregar.get(5);
            Perro perro = new Perro(nombre, edad, raza, color);
            mascotas.add(perro);
        }else if(tipoMascota.equals("Gato")){
            int numeroVidas = Integer.parseInt(comandosAgregar.get(5));
            Gato gato = new Gato(nombre, raza, edad, numeroVidas);
            mascotas.add(gato);
        }
    }
    
    public static void listarMascotas(){
       System.out.println("***Listado de mascotas***");
       for(Mascota miMascota: mascotas){
           System.out.println(miMascota);
       }
    }
    
    public static void main(String[] args) {
        
        procesar();
    }
         
}
