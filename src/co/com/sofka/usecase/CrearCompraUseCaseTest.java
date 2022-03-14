package co.com.sofka.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.dominio.cliente.value.ClienteId;
import co.com.sofka.dominio.compra.command.CrearCompra;
import co.com.sofka.dominio.compra.event.CompraGenerada;
import co.com.sofka.dominio.compra.value.CompraId;
import co.com.sofka.dominio.compra.value.ReservaId;
import co.com.sofka.dominio.compra.value.TransaccionId;
import co.com.sofka.dominio.generico.FechaC;
import co.com.sofka.dominio.vendedor.command.CrearVendedor;
import co.com.sofka.dominio.vendedor.envent.VendedorCreado;
import co.com.sofka.dominio.vendedor.value.CuentaId;
import co.com.sofka.dominio.vendedor.value.VendedorId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CrearCompraUseCaseTest {

    @Test
    void crearCompra() {
        //arrange
        CompraId compraId = CompraId.of("ccc");
        VendedorId vendedorId = VendedorId.of("vvv");
        ClienteId clienteId = ClienteId.of("cli");
        ReservaId reservaId = ReservaId.of("rere");
        FechaC fechaC = new FechaC(new Date());
        TransaccionId transaccionId = TransaccionId.of("ttt");

        CrearCompra crearCompra = new CrearCompra(compraId);


        //act

        CrearCompraUseCase usecase = new CrearCompraUseCase();
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(crearCompra))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (CompraGenerada)events.get(0);
        Assertions.assertEquals("compra.compragenerada",event.type);
        Assertions.assertEquals("ccc",event.aggregateRootId());


    }
}