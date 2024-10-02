package org.TransMilenio.estaciones;

import org.TransMilenio.usuarios.Usuario;

import java.util.List;

public class Estacion {
    private String idEstacion;
    private String nombreEstacion;
    private estadoEstacion estado;
    private int aforoMaximo;
    List <Usuario> usuarios;

    public Estacion(String idEstacion, String nombreEstacion, int aforoMaximo) {
        this.idEstacion = idEstacion;
        this.nombreEstacion = nombreEstacion;
        this.aforoMaximo = aforoMaximo;
    }

    public String getIdEstacion() {
        return idEstacion;
    }

    public void setIdEstacion(String idEstacion) {
        this.idEstacion = idEstacion;
    }

    public String getNombreEstacion() {
        return nombreEstacion;
    }

    public void setNombreEstacion(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
    }

    public int getAforoMaximo() {
        return aforoMaximo;
    }

    public void setAforoMaximo(int aforoMaximo) {
        this.aforoMaximo = aforoMaximo;
    }

    public estadoEstacion getEstado() {
        return estado;
    }

    public void setEstado(estadoEstacion estado) {
        this.estado = estado;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    public void añadirUsuario (String nombre, String apellido, String documentoIdentificacion, String tipoUsuario) {

    }
    public void Notificar (estadoEstacion estado){

    }
    public void Suscribir(Usuario u){

    }
    public void Desuscribir(Usuario u){

    }
    public void CalcularEstado(){
        int cantidadUsuarios = usuarios.size();
        if (cantidadUsuarios < (aforoMaximo * 0.3)) {
            estado = estadoEstacion.Vacia;
        } else if (cantidadUsuarios < (aforoMaximo * 0.6)) {
            estado = estadoEstacion.Moderadamente_Llena;
        } else if (cantidadUsuarios >= (aforoMaximo * 0.6) && cantidadUsuarios <= aforoMaximo) {
            estado = estadoEstacion.Llena;
        } else {
            System.out.println("Error: Capacidad excedida en la estación " + nombreEstacion);
            estado = estadoEstacion.Llena;  // Se considera llena si la capacidad se excede
        }
    }
}
