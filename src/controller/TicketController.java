package controller;

import Services.TicketService;
import dto.IssueTicketRequestDTO;
import dto.IssueTicketResponseDTO;
import dto.enums.ResponseStatus;
import models.Ticket;

public class TicketController {

    //TicketService ticketService = new TicketService() ;
    private TicketService ticketService ;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService ;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO requestDTO){
        // Validations

        IssueTicketResponseDTO responseDTO = new IssueTicketResponseDTO() ;
        try {
            Ticket ticket = ticketService.issueTicket(requestDTO.getVehicleNumber(),
                    requestDTO.getVehicleOwnerName(),
                    requestDTO.getVehicleType(),
                    requestDTO.getGateId());


            //IssueTicketResponseDTO responseDTO = new IssueTicketResponseDTO() ;
            responseDTO.setTicket(ticket);
            responseDTO.setResponseType(ResponseStatus.SUCCESS);
        } catch (Exception e) {

            responseDTO.setResponseType(ResponseStatus.FAILURE);
            responseDTO.setFailureMessage(e.getMessage());
        }
        return responseDTO ;
    }
}
// Controller responsibilities:
// 1. interact with the client => get requestDTO
// 2. validations on input
// 3. call the service, provide it with the input
// 4. receive the output from the service
// 5 . handle any exception given by the service, or other layer.
// 5. send it to client in a proper format => return responseDTO

// DTOs only used for communication to outer system.
