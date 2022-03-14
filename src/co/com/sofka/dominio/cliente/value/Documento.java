package co.com.sofka.dominio.cliente.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Documento implements ValueObject<String> {
    public final String value;

    public Documento(String value) {
        this.value = Objects.requireNonNull(value);
        if(value.equals("")){
            throw new IllegalArgumentException("El Documento no puede ser vacio");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
