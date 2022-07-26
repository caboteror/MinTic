/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author cbotero
 */
public class ConexionBD {
    
    Connection con;
    
    public ConexionBD(){
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ConexionBD conexion = new ConexionBD();
            System.out.println("Antes");
            select(conexion);
            //update(conexion);
            delete(conexion);
            System.out.println("Despues");
            select(conexion);
            conexion.con.close();
        } catch (SQLException ex) {
            System.out.println("algo pasó" + ex);
        }
    }
    
    public static void delete(ConexionBD conexion) throws SQLException {
        String sql = "delete from fresa where fre_id = ?";
        PreparedStatement ps = conexion.con.prepareStatement(sql);
        ps.setInt(1, 4);
        int rowsDeleted = ps.executeUpdate();
        if (rowsDeleted >0){
            System.out.println("Valor eliminado");
        }
    }

    public static void update(ConexionBD conexion) throws SQLException {
        String sql = "update fresa set fre_anio = ? where fre_id = ?";
        PreparedStatement ps = conexion.con.prepareStatement(sql);
        ps.setInt(1, 2023);
        ps.setInt(2, 2);
        int rowsUpdated = ps.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Se actualizarion " + rowsUpdated + " filas");
        }
    }
    
    public static void insert(ConexionBD conexion) throws SQLException{
        Scanner sc = new Scanner(System.in);
        String familia = sc.nextLine();
        int precio = sc.nextInt();
        int anio = sc.nextInt();
        insertValues(conexion, familia, precio, anio);
    }

    public static void insertValues(ConexionBD conexion, String nombreFamilia, int precio, int anio) throws SQLException {
        String sql = "INSERT INTO fresa (fre_familia, fre_precio, fre_anio) values(?, ?, ?)";
        PreparedStatement ps = conexion.con.prepareStatement(sql);
        ps.setString(1, nombreFamilia);
        ps.setInt(2, precio);
        ps.setInt(3, anio);
        int rowsInserted = ps.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Inserción exitosa!");
        }
        System.out.println("Se insertó " + nombreFamilia + " - " + precio + " - " + anio);
        
    }

    public static void select(ConexionBD conexion) throws SQLException {
        Statement st;
        st = conexion.con.createStatement();
        ResultSet rs;
        rs = st.executeQuery("select * from fresa");
        while (rs.next()) {
            System.out.println("Freid = " + rs.getInt("fre_id") + " FreFamilia: " + rs.getString("fre_familia")
                    + " FrePrecio: " + rs.getInt("fre_precio")
                    +  " FreAño: " + rs.getInt("fre_anio"));
        }
    }
    
}
