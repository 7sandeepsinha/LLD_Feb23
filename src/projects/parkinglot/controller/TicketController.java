package projects.parkinglot.controller;

import projects.parkinglot.dto.ErrorReponseDTO;
import projects.parkinglot.dto.GenerateTIcketResponseDTO;
import projects.parkinglot.dto.GenerateTicketRequestDTO;
import projects.parkinglot.dto.ResponseDTO;
import projects.parkinglot.exception.ParkingLotNotAvailableException;
import projects.parkinglot.exception.ParkingSpotNotAvailable;
import projects.parkinglot.model.Ticket;
import projects.parkinglot.service.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public ResponseDTO getTicket(GenerateTicketRequestDTO generateTicketRequestDTO){
        try {
            Ticket ticket = ticketService.getTicket(generateTicketRequestDTO.getVehicle(), generateTicketRequestDTO.getEntryGate());
            GenerateTIcketResponseDTO generateTIcketResponseDTO = new GenerateTIcketResponseDTO();
            generateTIcketResponseDTO.setTicket(ticket);
            return generateTIcketResponseDTO;
        } catch (ParkingLotNotAvailableException p){
            return new ErrorReponseDTO("ParkingLotNot Available", 404);
        } catch (ParkingSpotNotAvailable p){
            return new ErrorReponseDTO("ParkingSpotNot Available", 404);
        }
    }
}

// TODO
/*
    1. Generate 10 parking spots
    2. Create 2 floors of 5 spots each
    3. Using the spots create the floor, and using the floors create the parkingLot
    4. Create and add gates to parkingLot
    5. Generate Ticket
 */

/*
    SMALL            S3 S1                                                    S2 S4 S5
    MEDIUM
    LARGE
 */
