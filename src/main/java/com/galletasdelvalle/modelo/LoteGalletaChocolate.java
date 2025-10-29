package com.galletasdelvalle.modelo;

/**
 * Universidad Fidélitas
 * Grupo 5
 * Programación Cliente / Servidor
 * Caso Número 1
 * @author Ángel
 */
public class LoteGalletaChocolate extends GalletaChocolate implements ControlCalidad {

    public LoteGalletaChocolate(String idLote, String fechaFabricacion,
                                int unidadesProducidas, double horasFabricacion) throws Exception {
        super(idLote, fechaFabricacion, unidadesProducidas, horasFabricacion);
    }

    @Override
    public boolean inspeccionar() {
        // Aprobamos solo si hay unidades y la fabricación fue menor o igual a 20 horas
        return getUnidadesProducidas() > 0 && getHorasFabricacion() <= 20;
    }
}

