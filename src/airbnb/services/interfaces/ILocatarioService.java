package airbnb.services.interfaces;

import airbnb.models.entities.Reserva;
import airbnb.models.request.ReservaRequest;
import airbnb.models.response.ReservaResponse;

public interface ILocatarioService{
    
    ReservaResponse solicitaReserva(ReservaRequest reservaRequest);

    ReservaResponse updatedReserva(ReservaRequest reservaRequest, int id_reserva);

    Reserva findReservaId(int id_reserva);

    void checkReserva(Reserva reserva);

    void checkNoReserva(Reserva reserva);

    void cancelarReserva(int id_reserva);

}
