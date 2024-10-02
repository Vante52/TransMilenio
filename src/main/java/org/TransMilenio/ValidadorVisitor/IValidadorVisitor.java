package org.TransMilenio.ValidadorVisitor;

import org.TransMilenio.usuarios.AdultoMayor;
import org.TransMilenio.usuarios.Estudiante;
import org.TransMilenio.usuarios.UsuarioRegular;

public interface IValidadorVisitor {
    void visitarEstudiante(Estudiante estudiante);
    void visitarRegular(UsuarioRegular regular);
    void visitarMayor(AdultoMayor mayor);
}
