package org.TransMilenio.usuarios;

import org.TransMilenio.ValidadorVisitor.IValidadorVisitor;

public class UsuarioRegular extends Usuario {

    public UsuarioRegular(String nombre, String apellido, String documento) {
        super(nombre, apellido, documento);
        calcularTarifa();
    }

    @Override
    public void calcularTarifa() {
        this.tarifa = 3600;
    }

    @Override
    public void aceptar(IValidadorVisitor visitor) {
        visitor.visitarRegular(this);
    }

    @Override
    public String toString() {
        return "Usuario Regular: " + nombre + " " + apellido + ", Documento: " + documento + ", Saldo: " + saldo + ", Tarifa: " + tarifa +" pesos Colombianos.";
    }
}
