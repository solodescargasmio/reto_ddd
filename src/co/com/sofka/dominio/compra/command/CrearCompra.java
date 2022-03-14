package co.com.sofka.dominio.compra.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.dominio.cliente.value.ClienteId;
import co.com.sofka.dominio.compra.value.CompraId;
import co.com.sofka.dominio.compra.value.ReservaId;
import co.com.sofka.dominio.compra.value.TransaccionId;
import co.com.sofka.dominio.generico.FechaC;
import co.com.sofka.dominio.vendedor.value.VendedorId;

public class CrearCompra extends Command {
    protected VendedorId vendedorId;
    protected ClienteId clienteId;
    protected CompraId compraId;
    protected ReservaId reservaId;
    protected FechaC fecha;
    protected TransaccionId transaccionId;
    public CrearCompra(CompraId compraId){
        this.compraId = compraId;
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
