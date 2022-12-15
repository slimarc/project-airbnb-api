package airbnb.services.implement;

import java.util.List;

import airbnb.exceptions.NotFoundException;
import airbnb.models.entities.Reserva;
import airbnb.models.request.ReservaRequest;
import airbnb.models.response.ReservaResponse;
import airbnb.services.interfaces.ILocatarioService;

public class LocatarioServiceImpl implements ILocatarioService {

    private List<Reserva> reservasList;
    
    public ReservaResponse solicitaReserva(ReservaRequest reservaRequest){
        Reserva reserva = new Reserva();
        reserva.setId_reserva(reservaRequest.getId_reserva());
        reserva.setId_item(reservaRequest.getId_item());
        reserva.setLocatario(reservaRequest.getLocatario());
        reserva.setQtd_dias(reservaRequest.getQtd_dias());
        reserva.setQtd_pessoas(reservaRequest.getQtd_pessoas());
        reserva.setValor_total(reservaRequest.getValor_total());
        reservasList.add(reserva);
        return new ReservaResponse(reserva.getId_reserva(), reserva.getId_item(), reserva.getLocatario(), reserva.getQtd_dias(), reserva.getQtd_pessoas(), reserva.getValor_total());
    }

    @Override
    public ReservaResponse updatedReserva(ReservaRequest reservaRequest, int id_reserva) {
        Reserva reservaUpdated = this.findReservaId(id_reserva);
        reservaUpdated.setId_item(reservaRequest.getId_item());
        reservaUpdated.setLocatario(reservaRequest.getLocatario());
        reservaUpdated.setQtd_dias(reservaRequest.getQtd_dias());
        reservaUpdated.setQtd_pessoas(reservaRequest.getQtd_pessoas()); 
        reservaUpdated.setValor_total(reservaRequest.getValor_total()); 
        reservasList.set(id_reserva, reservaUpdated);
        return new ReservaResponse(reservaUpdated.getId_reserva(), reservaUpdated.getId_item(), reservaUpdated.getLocatario(), reservaUpdated.getQtd_dias(), reservaUpdated.getQtd_pessoas(), reservaUpdated.getValor_total());
    }

    public Reserva findReservaId(int id_reserva){
        for (Reserva reserva: reservasList) {
            if (reserva.getId_reserva() == id_reserva)  
                return reserva;    
                this.checkReserva(reserva);  
        }
        return null;
    }

    @Override
    public void checkReserva(Reserva reserva){
        if (reserva != null)
            throw new NotFoundException("Reserva existente.");
    }

    @Override
    public void checkNoReserva(Reserva reserva) {
        if (reserva == null)
            throw new NotFoundException("Reserva não encontrada.");
    }
    

    public void cancelarReserva(int id_reserva){
        for(Reserva reverva: reservasList){
            if(reverva.getId_reserva() == id_reserva){
                reservasList.remove(reverva);
            }
        }
        throw new NotFoundException("Essa reserva não existe.");
    }

}
