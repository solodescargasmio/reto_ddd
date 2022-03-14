package co.com.sofka.dominio.compra.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Marca implements ValueObject<String> {
    private final String value;

    public Marca(String value) {
        this.value = Objects.requireNonNull(value);
        if(value.equals("")){
            throw new IllegalArgumentException("El Marca no puede ser vacia");
        }
    }

    @Override
    public String value() {
        return value;
    }
}