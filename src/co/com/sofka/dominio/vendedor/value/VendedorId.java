package co.com.sofka.dominio.vendedor.value;

import co.com.sofka.domain.generic.Identity;

public class VendedorId extends Identity {
    private VendedorId(String id){
        super(id);
    }

    public VendedorId(){

    }

    public static VendedorId of(String id) {
        return new VendedorId(id);
    }

}
