/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.galletasdelvalle.modelo;

import javax.swing.*;
import java.awt.event.*;

public class VentanaRegistrar extends JFrame {

    private JLabel etiquetaId, etiquetaTipo, etiquetaFecha, etiquetaUnidades, etiquetaTiempo;
    private JTextField campoId, campoFecha, campoUnidades, campoTiempo;
    private JComboBox comboTipo;
    private JButton botonGuardar;
    private SistemaControl sistema;

    public VentanaRegistrar(SistemaControl sistema) {
        this.sistema = sistema;

        setTitle("Registrar Lote");
        setLayout(null);
        setSize(400, 300);
        setLocationRelativeTo(null);

        etiquetaId = new JLabel("ID del Lote:");
        etiquetaId.setBounds(30, 30, 100, 25);
        add(etiquetaId);

        campoId = new JTextField();
        campoId.setBounds(150, 30, 180, 25);
        add(campoId);

        etiquetaTipo = new JLabel("Tipo de Galleta:");
        etiquetaTipo.setBounds(30, 70, 120, 25);
        add(etiquetaTipo);

        comboTipo = new JComboBox();
        comboTipo.addItem("Avena");
        comboTipo.addItem("Chocolate");
        comboTipo.setBounds(150, 70, 180, 25);
        add(comboTipo);

        etiquetaFecha = new JLabel("Fecha de Fabricación:");
        etiquetaFecha.setBounds(30, 110, 150, 25);
        add(etiquetaFecha);

        campoFecha = new JTextField();
        campoFecha.setBounds(150, 110, 180, 25);
        add(campoFecha);

        etiquetaUnidades = new JLabel("Unidades Producidas:");
        etiquetaUnidades.setBounds(30, 150, 150, 25);
        add(etiquetaUnidades);

        campoUnidades = new JTextField();
        campoUnidades.setBounds(150, 150, 180, 25);
        add(campoUnidades);

        etiquetaTiempo = new JLabel("Tiempo (horas):");
        etiquetaTiempo.setBounds(30, 190, 150, 25);
        add(etiquetaTiempo);

        campoTiempo = new JTextField();
        campoTiempo.setBounds(150, 190, 180, 25);
        add(campoTiempo);

        botonGuardar = new JButton("Guardar Lote");
        botonGuardar.setBounds(130, 230, 130, 30);
        add(botonGuardar);

        botonGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String id = campoId.getText();
                    String tipo = comboTipo.getSelectedItem().toString();
                    String fecha = campoFecha.getText();
                    int unidades = Integer.parseInt(campoUnidades.getText());
                    double tiempo = Double.parseDouble(campoTiempo.getText());

                    if (tipo.equalsIgnoreCase("Avena")) {
                        sistema.agregarLote(new LoteGalletaAvena(id, fecha, unidades, tiempo));
                    } else {
                        sistema.agregarLote(new LoteGalletaChocolate(id, fecha, unidades, tiempo));
                    }

                    JOptionPane.showMessageDialog(null, "Lote registrado correctamente.");
                    dispose();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al registrar: " + ex.getMessage());
                }
            }
        });
    }
}