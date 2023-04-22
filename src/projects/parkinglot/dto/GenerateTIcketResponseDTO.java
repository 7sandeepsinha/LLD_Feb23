package projects.parkinglot.dto;

import projects.parkinglot.model.Ticket;

public class GenerateTIcketResponseDTO extends ResponseDTO {
    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
