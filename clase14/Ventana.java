/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase14;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author cbotero
 */
public class Ventana extends JFrame{
    
    public JLabel lbl_nombre, lbl_primerApellido, lbl_segundoApellido, lbl_titulo;
    public JTextField txt_nombre, txt_primerApellido, txt_segundoApellido;
    public JTable datosPersonales;
    public JButton boton;
    
    public Ventana(){
        this.setTitle("Mi ventana de prueba");
        this.setSize(800, 700);
        this.setLocation(450, 150);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void pintar(){
        this.setLayout(null);
        lbl_titulo = new JLabel("Mi Formulario");
        lbl_titulo.setBounds(380, 10, 150, 20);
        add(lbl_titulo);
        lbl_nombre = new JLabel("Nombre: ");
        lbl_nombre.setBounds(10, 50, 150, 20);
        lbl_nombre.setBackground(Color.red);
        add(lbl_nombre);
        lbl_primerApellido = new JLabel("Primer apellido: ");
        lbl_primerApellido.setBounds(10, 80, 150, 20);
        add(lbl_primerApellido);
        lbl_segundoApellido = new JLabel("Segundo apellido: ");
        lbl_segundoApellido.setBounds(10, 110, 150, 20);
        add(lbl_segundoApellido);
        
        txt_nombre = new JTextField(20);
        txt_nombre.setBounds(170, 50, 300, 20);
        add(txt_nombre);
        txt_primerApellido = new JTextField(30);
        txt_primerApellido.setBounds(170, 80, 300, 20);
        add(txt_primerApellido);
        txt_segundoApellido = new JTextField(30);
        txt_segundoApellido.setBounds(170, 110, 300, 20);
        add(txt_segundoApellido);  
        
        boton = new JButton("Enviar");
        boton.setBounds(350, 250, 150, 40);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dato = JOptionPane.showInputDialog("Ingresa un dato");
                System.out.println(dato);
            }
        });
        
        add(boton);
        
        String[] encabezados = {"Nombre", "Primer Apellido", "Segundo Apellido"};
        String[][] valores ={
            {"Diego", "Hernandez", "Lizarazo"},
            {"María", "Martínez", "López"},
            {"Darwin", "Arrechea", "Castillo"}
        };
        datosPersonales = new JTable(valores, encabezados);
        JScrollPane jsp = new JScrollPane(datosPersonales);
        
        jsp.setBounds(10, 150, 600, 69 );
        add(jsp);
        
        
        
    }
    
}
