package co.com.sofka.dominio.compra.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dominio.cliente.value.ClienteId;
import co.com.sofka.dominio.compra.value.CompraId;
import co.com.sofka.dominio.compra.value.ReservaId;
import co.com.sofka.dominio.compra.value.TransaccionId;
import co.com.sofka.dominio.generico.FechaC;
import co.com.sofka.dominio.vendedor.value.VendedorId;

public class CompraGenerada extends DomainEvent {
    protected VendedorId vendedorId;
    protected ClienteId clienteId;
    protected ReservaId reservaId;
    protected FechaC fecha;
    protected CompraId compraId;
    protected TransaccionId transaccionId;
    public CompraGenerada(CompraId compraId,VendedorId vendedorId,ClienteId clienteId,ReservaId reservaId,FechaC fecha,TransaccionId transaccionId) {
        super("compra.compragenerada");
        this.compraId = compraId;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public ReservaId getReservaId() {
        return reservaId;
    }

    public FechaC getFecha() {
        return fecha;
    }

    public TransaccionId getTransaccionId() {
        return transaccionId;
    }

    public CompraId getCompraId() {
        return compraId;
    }
}
