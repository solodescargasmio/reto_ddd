package co.com.sofka.dominio.cliente.value;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.dominio.vendedor.value.CuentaId;

public class ClienteId extends Identity {
    private ClienteId(String id){
        super(id);
    }

    public ClienteId(){

    }

    public static ClienteId of(String id) {
        return new ClienteId(id);
    }
}
