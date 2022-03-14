package co.com.sofka.dominio.vendedor;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.dominio.vendedor.envent.CuentaGenerada;
import co.com.sofka.dominio.vendedor.envent.VendedorCreado;
import co.com.sofka.dominio.vendedor.value.CuentaId;

public class VendedorEventChange extends EventChange {
    public VendedorEventChange(Vendedor vendedor) {

        apply((VendedorCreado event)->{
            vendedor.cuentaId = event.getCuentaId();
        });

        apply((CuentaGenerada event)->{

            CuentaId cuentaId = CuentaId.of("ccc");
            vendedor.cuentaId = cuentaId;
        });
    }
}
