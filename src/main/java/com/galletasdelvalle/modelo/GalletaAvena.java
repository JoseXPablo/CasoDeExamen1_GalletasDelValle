/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.galletasdelvalle.modelo;

/**
 *
 * @author jpali
 */
public class GalletaAvena extends LoteProducción {

    // Constructor que hereda de LoteProduccion
    public GalletaAvena(String idLote, String fechaFabricacion,
                        int unidadesProducidas, double horasFabricacion) throws Exception {
        super(idLote, "Avena", fechaFabricacion, unidadesProducidas, horasFabricacion);
    }

    // Sobrescribe el método para calcular el costo total del lote
    @Override
    public double calcularCostoProduccion() {
        double costoHora = 5.0;
        double costoFijo = 20.0;
        return (costoHora * getHorasFabricacion()) + costoFijo;
    }
}
