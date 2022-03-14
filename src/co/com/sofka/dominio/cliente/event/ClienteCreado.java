package co.com.sofka.dominio.cliente.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dominio.cliente.value.ClienteId;

public class ClienteCreado extends DomainEvent {
    private final ClienteId clienteId;
    public ClienteCreado(ClienteId clienteId) {
        super("cliente.clientecreado");
        this.clienteId = clienteId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
