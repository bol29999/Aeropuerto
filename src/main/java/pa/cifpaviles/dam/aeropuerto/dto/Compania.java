/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa.cifpaviles.dam.aeropuerto.dto;

/**
 *
 * @author estelafm
 */
public class Compania {

    private int prefijo;
    private String codigo;
    private String nombre;
    private String direccion;
    private String municipio;
    private String telefonoPasajeros;
    private String telefonoInformacion;

    public Compania() {
    }

    public Compania(int prefijo, String codigo, String nombre, String direccion, String municipio, String telefonoPasajeros, String telefonoInformacion) {
        this.prefijo = prefijo;
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.municipio = municipio;
        this.telefonoPasajeros = telefonoPasajeros;
        this.telefonoInformacion = telefonoInformacion;
    }

    public int getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(int prefijo) {
        this.prefijo = prefijo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTelefonoPasajeros() {
        return telefonoPasajeros;
    }

    public void setTelefonoPasajeros(String telefonoPasajeros) {
        this.telefonoPasajeros = telefonoPasajeros;
    }

    public String getTelefonoInformacion() {
        return telefonoInformacion;
    }

    public void setTelefonoInformacion(String telefonoInformacion) {
        this.telefonoInformacion = telefonoInformacion;
    }

}
