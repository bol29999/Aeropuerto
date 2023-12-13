/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa.cifpaviles.dam.aeropuerto.logica;

/**
 *
 * @author estelafm
 */
public enum DiasSemana {
    Domingo("D"), Lunes("L"), Martes("M"), Miercoles("X"), Jueves("J"), Viernes("V"), Sabado("S");
    
    // public final String label = null;

   public final String label;
    //public String label = null;

    private DiasSemana(String label) {
        this.label = label;
    }
}
