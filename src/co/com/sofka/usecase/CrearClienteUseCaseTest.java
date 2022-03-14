package co.com.sofka.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.dominio.cliente.command.CrearCliente;
import co.com.sofka.dominio.cliente.event.ClienteCreado;
import co.com.sofka.dominio.cliente.value.ClienteId;
import co.com.sofka.dominio.vendedor.command.CrearVendedor;
import co.com.sofka.dominio.vendedor.envent.VendedorCreado;
import co.com.sofka.dominio.vendedor.value.CuentaId;
import co.com.sofka.dominio.vendedor.value.VendedorId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearClienteUseCaseTest {

    @Test
    void crearCliente() {
        //arrange
        ClienteId clienteId = ClienteId.of("a");

        CrearCliente crearCliente = new CrearCliente(clienteId);

        //act

        CrearClienteUseCase usecase = new CrearClienteUseCase();
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(crearCliente))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (ClienteCreado)events.get(0);
        Assertions.assertEquals("cliente.clientecreado",event.type);
        Assertions.assertEquals("ccc",event.getClienteId());
        Assertions.assertEquals("ccc",event.aggregateRootId());


    }
}