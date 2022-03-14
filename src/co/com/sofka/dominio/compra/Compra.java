package co.com.sofka.dominio.compra;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dominio.cliente.value.ClienteId;
import co.com.sofka.dominio.compra.event.CompraGenerada;
import co.com.sofka.dominio.compra.event.TrasaccionGenerada;
import co.com.sofka.dominio.compra.value.CompraId;
import co.com.sofka.dominio.compra.value.ReservaId;
import co.com.sofka.dominio.compra.value.TransaccionId;
import co.com.sofka.dominio.generico.FechaC;
import co.com.sofka.dominio.vendedor.value.CuentaId;
import co.com.sofka.dominio.vendedor.value.VendedorId;

import java.util.List;

public class Compra extends AggregateEvent<CompraId> {
    protected VendedorId vendedorId;
    protected ClienteId clienteId;
    protected CompraId compraId;
    protected ReservaId reservaId;
    protected FechaC fecha;
    protected TransaccionId transaccionId;
    public Compra(CompraId compraId, VendedorId vendedorId,ClienteId clienteId,ReservaId reservaId,FechaC fecha,TransaccionId transaccionId) {
        super(compraId);
        subscribe(new CompraEventChange(this));
        appendChange(new CompraGenerada(compraId,vendedorId, clienteId,reservaId,fecha,transaccionId)).apply();
    }

    private Compra(CompraId compraId){
        super(compraId);
        subscribe(new CompraEventChange(this));
    }

    public static Compra from(CompraId compraId, List<DomainEvent> eventList){
        Compra compra = new Compra(compraId);
        eventList.forEach(compra::applyEvent);
        return compra;
    }

   public void crearTransaccion(TransaccionId transaccionId){
        appendChange(new TrasaccionGenerada(transaccionId)).apply();
   }


    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public CompraId getCompraId() {
        return compraId;
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
}
