package co.com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.dominio.cliente.Cliente;
import co.com.sofka.dominio.cliente.command.CrearCliente;
import co.com.sofka.dominio.cliente.value.ClienteId;
import co.com.sofka.dominio.cliente.value.Documento;
import co.com.sofka.dominio.generico.Nombre;

public class CrearClienteUseCase extends UseCase<RequestCommand<CrearCliente>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearCliente> input) {
        CrearCliente crearCliente = input.getCommand();
        ClienteId clienteId=ClienteId.of("ccc");
        Nombre nombre=new Nombre("Nombre");
        Documento documento = new Documento("123456");
        Cliente cliente = new Cliente(clienteId,documento,nombre);

        emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
    }
}
