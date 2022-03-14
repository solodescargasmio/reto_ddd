package co.com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.dominio.vendedor.command.CrearVendedor;
import co.com.sofka.dominio.vendedor.envent.VendedorCreado;
import co.com.sofka.dominio.vendedor.value.CuentaId;
import co.com.sofka.dominio.vendedor.value.VendedorId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearVendedorUseCaseTest {

    @Test
    void crearVendedor() {
        //arrange
        VendedorId vendedorId = VendedorId.of("vvv");
        CuentaId cuentaId = CuentaId.of("ccc");
        CrearVendedor crearVendedor = new CrearVendedor(cuentaId);


        //act

        CrearVendedorUseCase usecase = new CrearVendedorUseCase();
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(crearVendedor))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (VendedorCreado)events.get(0);
        Assertions.assertEquals("vendedor.vendedorcreado",event.type);
        Assertions.assertEquals("ccc",event.getCuentaId().value());
        Assertions.assertEquals("vvv",event.aggregateRootId());


    }
}