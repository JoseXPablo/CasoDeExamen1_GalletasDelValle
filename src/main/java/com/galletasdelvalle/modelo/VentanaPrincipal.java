/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Clase de interfaz gráfica (GUI) que permite al usuario interactuar con el sistema.

 //Utiliza componentes Swing para registrar, listar y visualizar información.


package com.galletasdelvalle.modelo;

import javax.swing.*;
import java.awt.event.*;

public class VentanaPrincipal extends JFrame {
    
// Botón para abrir la ventana de registro de nuevos lotes
    private JButton botonRegistrar;
// Botón para mostrar los lotes registrados en una tabla
    private JButton botonListar;
// Botones de funciones pendientes (Decoración)
    private JButton botonGuardar;
    private JButton botonCargar;
    
    private JLabel etiquetaTitulo;
    private SistemaControl sistema;

    public VentanaPrincipal() {
        sistema = new SistemaControl();

        setTitle("Galletas del Valle - Control de Producción");
        setLayout(null);
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        etiquetaTitulo = new JLabel("Sistema de Control de Producción de Galletas");
        etiquetaTitulo.setBounds(80, 20, 350, 30);
        add(etiquetaTitulo);

        botonRegistrar = new JButton("Registrar Lote");
        botonRegistrar.setBounds(80, 80, 150, 30);
        add(botonRegistrar);

        botonListar = new JButton("Listar Lotes");
        botonListar.setBounds(260, 80, 150, 30);
        add(botonListar);

        botonGuardar = new JButton("Guardar Datos");
        botonGuardar.setBounds(80, 130, 150, 30);
        add(botonGuardar);

        botonCargar = new JButton("Cargar Datos");
        botonCargar.setBounds(260, 130, 150, 30);
        add(botonCargar);

        botonRegistrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VentanaRegistrar ventana = new VentanaRegistrar(sistema);
                ventana.setVisible(true);
            }
        });

        botonListar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VentanaListar ventana = new VentanaListar(sistema);
                ventana.setVisible(true);
            }
        });

        botonGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Función de guardar datos (pendiente).");
            }
        });

        botonCargar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Función de cargar datos (pendiente).");
            }
        });
    }

    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
}

