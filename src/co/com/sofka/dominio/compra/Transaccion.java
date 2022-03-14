package co.com.sofka.dominio.compra;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.dominio.compra.value.CompraId;
import co.com.sofka.dominio.compra.value.Monto;
import co.com.sofka.dominio.compra.value.TransaccionId;

public class Transaccion extends AggregateEvent<TransaccionId> {
    protected CompraId compraId;
    private Monto monto;
    TransaccionId transaccionId;
    public Transaccion(TransaccionId transaccionId,CompraId compraId, Monto monto) {
        super(transaccionId);
        this.compraId = compraId;
        this.monto = monto;
    }

    public CompraId compra() {
        return compraId;
    }

    public Monto monto() {
        return monto;
    }

    public TransaccionId transaccionId() {
        return transaccionId;
    }
}
