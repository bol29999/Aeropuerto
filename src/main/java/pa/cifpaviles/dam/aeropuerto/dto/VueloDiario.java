/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa.cifpaviles.dam.aeropuerto.dto;

import java.util.Date;

/**
 *
 * @author estelafm
 */
public class VueloDiario {

    private String codigoVueloBase;
    private Date fechaVuelo;    // Va a ser solo la fecha
    private Date horaSalida;    // Va a ser solo la hora
    private Date horaLlegada;   // Va a ser solo la hora
    private int numeroPlazasOcupadas;
    private float precioVuelo;
    private VueloBase vueloBase;

    public VueloDiario() {
    }

    public VueloDiario(String codigoVueloBase, Date fechaVuelo, Date horaSalida, Date horaLlegada, int numeroPlazasOcupadas, float precioVuelo) {
        this.codigoVueloBase = codigoVueloBase;
        this.fechaVuelo = fechaVuelo;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.numeroPlazasOcupadas = numeroPlazasOcupadas;
        this.precioVuelo = precioVuelo;
    }

    public VueloDiario(Date fechaVuelo, Date horaSalida, Date horaLlegada, int numeroPlazasOcupadas, float precioVuelo, VueloBase vueloBase) {
        this.fechaVuelo = fechaVuelo;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.numeroPlazasOcupadas = numeroPlazasOcupadas;
        this.precioVuelo = precioVuelo;
        this.vueloBase = vueloBase;
    }

    public String getCodigoVueloBase() {
        return codigoVueloBase;
    }

    public void setCodigoVueloBase(String codigoVueloBase) {
        this.codigoVueloBase = codigoVueloBase;
    }

    public Date getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(Date fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public int getNumeroPlazasOcupadas() {
        return numeroPlazasOcupadas;
    }

    public void setNumeroPlazasOcupadas(int numeroPlazasOcupadas) {
        this.numeroPlazasOcupadas = numeroPlazasOcupadas;
    }

    public float getPrecioVuelo() {
        return precioVuelo;
    }

    public void setPrecioVuelo(float precioVuelo) {
        this.precioVuelo = precioVuelo;
    }

    public VueloBase getVueloBase() {
        return vueloBase;
    }

    public void setVueloBase(VueloBase vueloBase) {
        this.vueloBase = vueloBase;
    }

}
