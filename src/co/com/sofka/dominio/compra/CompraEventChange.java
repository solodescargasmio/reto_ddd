package co.com.sofka.dominio.compra;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.dominio.compra.event.CompraGenerada;
import co.com.sofka.dominio.compra.value.CompraId;

public class CompraEventChange extends EventChange {
    public CompraEventChange(Compra compra) {
        apply((CompraGenerada event)->{
            compra.compraId = event.getCompraId();
            compra.transaccionId = event.getTransaccionId();
        });
    }
}
