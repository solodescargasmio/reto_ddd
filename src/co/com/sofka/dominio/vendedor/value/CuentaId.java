package co.com.sofka.dominio.vendedor.value;

import co.com.sofka.domain.generic.Identity;

public class CuentaId extends Identity {
    private CuentaId(String id){
        super(id);
    }

    public CuentaId(){

    }

    public static CuentaId of(String id) {
        return new CuentaId(id);
    }
}
