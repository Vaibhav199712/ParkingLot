package models;

import models.enums.ParkingFloorStatus;
import models.enums.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor extends BaseModel{
    private int FloorNumber ;
    private List<ParkingSlot> parkingSlotList ;
    private List<VehicleType> allowedVehicleTypes ;
    private ParkingFloorStatus parkingFloorStatus ;

    public ParkingFloor(int floorNumber){
        this.FloorNumber = floorNumber ;
        this.parkingSlotList = new ArrayList<>() ;
        this.allowedVehicleTypes = new ArrayList<>() ;
        this.parkingFloorStatus = ParkingFloorStatus.OPEN ;
    }

    public int getFloorNumber() {
        return FloorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        FloorNumber = floorNumber;
    }

    public List<ParkingSlot> getParkingSlot() {
        return parkingSlotList;
    }

    public void setParkingSlot(List<ParkingSlot> parkingSlot) {
        this.parkingSlotList = parkingSlot;
    }

    public List<VehicleType> getAllowedVehicleTypes() {
        return allowedVehicleTypes;
    }

    public void setAllowedVehicleTypes(List<VehicleType> allowedVehicleTypes) {
        this.allowedVehicleTypes = allowedVehicleTypes;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }
}
