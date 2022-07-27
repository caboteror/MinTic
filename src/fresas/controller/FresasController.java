/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fresas.controller;

import fresas.DAO.FresasDAO;
import fresas.beans.Fresa;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cbotero
 */
public class FresasController {
    
    private static FresasDAO conexion;
    
    private static FresasDAO getConexion(){
        if (conexion != null){
            return conexion;
        }else{
            conexion = new FresasDAO();
            return conexion;
        }
    }
    
    
    public boolean insertarActualizarFresa(String nombreFamilia, int precio, int anio) throws SQLException{
        Fresa fresa = new Fresa();
        fresa.setFamilia(nombreFamilia);
        fresa.setPrecio(precio);
        fresa.setAnio(anio);   
        return FresasDAO.insertValues(getConexion(), fresa);
        
    }
    
    public boolean eliminarFresa(int fresaId) throws SQLException{
        return FresasDAO.delete(getConexion(), fresaId);
    }
    
    public ArrayList<Fresa> listarFresas() throws SQLException{
        return FresasDAO.select(getConexion());
    }
    
    public Fresa getFresasById(){
        return null;
    }
    
}
