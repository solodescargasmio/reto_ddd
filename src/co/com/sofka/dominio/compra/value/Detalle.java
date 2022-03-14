package co.com.sofka.dominio.compra.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Detalle  implements ValueObject<String> {
    private final String value;

    public Detalle(String value) {
        this.value = Objects.requireNonNull(value);
        if(value.equals("")){
            throw new IllegalArgumentException("El Detalle no puede ser vacio");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
