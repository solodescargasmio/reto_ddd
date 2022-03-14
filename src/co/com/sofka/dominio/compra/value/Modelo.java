package co.com.sofka.dominio.compra.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Modelo implements ValueObject<String> {
    private final String value;

    public Modelo(String value) {
        this.value = Objects.requireNonNull(value);
        if(value.equals("")){
            throw new IllegalArgumentException("El Modelo no puede ser vacio");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
