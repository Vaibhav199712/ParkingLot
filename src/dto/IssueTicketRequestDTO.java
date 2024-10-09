package dto;

import models.enums.VehicleType;

public class IssueTicketRequestDTO {
    private String vehicleNumber ;
    private String vehicleOwnerName ;
    private VehicleType vehicleType ;
    private Long gateId ;

    // client only knows basic details, and not the actual models that our system has
    // Client will not give the actual models that your system has defined

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleOwnerName() {
        return vehicleOwnerName;
    }

    public void setVehicleOwnerName(String vehicleOwnerName) {
        this.vehicleOwnerName = vehicleOwnerName;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }
}
