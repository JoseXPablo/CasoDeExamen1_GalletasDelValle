/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.galletasdelvalle.modelo;

import javax.swing.*;
import java.util.ArrayList;

public class VentanaListar extends JFrame {

    private JTable tabla;
    private JScrollPane scroll;
    private SistemaControl sistema;

    public VentanaListar(SistemaControl sistema) {
        this.sistema = sistema;

        setTitle("Lista de Lotes Registrados");
        setLayout(null);
        setSize(600, 400);
        setLocationRelativeTo(null);

        String[] columnas = {"ID", "Tipo", "Fecha", "Unidades", "Tiempo"};
        ArrayList<LoteProducción> lotes = sistema.getLotes();
        Object[][] datos = new Object[lotes.size()][5];

        for (int i = 0; i < lotes.size(); i++) {
            LoteProducción l = lotes.get(i);
            datos[i][0] = l.getIdLote();
            datos[i][1] = l.getTipoGalleta();
            datos[i][2] = l.getFechaFabricacion();
            datos[i][3] = l.getUnidadesProducidas();
            datos[i][4] = l.getHorasFabricacion();
        }

        tabla = new JTable(datos, columnas);
        scroll = new JScrollPane(tabla);
        scroll.setBounds(20, 20, 550, 300);
        add(scroll);
    }
}

