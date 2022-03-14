package co.com.sofka.dominio.compra.value;

import co.com.sofka.domain.generic.Identity;

public class TransaccionId extends Identity {
    private TransaccionId(String id){
        super(id);
    }

    public TransaccionId(){

    }

    public static TransaccionId of(String id) {
        return new TransaccionId(id);
    }
}
