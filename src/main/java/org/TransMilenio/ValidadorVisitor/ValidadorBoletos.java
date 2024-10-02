package org.TransMilenio.ValidadorVisitor;

import org.TransMilenio.usuarios.AdultoMayor;
import org.TransMilenio.usuarios.Estudiante;
import org.TransMilenio.usuarios.UsuarioRegular;

public class ValidadorBoletos implements IValidadorVisitor{
    private boolean validadorBoleto;

    @Override
    public void visitarEstudiante(Estudiante estudiante) {

    }

    @Override
    public void visitarRegular(UsuarioRegular regular) {

    }

    @Override
    public void visitarMayor(AdultoMayor mayor) {

    }
    public boolean isBoletoValido() {
        return validadorBoleto;
    }
}
