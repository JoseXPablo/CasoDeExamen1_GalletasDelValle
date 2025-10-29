package com.galletasdelvalle.modelo;

/**
 * Universidad Fidélitas
 * Grupo 5
 * Programación Cliente / Servidor
 * Caso Número 1
 * @author jpali
 */
public class CasoDeExamen1_GalletasDelValleGit {

    public static void main(String[] args) {
        try {
            SistemaControl sistema = new SistemaControl();

            LoteGalletaAvena lote1 = new LoteGalletaAvena("L001", "2025-10-25", 120, 8.5);
            LoteGalletaAvena lote2 = new LoteGalletaAvena("L002", "2025-10-26", 90, 10);
            LoteGalletaAvena lote3 = new LoteGalletaAvena("L003", "2025-10-27", 50, 25);
            LoteGalletaChocolate lote4 = new LoteGalletaChocolate("L004", "2025-10-28", 150, 12);
            sistema.agregarLote(lote4);


            sistema.agregarLote(lote1);
            sistema.agregarLote(lote2);
            sistema.agregarLote(lote3);

            System.out.println("=== Lotes registrados ===");
            sistema.mostrarLotes();

            sistema.ordenarPorFecha();
            System.out.println("\n=== Lotes ordenados por fecha ===");
            sistema.mostrarLotes();

            sistema.ordenarPorHoras();
            System.out.println("\n=== Lotes ordenados por horas de fabricación ===");
            sistema.mostrarLotes();

            System.out.println("\n=== Resultado del control de calidad ===");
            System.out.println("Lote 1 aprobado: " + lote1.inspeccionar());
            System.out.println("Lote 2 aprobado: " + lote2.inspeccionar());
            System.out.println("Lote 3 aprobado: " + lote3.inspeccionar());
            System.out.println("Lote 4 aprobado: " + lote4.inspeccionar());


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
