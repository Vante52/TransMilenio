package org.TransMilenio.transmilenio;

import org.TransMilenio.estaciones.Estacion;
import java.util.*;
import org.TransMilenio.buses.IBuses;
import org.TransMilenio.rutas.IRutas;

public class Transmilenio {
    List <Estacion> estaciones;
    List <IBuses> buses;
    List <IRutas> rutas;

    public List<IBuses> getBuses() {
        return buses;
    }

    public void setBuses(List<IBuses> buses) {
        this.buses = buses;
    }

    public List<Estacion> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(List<Estacion> estaciones) {
        this.estaciones = estaciones;
    }

    public List<IRutas> getRutas() {
        return rutas;
    }

    public void setRutas(List<IRutas> rutas) {
        this.rutas = rutas;
    }

    public void crearBus (String tipoBus, String idBus){

    }

    public void crearRuta (String tipoRuta, String idRuta, String nombreRuta){

    }

    public void crearEstacion (String nombreEstacion, String idEstacion, int aforoMaximo ){

    }

    public void agregarParadaARuta (IRutas ruta, Estacion estacion){

    }

    public void eliminarParadaARuta(IRutas ruta, Estacion estacion){

    }
    public void asignarRutaABus (IBuses bus, IRutas ruta){

    }
    public void eliminarRutaABus (IBuses bus, IRutas ruta){

    }
}
