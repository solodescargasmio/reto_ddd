package co.com.sofka.dominio.vendedor.envent;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dominio.vendedor.value.CuentaId;
import co.com.sofka.dominio.vendedor.value.Email;
import co.com.sofka.dominio.generico.Nombre;
import co.com.sofka.dominio.vendedor.value.Telefono;

public class CuentaGenerada extends DomainEvent {
    private  CuentaId cuentaId;
    private  Nombre nombre;
    private  Telefono telefono;
    private  Email email;
    public CuentaGenerada(CuentaId cuentaId) {
        super("vendedor.cuetagenerada");
        this.cuentaId = cuentaId;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }
}
