package org.TransMilenio.buses;

import org.TransMilenio.estaciones.Estacion;
import org.TransMilenio.rutas.IRutas;

public interface IBuses {
    public void agregarRuta(IRutas ruta);
    public void eliminarRuta(IRutas ruta);
}
