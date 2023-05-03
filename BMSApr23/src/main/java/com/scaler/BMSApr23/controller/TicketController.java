package com.scaler.BMSApr23.controller;

import com.scaler.BMSApr23.exception.ShowSeatNotAvailableException;
import com.scaler.BMSApr23.model.Ticket;
import com.scaler.BMSApr23.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TicketController {

    private TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public Ticket bookTicket(Long showId, List<Long> showSeatIds, Long userId) throws ShowSeatNotAvailableException {
        return ticketService.bookTicket(showId, showSeatIds, userId);
    }
}
