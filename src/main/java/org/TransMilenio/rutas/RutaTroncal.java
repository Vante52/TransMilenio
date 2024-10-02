package org.TransMilenio.rutas;

import org.TransMilenio.estaciones.Estacion;

public class RutaTroncal extends Ruta {

    public RutaTroncal(String idRuta) {
        super(idRuta);  // Llama al constructor de AbstractRuta para inicializar idRuta y estaciones
    }

    // Métodos adicionales o específicos para RutaTroncal, si es necesario
    @Override
    public void agregarParada(Estacion estacion) {
        super.agregarParada(estacion);  // Utiliza la lógica básica de agregar parada definida en AbstractRuta
    }

    @Override
    public void eliminarParada(Estacion estacion) {
        super.eliminarParada(estacion);  // Utiliza la lógica básica de eliminar parada definida en AbstractRuta
    }

    @Override
    public String toString() {
        return "RutaTroncal{" + "idRuta='" + idRuta + '\'' + ", estaciones=" + estaciones + '}';
    }
}
