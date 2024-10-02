package org.TransMilenio.usuarios;

import org.TransMilenio.ValidadorVisitor.IValidadorVisitor;

public class AdultoMayor extends Usuario {

    public AdultoMayor(String nombre, String apellido, String documento) {
        super(nombre, apellido, documento);
        calcularTarifa();  // Calcula la tarifa especial para personas mayores
    }

    @Override
    public void calcularTarifa() {
        this.tarifa = 2900; // Tarifa reducida para personas mayores, por ejemplo, 1200 unidades
    }

    @Override
    public void aceptar(IValidadorVisitor visitor) {
        visitor.visitarMayor(this);
    }

    @Override
    public String toString() {
        return "Persona Mayor: " + nombre + " " + apellido + ", Documento: " + documento + ", Saldo: " + saldo + ", Tarifa: " + tarifa+" pesos Colombianos.";
    }
}

