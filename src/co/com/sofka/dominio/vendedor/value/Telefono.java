package co.com.sofka.dominio.vendedor.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Telefono implements ValueObject<String> {
    public final String value;

    public Telefono(String value) {
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
