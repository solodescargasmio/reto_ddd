package co.com.sofka.dominio.cliente.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.dominio.cliente.value.ClienteId;

public class CrearCliente extends Command {
    private final ClienteId clienteId;

    public CrearCliente(ClienteId clienteId) {
        this.clienteId = clienteId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
