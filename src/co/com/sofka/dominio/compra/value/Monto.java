package co.com.sofka.dominio.compra.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Monto implements ValueObject<Double> {
    private final Double value;

    public Monto(Double value) {
        this.value = Objects.requireNonNull(value);
        if(value<=0){
            throw new IllegalArgumentException("El Monto no puede ser cero o inferior");
        }
    }

    @Override
    public Double value() {
        return value;
    }
}
