import controller.TicketController;
import dto.IssueTicketRequestDTO;
import dto.IssueTicketResponseDTO;
import dto.enums.ResponseStatus;
import models.enums.VehicleType;

public class Client {
    TicketController ticketController;

    public Client(TicketController ticketController){
        this.ticketController = ticketController;
    }

    public void generateIncomingRequests(){
        testCase1();
        testCase2();
    }

    private void testCase1() {
        // 1.
        IssueTicketRequestDTO requestDTO = new IssueTicketRequestDTO();
        requestDTO.setVehicleNumber("MH03AZ7775");
        requestDTO.setGateId(1L);
        requestDTO.setVehicleOwnerName("Vaibhav Srivastava");
        requestDTO.setVehicleType(VehicleType.CAR);

        IssueTicketResponseDTO responseDTO = ticketController.issueTicket(requestDTO);

        System.out.println("Status : " + responseDTO.getResponseStatus());
        if (ResponseStatus.SUCCESS.equals(responseDTO.getResponseType())) {
            if (responseDTO.getTicket() != null) {
                System.out.println("TicketGenerated : " + responseDTO.getTicket().getTicketNumber());
            } else {
                System.out.println("Ticket is null, ticket generation failed.");
            }
        } else {
            System.out.println("Failed to generate ticket: " + responseDTO.getFailureMessage());
        }
    }


    private void testCase2() {
        // 2.
        IssueTicketRequestDTO requestDTO = new IssueTicketRequestDTO();
        requestDTO.setVehicleNumber("MH03AZ7775");
        requestDTO.setGateId(1L);
        requestDTO.setVehicleOwnerName("Tushar Nandan");
        requestDTO.setVehicleType(VehicleType.CAR);

        IssueTicketResponseDTO responseDTO = ticketController.issueTicket(requestDTO);

        System.out.println("Status : " + responseDTO.getResponseStatus());
        if (ResponseStatus.SUCCESS.equals(responseDTO.getResponseType())) {
            if (responseDTO.getTicket() != null) {
                System.out.println("TicketGenerated : " + responseDTO.getTicket().getTicketNumber());
            } else {
                System.out.println("Ticket is null, ticket generation failed.");
            }
        } else {
            System.out.println("Failed to generate ticket: " + responseDTO.getFailureMessage());
        }
    }
}
