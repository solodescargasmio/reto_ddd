package co.com.sofka.dominio.vendedor.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Comision  implements ValueObject<Double> {
    public final Double value;

    public Comision (Double value) {
        this.value = Objects.requireNonNull(value);
        if(value<0D){
            throw new IllegalArgumentException("La Comision no puede ser menor a cero");
        }
    }

    @Override
    public Double value() {
        return value;
    }
}
