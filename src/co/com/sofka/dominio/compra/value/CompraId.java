package co.com.sofka.dominio.compra.value;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.dominio.vendedor.value.CuentaId;

public class CompraId extends Identity {
    private CompraId(String id){
        super(id);
    }

    public CompraId(){

    }

    public static CompraId of(String id) {
        return new CompraId(id);
    }
}
