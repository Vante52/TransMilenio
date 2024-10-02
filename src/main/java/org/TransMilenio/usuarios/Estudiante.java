package org.TransMilenio.usuarios;

import org.TransMilenio.ValidadorVisitor.IValidadorVisitor;

public class Estudiante extends Usuario {

    public Estudiante(String nombre, String apellido, String documento) {
        super(nombre, apellido, documento);
        calcularTarifa();  // Calcula la tarifa especial para estudiantes
    }
    @Override
    public void calcularTarifa() {
        this.tarifa = 3400;
    }

    @Override
    public void aceptar(IValidadorVisitor visitor) {
        visitor.visitarEstudiante(this);
    }

    @Override
    public String toString() {
        return "Estudiante: " + nombre + " " + apellido + ", Documento: " + documento + ", Saldo: " + saldo + ", Tarifa: " + tarifa+" pesos Colombianos.";
    }
}
