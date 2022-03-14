package co.com.sofka.dominio.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dominio.cliente.event.ClienteCreado;
import co.com.sofka.dominio.cliente.value.ClienteId;
import co.com.sofka.dominio.cliente.value.Documento;
import co.com.sofka.dominio.generico.Nombre;
import co.com.sofka.dominio.vendedor.VendedorEventChange;

import java.util.List;

public class Cliente extends AggregateEvent<ClienteId> {
    protected Documento documento;
    protected Nombre nombre;
    protected ClienteId clienteId;
    public Cliente(ClienteId clienteId,Documento documento,Nombre nombre) {
        super(clienteId);
        subscribe(new ClienteEventChange(this));
        appendChange(new ClienteCreado(clienteId)).apply();
    }
    private Cliente(ClienteId clienteId){
            super(clienteId);
            subscribe(new ClienteEventChange(this));
    }
    public static Cliente from(ClienteId clienteId, List<DomainEvent> eventList){
        Cliente cliente = new Cliente(clienteId);
        eventList.forEach(cliente::applyEvent);
        return cliente;
    }


/*
    public static Vendedor from(VendedorId vendedorId, List<DomainEvent> eventList){
        Vendedor vendedor = new Vendedor(vendedorId);
        eventList.forEach(vendedor::applyEvent);
        return vendedor;
    }*/

    public void agregarDocumento(Nombre nombre){

    }
    public void agregarNombre(Nombre nombre){

    }

    public Documento documento() {
        return documento;
    }

    public Nombre nombre() {
        return nombre;
    }
}
