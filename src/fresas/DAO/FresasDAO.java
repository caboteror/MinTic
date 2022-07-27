/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fresas.DAO;

import fresas.beans.Fresa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cbotero
 */
public class FresasDAO {

    public Connection con;
    
    public FresasDAO(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/frutas", "root", Utils.PASS);
            if(con != null){
                System.out.println("Conectado a la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("No encontró la clase com.mysql.cj.jdbc.Driver" + ex);
        } catch (SQLException ex) {
            System.out.println("No se conecto a la base de datos" + ex);
        }
    }

    public static boolean delete(FresasDAO conexion, int freId) throws SQLException {
        String sql = "delete from fresa where fre_id = ?";
        PreparedStatement ps = conexion.con.prepareStatement(sql);
        ps.setInt(1, freId);
        int rowsDeleted = ps.executeUpdate();
        if (rowsDeleted >0){
            System.out.println("Valor eliminado");
            return true;
        }else{
            return false;
        }
    }

    public static boolean update(FresasDAO conexion) throws SQLException {
        String sql = "update fresa set fre_anio = ? where fre_id = ?";
        PreparedStatement ps = conexion.con.prepareStatement(sql);
        ps.setInt(1, 2023);
        ps.setInt(2, 2);
        int rowsUpdated = ps.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Se actualizarion " + rowsUpdated + " filas");
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean insertValues(FresasDAO conexion,Fresa fresa) throws SQLException {
        String sql = "INSERT INTO fresa (fre_familia, fre_precio, fre_anio) values(?, ?, ?)";
        PreparedStatement ps = conexion.con.prepareStatement(sql);
        ps.setString(1, fresa.getFamilia());
        ps.setInt(2, fresa.getPrecio());
        ps.setInt(3, fresa.getAnio());
        int rowsInserted = ps.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Se insertó " + fresa.getFamilia() + " - " + fresa.getPrecio() + " - " + fresa.getAnio());
            return true;
        }else{
            return false;
        }
        
        
    }

    public static ArrayList<Fresa> select(FresasDAO conexion) throws SQLException {
        Statement st;
        st = conexion.con.createStatement();
        ResultSet rs;
        rs = st.executeQuery("select * from fresa");
        Fresa fresa;
        ArrayList<Fresa> fresas =  new ArrayList<>();
        while (rs.next()) {
            fresa = new Fresa();
            fresa.setId(rs.getInt("fre_id"));
            fresa.setFamilia(rs.getString("fre_familia"));
            fresa.setPrecio(rs.getInt("fre_precio"));
            fresa.setAnio(rs.getInt("fre_anio"));
            fresas.add(fresa);
        }
        return fresas;
    }
}
