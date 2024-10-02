package org.TransMilenio.usuarios;

import org.TransMilenio.ValidadorVisitor.IValidadorVisitor;

public abstract class Usuario {
    protected String nombre;
    protected String apellido;
    protected String documento;
    protected float saldo;
    protected int boleto;
    protected float tarifa;

    public Usuario(String nombre, String apellido, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.saldo = 0;
        this.boleto = 0;
    }

    public abstract void calcularTarifa();

    public void aceptar(IValidadorVisitor visitor) {}

    public void recargar(float valor) {
        this.saldo += valor;
    }

    public void comprarBoleto(float valor) {
        if (this.saldo >= valor) {
            this.boleto += 1;
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para comprar boleto.");
        }
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }

    public int getBoleto() {
        return boleto;
    }

    public void setBoleto(int boleto) {
        this.boleto = boleto;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void actualizar(){

    }
}

