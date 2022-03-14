package co.com.sofka.dominio.compra.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dominio.compra.value.TransaccionId;

public class TrasaccionGenerada extends DomainEvent {
    protected final TransaccionId transaccionId;
    public TrasaccionGenerada(TransaccionId transaccionId) {
        super("compra.trasacciongenerada");
        this.transaccionId = transaccionId;
    }

    public TransaccionId getTransaccionId() {
        return transaccionId;
    }
}
