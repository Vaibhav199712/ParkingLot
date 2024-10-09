package dto;

import dto.enums.ResponseStatus;
import models.Ticket;

public class IssueTicketResponseDTO {
    private Ticket ticket ;
    private ResponseStatus responseStatus;
    private String failureMessage ;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ResponseStatus getResponseType() {
        return responseStatus;
    }

    public void setResponseType(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    public  getResponseStatus() {
        return null ;
    }
}
