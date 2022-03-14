package co.com.sofka.dominio.vendedor.envent;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dominio.vendedor.value.CuentaId;

public class VendedorCreado extends DomainEvent {
    private final CuentaId cuentaId;
    public VendedorCreado(CuentaId cuentaId) {
        super("vendedor.vendedorcreado");
        this.cuentaId = cuentaId;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }
}
