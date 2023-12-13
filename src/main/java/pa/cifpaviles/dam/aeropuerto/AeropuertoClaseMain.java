/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pa.cifpaviles.dam.aeropuerto;

import java.util.Date;
import java.util.List;
import pa.cifpaviles.dam.aeropuerto.dto.Aeropuerto;
import pa.cifpaviles.dam.aeropuerto.dto.Compania;
import pa.cifpaviles.dam.aeropuerto.dto.VueloBase;
import pa.cifpaviles.dam.aeropuerto.logica.LogicaNegocio;

/**
 *
 * @author estelafm
 */

public class AeropuertoClaseMain {

    public static void main(String[] args) {
        
        Aeropuerto aeropuertoBase = LogicaNegocio.getAeropuertoBase();
        LogicaNegocio.initializeProgram();
        
        Compania c1 = new Compania(
                75,
                "IB",
                "Iberia Lineas Aereas de España",
                "C/ Marques s/n",
                "28043",
                "91-345-32-11",
                "900-100-192"
        );
        LogicaNegocio.addCompania(c1);

        Compania c2 = new Compania(
                751,
                "VY",
                "Vueling",
                "Pº Castellana",
                "28079",
                "91-345-32-11",
                "900-100-192"
        );
        LogicaNegocio.addCompania(c2);

        Compania c3 = new Compania(
                752,
                "V7",
                "Volotea",
                "C/ Verano Azul",
                "29067",
                "956-345-32-11",
                "900-100-192"
        );
        LogicaNegocio.addCompania(c3);

        List<Compania> lista = LogicaNegocio.getAllCompanias();
        List<Compania> compMadrid = LogicaNegocio.getCompaniaByMunicipio("28079");
        LogicaNegocio.addVueloBase(
                new VueloBase(
                        "IB123",
                        3,
                        new Date(),
                        new Date(),
                        "LXV",
                        aeropuertoBase.getCodigoIATA(),
                        "ABC"
                )
        );
        Date fechaActual = new Date();
        List<VueloBase> vuelos = LogicaNegocio.getVueloBaseByFecha(fechaActual);
        String horaCadena = LogicaNegocio.getHoraFecha(fechaActual);
    }
}
