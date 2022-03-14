package co.com.sofka.usecase;


import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.dominio.vendedor.Vendedor;
import co.com.sofka.dominio.vendedor.command.CrearVendedor;
import co.com.sofka.dominio.vendedor.value.VendedorId;

public class CrearVendedorUseCase extends UseCase<RequestCommand<CrearVendedor>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearVendedor> input) {
        CrearVendedor crearVendedor = input.getCommand();
        VendedorId vendedorId= VendedorId.of("vvv");
        Vendedor vendedor = new Vendedor(vendedorId,crearVendedor.getCuentaId());

        emit().onResponse(new ResponseEvents(vendedor.getUncommittedChanges()));
    }
}
