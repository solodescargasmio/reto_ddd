package co.com.sofka.dominio.compra.value;

import co.com.sofka.domain.generic.Identity;

public class VehiculoId extends Identity {
    private VehiculoId(String id){
        super(id);
    }

    public VehiculoId(){

    }

    public static VehiculoId of(String id) {
        return new VehiculoId(id);
    }
}
