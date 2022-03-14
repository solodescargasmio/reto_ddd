package co.com.sofka.dominio.vendedor;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dominio.vendedor.envent.CuentaGenerada;
import co.com.sofka.dominio.vendedor.envent.VendedorCreado;
import co.com.sofka.dominio.vendedor.value.CuentaId;
import co.com.sofka.dominio.vendedor.value.VendedorId;

import java.util.List;

public class Vendedor extends AggregateEvent<VendedorId> {
    protected CuentaId cuentaId;
    public Vendedor(VendedorId vendedorId,CuentaId cuentaId) {
        super(vendedorId);
        subscribe(new VendedorEventChange(this));
        appendChange(new VendedorCreado(cuentaId)).apply();
    }

    private Vendedor(VendedorId vendedorId){
        super(vendedorId);
        subscribe(new VendedorEventChange(this));


    }

    public static Vendedor from(VendedorId vendedorId, List<DomainEvent> eventList){
        Vendedor vendedor = new Vendedor(vendedorId);
        eventList.forEach(vendedor::applyEvent);
        return vendedor;
    }

    public void crearCuenta(CuentaId cuentaId){
        appendChange(new CuentaGenerada(cuentaId)).apply();
    }
}
