package org.TransMilenio.buses;

import org.TransMilenio.rutas.IRutas;

import java.util.List;

public abstract class Bus implements IBuses {
    String idBus;
    List<IRutas> rutaAsignada;

    @Override
    public void agregarRuta(IRutas ruta) {
    }

    @Override
    public void eliminarRuta(IRutas ruta) {

    }
}
