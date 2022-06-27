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
public class PacticaTiposSangre {

    //Función que valida si existe el tipo de sangre en bodega.
    public static boolean existeTipoSangre(String tipoSangre){
        //validamos el tipo de sangre
        switch (tipoSangre){
            case "o+":
                return true;
            case "o-":
                return true;
            case "a+":
                return true;
            case "a-":
                return true;
            case "b+":
                return true;
            case "b-":
                return true;
            case "ab+":
                return true;
            case "ab-":
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
       //Capturamos el dato de pantalla
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su tipo de sangre: ");
        String tipoSangre = sc.nextLine();
        
        if(existeTipoSangre(tipoSangre.toLowerCase())){
            System.out.println("EL tipo de sangre "+ tipoSangre + " si se encuentra el bodega");
        }else{
            System.out.println("EL tipo de sangre "+ tipoSangre + " no se encuentra el bodega");
        }
        
        
        
         
    }

}
