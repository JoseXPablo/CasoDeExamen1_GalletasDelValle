/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.galletasdelvalle.modelo;

/**
 * Universidad Fidélitas Grupo 5 Programación Cliente / Servidor Caso Número 1
 *
 * @author jpali
 */
public class LoteGalletaAvena extends GalletaAvena implements ControlCalidad {

    public LoteGalletaAvena(String idLote, String fechaFabricacion,
            int unidadesProducidas, double horasFabricacion) throws Exception {
        super(idLote, fechaFabricacion, unidadesProducidas, horasFabricacion);
    }

    @Override
    public boolean inspeccionar() {
        // Aprobamos solo si hay unidades y la fabricación fue menor o igual a 24 horas
        return getUnidadesProducidas() > 0 && getHorasFabricacion() <= 24;
    }
}
