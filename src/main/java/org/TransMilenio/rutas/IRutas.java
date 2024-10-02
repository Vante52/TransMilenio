package org.TransMilenio.rutas;

import org.TransMilenio.estaciones.Estacion;

import java.util.List;

public interface IRutas {
    void agregarParada(Estacion estacion);
    void eliminarParada(Estacion estacion);
    List<Estacion> getEstaciones();
    String getIdRuta();
}
