/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fresas.UI;

import fresas.beans.Fresa;
import fresas.controller.FresasController;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cbotero
 */
public class FresasIU extends JFrame {
    
    JLabel lbl_familia, lbl_anio, lbl_precio;
    TextField txt_familia, txt_anio, txt_precio;
    JButton btn_crear_actualizar, btn_borrar, btn_recuperar;
    JTable tablaFresas;
    DefaultTableModel modelotabla;
    
    public FresasIU() {
        this.setTitle("Mi ventana");
        this.setSize(1400, 900);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(150, 50);
        pintar();
        this.repaint();
    }
    
    
    public void pintarTabla(ArrayList<Fresa> fresas) {
        
        Object columnas[] = {"id","Nombre","Precio","Año"};
        modelotabla = new DefaultTableModel(columnas,0);
        tablaFresas = new JTable(modelotabla);
        for(Fresa fresa: fresas){
            modelotabla.addRow(new Object[] {fresa.getId(), fresa.getFamilia(), fresa.getPrecio(), fresa.getAnio()});
        }
        JScrollPane jsp = new JScrollPane(tablaFresas);
        jsp.setBounds(10, 150, 600, 69 );
        add(jsp);
    }

    public final void pintar() {
        this.setLayout(null);

        this.lbl_familia = new JLabel("Familia: ");
        this.lbl_familia.setBounds(10, 10, 70, 20);

        this.txt_familia = new TextField();
        txt_familia.setBounds(90, 10, 90, 20);

        this.lbl_anio = new JLabel("Año: ");
        this.lbl_anio.setBounds(10, 40, 70, 20);

        this.txt_anio = new TextField();
        txt_anio.setBounds(90, 40, 90, 20);

        this.lbl_precio = new JLabel("Precio: ");
        this.lbl_precio.setBounds(10, 70, 70, 20);

        this.txt_precio = new TextField();
        txt_precio.setBounds(90, 70, 90, 20);

        add(lbl_familia);
        add(lbl_anio);
        add(lbl_precio);
        add(txt_familia);
        add(txt_anio);
        add(txt_precio);

        this.btn_crear_actualizar = new JButton("Crear actualizar");
        btn_crear_actualizar.setBounds(65, 120, 90, 30);

        this.btn_borrar = new JButton("Eliminar");
        this.btn_borrar.setBounds(170, 120, 90, 30);

        this.btn_borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String fresaId = JOptionPane.showInputDialog("Ingrese id de la fresa a eliminar");
                    FresasController fresasController = new FresasController();
                    if(fresasController.eliminarFresa(Integer.parseInt(fresaId))){
                        JOptionPane.showMessageDialog(rootPane, "Eliminado exitosamente");
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Error eliminado");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(FresasIU.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(rootPane, "Error eliminado");
                }
                
            }
        });

        btn_crear_actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FresasController fresasController = new FresasController();
                    if (fresasController.insertarActualizarFresa(txt_familia.getText(), Integer.parseInt(txt_precio.getText()), Integer.parseInt(txt_anio.getText()))){
                        JOptionPane.showMessageDialog(rootPane, "Insertado exitosamente");
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Error insertando");
                    }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(FresasIU.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(rootPane, "Error insertando");
                }
            }
        });
        
        this.btn_recuperar = new JButton("Recuperar");
        this.btn_recuperar.setBounds(320, 120, 90, 30);

        this.btn_recuperar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Fresa> fresas = new ArrayList<>();
                FresasController fresasController = new FresasController();
                try {
                    fresas = fresasController.listarFresas();
                    pintarTabla(fresas);
                } catch (SQLException ex) {
                    Logger.getLogger(FresasIU.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });

        add(btn_crear_actualizar);
        add(btn_borrar);
        add(btn_recuperar);
    }
    
}
