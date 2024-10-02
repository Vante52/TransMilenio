package org.TransMilenio.rutas;

import org.TransMilenio.estaciones.Estacion;

import java.util.ArrayList;
import java.util.List;

public abstract class Ruta implements IRutas {
    protected String idRuta;                        // Identificador único de la ruta
    protected List<Estacion> estaciones;            // Lista de estaciones asignadas a la ruta


    public Ruta(String idRuta) {
        this.idRuta = idRuta;
        this.estaciones = new ArrayList<>();        // Inicializa la lista de estaciones
    }


    @Override
    public void agregarParada(Estacion estacion) {
        if (!estaciones.contains(estacion)) {
            estaciones.add(estacion);
            System.out.println("Estación " + estacion.getNombreEstacion() + " agregada a la ruta " + idRuta);
        }
    }


    @Override
    public void eliminarParada(Estacion estacion) {
        if (estaciones.contains(estacion)) {
            estaciones.remove(estacion);
            System.out.println("Estación " + estacion.getNombreEstacion() + " eliminada de la ruta " + idRuta);
        }
    }


    @Override
    public List<Estacion> getEstaciones() {
        return estaciones;
    }

    public String getIdRuta() {
        return idRuta;
    }
}
