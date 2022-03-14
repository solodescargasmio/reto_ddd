package co.com.sofka.dominio.vendedor.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.dominio.vendedor.value.CuentaId;

public class CrearVendedor extends Command {
    private final CuentaId cuentaId;

    public CrearVendedor(CuentaId cuentaId) {
        this.cuentaId = cuentaId;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }
}
