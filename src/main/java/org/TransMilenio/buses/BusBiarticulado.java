package org.TransMilenio.buses;

import org.TransMilenio.rutas.IRutas;

import java.util.ArrayList;
import java.util.List;

public class BusBiarticulado extends Bus {

    private int capacidadMaxima;  // Capacidad máxima de pasajeros para buses biarticulados

    public BusBiarticulado(String idBus, int capacidadMaxima) {
        this.idBus = idBus;  // Se establece el identificador del bus
        this.capacidadMaxima = capacidadMaxima;
        this.rutaAsignada = new ArrayList<>();  // Inicializa la lista de rutas asignadas
    }

    @Override
    public void agregarRuta(IRutas ruta) {
        if (!rutaAsignada.contains(ruta)) {
            rutaAsignada.add(ruta);  // Agrega la ruta a la lista si no está presente
            System.out.println("Ruta " + ruta.getIdRuta() + " asignada al Bus Biarticulado " + idBus);
        }
    }

    @Override
    public void eliminarRuta(IRutas ruta) {
        if (rutaAsignada.contains(ruta)) {
            rutaAsignada.remove(ruta);  // Elimina la ruta de la lista
            System.out.println("Ruta " + ruta.getIdRuta() + " eliminada del Bus Biarticulado " + idBus);
        }
    }

    // Métodos adicionales específicos de BusBiarticulado, si es necesario
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
}
