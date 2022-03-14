package co.com.sofka.dominio.generico;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class FechaC implements ValueObject<Date> {
    private final Date fecha;

    public FechaC(Date fecha) {
        this.fecha = Objects.requireNonNull(fecha);
    /*    if (fecha.before(Calendar.getInstance().getTime())) {
            throw new IllegalArgumentException("La Fecha debe ser anterior o la actual");
        }*/
    }

    @Override
    public Date value() {
        return fecha;
    }
}
