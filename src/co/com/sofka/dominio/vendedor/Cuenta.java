package co.com.sofka.dominio.vendedor;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.dominio.vendedor.value.CuentaId;
import co.com.sofka.dominio.vendedor.value.Email;
import co.com.sofka.dominio.generico.Nombre;
import co.com.sofka.dominio.vendedor.value.Telefono;

public class Cuenta extends Entity<CuentaId> {
    private final Nombre nombre;
    private final Telefono telefono;
    private final Email email;
    public Cuenta(CuentaId cuentaId, Nombre nombre, Telefono telefono, Email email) {
        super(cuentaId);

        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Email getEmail() {
        return email;
    }
}
