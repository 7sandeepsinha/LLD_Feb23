package com.scaler.BMSApr23.service;

import com.scaler.BMSApr23.exception.ShowSeatNotAvailableException;
import com.scaler.BMSApr23.model.SeatStatus;
import com.scaler.BMSApr23.model.ShowSeat;
import com.scaler.BMSApr23.model.ShowSeatStatus;
import com.scaler.BMSApr23.model.Ticket;
import com.scaler.BMSApr23.repository.ShowRepository;
import com.scaler.BMSApr23.repository.ShowSeatRepository;
import com.scaler.BMSApr23.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TicketService {

    private TicketRepository ticketRepository;
    private ShowSeatRepository showSeatRepository;
    private ShowRepository showRepository;

    @Autowired
    public TicketService(TicketRepository ticketRepository, ShowSeatRepository showSeatRepository, ShowRepository showRepository) {
        this.ticketRepository = ticketRepository;
        this.showSeatRepository = showSeatRepository;
        this.showRepository = showRepository;
    }


    @Transactional(isolation = Isolation.SERIALIZABLE) //sets the Transaction isolation level as SERIALIZABLE
    public Ticket bookTicket(Long showId, List<Long> showSeatIds, Long userId) throws ShowSeatNotAvailableException {
        //Fetch all the given showSeats from the table
        List<ShowSeat> showSeats = showSeatRepository.findByIdIn(showSeatIds);

        //Check if all of them are available
        for(ShowSeat showSeat : showSeats){
            if(!showSeat.getSeatStatus().equals(ShowSeatStatus.AVAILABLE)){
                throw new ShowSeatNotAvailableException("Show seat is not available");
            }
        }

        //If all are available then make them locked
        for(ShowSeat showSeat : showSeats){
            showSeat.setSeatStatus(ShowSeatStatus.LOCKED);
            showSeatRepository.save(showSeat);
        }

        //wait for payment confirmation
        //assuming payment is done
        //create and return the ticket object
        Ticket ticket = new Ticket();
        ticket.setShowSeats(showSeats);
        ticket.setShow(showRepository.findById(showId).get());
        //set other details for ticket
        ticket = ticketRepository.save(ticket);

        //mark them booked after ticket is done
        for(ShowSeat showSeat : showSeats){
            showSeat.setSeatStatus(ShowSeatStatus.BOOKED);
            showSeatRepository.save(showSeat);
        }
        return ticket;
    }
}
