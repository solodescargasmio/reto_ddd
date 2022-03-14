package co.com.sofka.dominio.compra;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.dominio.compra.value.ReservaId;

public class Reserva extends Entity<ReservaId> {
    public Reserva(ReservaId reservaId) {
        super(reservaId);
    }
}
