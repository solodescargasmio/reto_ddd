package co.com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.dominio.cliente.command.CrearCliente;
import co.com.sofka.dominio.cliente.value.ClienteId;
import co.com.sofka.dominio.compra.Compra;
import co.com.sofka.dominio.compra.command.CrearCompra;
import co.com.sofka.dominio.compra.value.CompraId;
import co.com.sofka.dominio.compra.value.ReservaId;
import co.com.sofka.dominio.compra.value.TransaccionId;
import co.com.sofka.dominio.generico.FechaC;
import co.com.sofka.dominio.vendedor.value.VendedorId;

import java.util.Date;

public class CrearCompraUseCase extends UseCase<RequestCommand<CrearCompra>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearCompra> input) {
        CrearCompra crearCompra = input.getCommand();
        CompraId compraId = CompraId.of("ccc");
        VendedorId vendedorId = VendedorId.of("vvv");
        ClienteId clienteId = ClienteId.of("cli");
        ReservaId reservaId = ReservaId.of("rere");
        FechaC fechaC = new FechaC(new Date());
        TransaccionId transaccionId = TransaccionId.of("ttt");
        Compra compra = new Compra(compraId,vendedorId,clienteId,reservaId,fechaC,transaccionId);

        emit().onResponse(new ResponseEvents(compra.getUncommittedChanges()));
    }
}
