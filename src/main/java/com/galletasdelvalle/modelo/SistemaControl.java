/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.galletasdelvalle.modelo;

/**
 *
 * @author jpali
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SistemaControl {
    private ArrayList<LoteProducción> lotes;

    public SistemaControl() {
        lotes = new ArrayList<>();
    }

    public void agregarLote(LoteProducción lote) {
        lotes.add(lote);
    }

    public void ordenarPorFecha() {
        Collections.sort(lotes, new Comparator<LoteProducción>() {
            @Override
            public int compare(LoteProducción l1, LoteProducción l2) {
                return l1.getFechaFabricacion().compareTo(l2.getFechaFabricacion());
            }
        });
    }

    public void ordenarPorHoras() {
        Collections.sort(lotes, new Comparator<LoteProducción>() {
            @Override
            public int compare(LoteProducción l1, LoteProducción l2) {
                return Double.compare(l1.getHorasFabricacion(), l2.getHorasFabricacion());
            }
        });
    }

    public void mostrarLotes() {
        for (LoteProducción lote : lotes) {
            System.out.println(lote.toString() + " | Costo: " + lote.calcularCostoProduccion());
        }
    }
}
