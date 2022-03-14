package co.com.sofka.dominio.generico;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {
    public final String value;

    public Nombre(String value) {
        this.value = Objects.requireNonNull(value);
        if(value.equals("")){
            throw new IllegalArgumentException("El Nombre no puede ser vacio");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
