/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.galletasdelvalle.modelo;

/**
 * Universidad Fidélitas
 * Grupo 5
 * Programación Cliente / Servidor
 * Caso Número 1
 * @author Ángel
 */
public class GalletaChocolate extends LoteProducción {

    // Constructor que hereda de LoteProducción
    public GalletaChocolate(String idLote, String fechaFabricacion,
                            int unidadesProducidas, double horasFabricacion) throws Exception {
        super(idLote, "Chocolate", fechaFabricacion, unidadesProducidas, horasFabricacion);
    }

    // Sobrescribe el método abstracto para calcular el costo total del lote
    @Override
    public double calcularCostoProduccion() {
        double costoHora = 7.0;   // Suponemos que chocolate cuesta más producir
        double costoFijo = 25.0;  // Costo base del lote
        return (costoHora * getHorasFabricacion()) + costoFijo;
    }
}
