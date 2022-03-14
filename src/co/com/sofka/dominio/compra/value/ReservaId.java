package co.com.sofka.dominio.compra.value;

import co.com.sofka.domain.generic.Identity;

public class ReservaId extends Identity {
    private ReservaId(String id){
        super(id);
    }

    public ReservaId(){

    }

    public static ReservaId of(String id) {
        return new ReservaId(id);
    }
}
