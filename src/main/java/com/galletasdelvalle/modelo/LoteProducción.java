/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.galletasdelvalle.modelo;

/**
 *
 * @author jpali
 */
public abstract class LoteProducción {
   
 //Clase base que representa un lote genérico de producción de galletas.
 //Contiene atributos comunes como ID, tipo de galleta, fecha, unidades y horas.
    
    
     // Identificador único del lote
    private String idLote;
    // Tipo de galleta producida
    private String tipoGalleta;  
 // Fecha de fabricación del lote    
    private String fechaFabricacion;  
    // Cantidad de unidades producidas
    private int unidadesProducidas;
     // Tiempo total de fabricación en horas
    private double horasFabricacion;

   
    // Constructor
    public LoteProducción(String idLote, String tipoGalleta, String fechaFabricacion,
                          int unidadesProducidas, double horasFabricacion) throws Exception {
        setIdLote(idLote);
        setTipoGalleta(tipoGalleta);
        setFechaFabricacion(fechaFabricacion);
        setUnidadesProducidas(unidadesProducidas);
        setHorasFabricacion(horasFabricacion);
    }

   
    // Getters y Setters
    public String getIdLote() { return idLote; }
    public void setIdLote(String idLote) throws Exception {
        if (idLote == null || idLote.equals("")) {
            throw new Exception("ID inválido");
        }
        this.idLote = idLote;
    }

   
    public String getTipoGalleta() { return tipoGalleta; }
    public void setTipoGalleta(String tipoGalleta) throws Exception {
        if (tipoGalleta == null || tipoGalleta.equals("")) {
            throw new Exception("Tipo inválido");
        }
        this.tipoGalleta = tipoGalleta;
    }

   
    public String getFechaFabricacion() { return fechaFabricacion; }
    public void setFechaFabricacion(String fechaFabricacion) throws Exception {
        if (fechaFabricacion == null || fechaFabricacion.equals("")) {
            throw new Exception("Fecha inválida");
        }
        this.fechaFabricacion = fechaFabricacion;
    }

    public int getUnidadesProducidas() { return unidadesProducidas; }
    public void setUnidadesProducidas(int unidadesProducidas) throws Exception {
        if (unidadesProducidas <= 0) {
            throw new Exception("Unidades deben ser > 0");
        }
        this.unidadesProducidas = unidadesProducidas;
    }

    
    public double getHorasFabricacion() { return horasFabricacion; }
    public void setHorasFabricacion(double horasFabricacion) throws Exception {
        if (horasFabricacion <= 0) {
            throw new Exception("Horas deben ser > 0");
        }
        this.horasFabricacion = horasFabricacion;
    }

   
    // Método abstracto (polimorfismo)
    public abstract double calcularCostoProduccion();

    // toString sencillo
    @Override
    public String toString() {
        return idLote + " - " + tipoGalleta + " - " + fechaFabricacion +
               " | unidades=" + unidadesProducidas + " | horas=" + horasFabricacion;
    }
}