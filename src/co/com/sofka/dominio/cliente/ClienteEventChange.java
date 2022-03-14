package co.com.sofka.dominio.cliente;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.dominio.cliente.event.ClienteCreado;

public class ClienteEventChange extends EventChange {
    public ClienteEventChange(Cliente cliente) {
        apply((ClienteCreado event)->{
            cliente.clienteId = event.getClienteId();
        });
    }
}
