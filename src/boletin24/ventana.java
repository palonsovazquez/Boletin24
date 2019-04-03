/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin24;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class ventana extends JFrame {

    JPanel panelContenedor, panel1, panel2, panelTexto1, panelTexto2, panelBot1,panelBot2;
    JLabel jlTextoUsuario, jlTextoContrasenha;
    JTextField jtfUsuario, jtfContraseña;
    JButton botPremer, botLimpar,bot2;
    JScrollBar jsbAlumnos;
    JList<Alumno> jLAlumno;
    
    JTextArea jta1;
    
    ArrayList<Alumno> alAlumnos = new ArrayList<Alumno>();

    public void crearVentana() {
        this.setBounds(200, 200, 400, 700);

        panelContenedor = new JPanel();
        panelContenedor.setSize(300, 600);
        panelContenedor.setLayout(new GridLayout(2, 1, 50, 50));

        panel1 = new JPanel(new GridLayout(3, 1, 10, 75));
        panel1.setBackground(Color.red);
        
        panelTexto1 = new JPanel(new FlowLayout());
        
        jlTextoUsuario = new JLabel("Nome");
        jtfUsuario = new JTextField(20);

        panelTexto1.add(jlTextoUsuario);

        panelTexto1.add(jtfUsuario);
        panel1.add(panelTexto1);
        panelContenedor.add(panel1);
        panelTexto2 = new JPanel(new FlowLayout());

        panelTexto2.setSize(300, 50);
        jlTextoContrasenha = new JLabel("contrasenha");
        jlTextoContrasenha.setSize(100,50);
        jtfContraseña = new JPasswordField(20);
        panelTexto2.add(jlTextoContrasenha);
        panelTexto2.add(jtfContraseña);
        panel1.add(panelTexto2);
        panelBot1 = new JPanel(new FlowLayout());
        botPremer = new JButton("Premer");
        botPremer.setSize(100, 50);
        panelBot1.add(botPremer);
        panelBot1.setSize(300, 50);

        botLimpar = new JButton("Limpar");
        botLimpar.setSize(100, 50);
        panelBot1.add(botLimpar);
        panel1.add(panelBot1);

        panel2 = new JPanel(new GridLayout(1, 3, 10, 10));
        panel2.setBackground(Color.BLUE);
        panel2.setSize(300, 300);
        Alumno[] ALAlumnos ={new Alumno("Pepe","primero"),new Alumno("Pedro","segundo"),new Alumno("Luis","primero")};
        jLAlumno = new JList<Alumno>(ALAlumnos);
        panel2.add(jLAlumno);
        panelBot2 = new JPanel(new FlowLayout());
        bot2 = new JButton("BOTON");
        panelBot2.add(bot2);
        jta1 = new JTextArea();
        panel2.add(panelBot2);
        panel2.add(jta1);
        
        
        // Border borde = new Border
        // panel1.setBorder();

        panelContenedor.add(panel2);
        this.add(panelContenedor);

        this.setResizable(false);

        this.setVisible(true);
        this.setDefaultCloseOperation(3);

    }
}
