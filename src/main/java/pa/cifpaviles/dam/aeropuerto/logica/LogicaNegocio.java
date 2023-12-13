/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa.cifpaviles.dam.aeropuerto.logica;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import pa.cifpaviles.dam.aeropuerto.dto.Aeropuerto;
import pa.cifpaviles.dam.aeropuerto.dto.Compania;
import pa.cifpaviles.dam.aeropuerto.dto.Municipio;
import pa.cifpaviles.dam.aeropuerto.dto.VueloBase;
import pa.cifpaviles.dam.aeropuerto.dto.VueloDiario;

/**
 *
 * @author estelafm
 */
public class LogicaNegocio {

    //Inicializacion de variables
    public static void initializeProgram() {
        initializeAeropuertos();
        initializeMunicipios();
        initializeCompanias();
    }

    private static void initializeCompanias() {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    private static List<Municipio> lstMunicipios = new ArrayList<>();

    private static void initializeMunicipios() {
        lstMunicipios.add(new Municipio("02003","Albacete"));
        lstMunicipios.add(new Municipio("33016","Castrillón"));
        lstMunicipios.add(new Municipio("24089", "León"));
        lstMunicipios.add(new Municipio("28079", "Madrid"));
        lstMunicipios.add(new Municipio("33044", "Oviedo"));
        lstMunicipios.add(new Municipio("24189", "Valverde de la Virgen"));
    }

    private static List<Municipio> getAllMunicipios(){
        return lstMunicipios;
    }
    public static void initializeAeropuertos() {
        addAeropuerto(new Aeropuerto("ABC", "Aeropuerto de Albacete", "02003"));
        addAeropuerto(new Aeropuerto("OVD", "Aeropuerto de Oviedo", "33016"));
        addAeropuerto(new Aeropuerto("LEN", "Aeropuerto de León", "24189"));
        addAeropuerto(new Aeropuerto("OSL", "Aeropuerto de Oslo-Gardermoen", "00000"));
    }

    // <editor-fold desc="Logica de Aeropuertos">
    private static List<Aeropuerto> lstAeropuertos = new ArrayList<Aeropuerto>();

    //Aeropuertos
    public static ValidationResult addAeropuerto(Aeropuerto aero) {
        ValidationResult retValue = new ValidationResult(true, "");
        Aeropuerto aux = getAeropuertoByCodigoIATA(aero.getCodigoIATA());
        if (aux == null) {
            lstAeropuertos.add(aero);
        } else {
            retValue = new ValidationResult(false, "El codigo IATA del aeropuerto ya existe, NO se añadira a la lista");
        }
        return retValue;
    }

    public static List<Aeropuerto> getAllAeropuertos() {
        return lstAeropuertos;
    }

    public static Aeropuerto getAeropuertoByCodigoIATA(String codigoIATA) {
        // Voy a obtener el aeropuerto de la lista

        for (Aeropuerto a : lstAeropuertos) {
            if (a.getCodigoIATA().equals(codigoIATA)) {
                return a;
            }
        }

        return new Aeropuerto();
    }

//    public static void getAeropuertoBase() {
//        Aeropuerto aeropuertoBase = getAeropuertoByCodigoIATA("OVD");
//    }
    

    public static Aeropuerto getAeropuertoBase() {
        Aeropuerto aeropuertoBase = getAeropuertoByCodigoIATA("OVD");
        return aeropuertoBase;
    }
    // </editor-fold>

    // <editor-fold desc="Logica de Compañias">
    private static List<Compania> lstCompania = new ArrayList<Compania>();

    public static List<Compania> getAllCompanias() {
        return lstCompania;
    }

    public static Compania getCompaniaByPrefijo(int prefijo) {
        for (Compania c : lstCompania) {
            if (c.getPrefijo() == prefijo) {
                return c;
            }
        }
        return new Compania();
    }

    public static Compania getCompaniaByCodigo(String codigo) {
        Optional<Compania> optValorSalida = lstCompania.stream()
                .filter(value -> value.getCodigo().equals(codigo))
                .findFirst();
        if (optValorSalida.isPresent()) {
            return optValorSalida.get();
        } else {
            return new Compania();
        }
    }

    public static List<Compania> getCompaniaByMunicipio(String municipio) {
        return lstCompania.stream()
                .filter(value -> value.getCodigo().equals(municipio))
                .toList();
    }

    public static ValidationResult addCompania(Compania newComp) {
        ValidationResult retValue = new ValidationResult(true, "");
        Compania aux = getCompaniaByCodigo(newComp.getCodigo());
        if (aux == null) {
            lstCompania.add(newComp);
        } else {
            retValue = new ValidationResult(false, "El codigo de la compañia ya existe");
        }
        return retValue;
    }

    public static void deleteCompaniaByCodigo(String codigo) {
        Compania delComp = getCompaniaByCodigo(codigo);
        lstCompania.remove(delComp);
    }

    public static void updateCompaniaByCodigo(String codigo, Compania newComp) {
        Compania oldComp = getCompaniaByCodigo(codigo);
        oldComp.setDireccion(newComp.getDireccion());
        oldComp.setMunicipio(newComp.getMunicipio());
        oldComp.setNombre(newComp.getNombre());
        oldComp.setPrefijo(newComp.getPrefijo());
        oldComp.setTelefonoInformacion(newComp.getTelefonoInformacion());
        oldComp.setTelefonoPasajeros(newComp.getTelefonoPasajeros());
    }
    // </editor-fold>

    // <editor-fold desc="Logica de Vuelos Base">
    private static List<VueloBase> lstVueloBase = new ArrayList<VueloBase>();

    public static List<VueloBase> getAllVuelosBase() {
        return new ArrayList<VueloBase>();
    }

    public static ValidationResult addVueloBase(VueloBase vuelo) {
        ValidationResult retValue = new ValidationResult(true, "");
        VueloBase aux = getVueloBaseByCodigo(vuelo.getCodigoAeropuertoOrigen());
        if (aux == null) {
            lstVueloBase.add(vuelo);
        } else {
            retValue = new ValidationResult(false, "El codigo del vuelo base ya existe, NO se añadira a la lista");
        }
        return retValue;
    }

    public static VueloBase getVueloBaseByCodigo(String codigo) {
        Optional<VueloBase> optValorSalida = lstVueloBase.stream()
                .filter(value -> value.getCodigoVuelo().equals(codigo))
                .findFirst();
        if (optValorSalida.isPresent()) {
            return optValorSalida.get();
        } else {
            return new VueloBase();
        }
    }

    public static List<VueloBase> getVueloBaseByFecha(Date fecha) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);
        int diaSemana = cal.get(Calendar.DAY_OF_WEEK);
        String diaSemanaCad = "";
        switch (diaSemana) {
            case Calendar.SUNDAY:
                diaSemanaCad = "D";
                break;
            case Calendar.MONDAY:
                diaSemanaCad = "L";
                break;
            case Calendar.TUESDAY:
                diaSemanaCad = "M";
                break;
            case Calendar.WEDNESDAY:
                diaSemanaCad = "X";
                break;
            case Calendar.THURSDAY:
                diaSemanaCad = "J";
                break;
            case Calendar.FRIDAY:
                diaSemanaCad = "V";
                break;
            case Calendar.SATURDAY:
                diaSemanaCad = "S";
                break;
            default:
                diaSemanaCad = "";
        }
        return getVueloBaseByDiaSemana(diaSemanaCad);
    }

    public static List<VueloBase> getVueloBaseByDiaSemana(String diaSemana) {
        List<VueloBase> lstVueloByDiaSemana = lstVueloBase.stream()
                .filter(v -> v.getDiasOperacion()
                .contains(diaSemana))
                .toList();
        return lstVueloByDiaSemana;
    }

    public static List<VueloBase> getVueloBaseByAeropuertoOrigen(String codigoIATA) {
        return lstVueloBase.stream()
                .filter(v -> v.getCodigoVuelo()
                .contains(codigoIATA))
                .toList();
    }

    public static List<VueloBase> getVueloBaseByAeropuertoDestino(String codigoIATA) {
        return lstVueloBase.stream()
                .filter(v -> v.getCodigoVuelo()
                .contains(codigoIATA))
                .toList();
    }
    
    public static void updateVueloBaseByCodigo(String codigo, VueloBase newVuelo) {
        VueloBase oldVuelo = getVueloBaseByCodigo(codigo);
        if(oldVuelo != null) {
            oldVuelo.setAeropuertoDestino(newVuelo.getAeropuertoDestino());
            oldVuelo.setAeropuertoOrigen(newVuelo.getAeropuertoOrigen());
            oldVuelo.setDiasOperacion(newVuelo.getDiasOperacion());
            oldVuelo.setHoraSalida(newVuelo.getHoraSalida());
            oldVuelo.setNumeroPlazas(newVuelo.getNumeroPlazas());
        }
    }
    
    public static void deleteVueloBaseByCodigo(String codigo){  // 5 lines
        VueloBase delVB = getVueloBaseByCodigo(codigo);
        lstVueloBase.remove(delVB);
    }
    // </editor-fold>

    // <editor-fold desc="Logica de Vuelos Diarios">
    private static List<VueloDiario> lstVuelosDiarios = new ArrayList<VueloDiario>();

    public static List<VueloDiario> getAllVuelosDiarios() {
        return new ArrayList<VueloDiario>();
    }

    public static VueloDiario getVueloDiarioByCodigoVueloBase(String codigo) {
        return new VueloDiario();
    }

    public static VueloDiario getVueloDiarioByFecha(Date fecha) {
        return new VueloDiario();
    }

    public static Date getFechaByHora(int horas, int minutos) {
        Calendar cal = Calendar.getInstance();
        cal.set(1970, 1, 1, horas, minutos);
        Date fecha = cal.getTime();
        return fecha;
    }

    public static String getHoraFecha(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(fecha);
    }
    // </editor-fold>

}
