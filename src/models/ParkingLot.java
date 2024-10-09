package models;
import models.enums.FeeCalculationStrategyType;
import models.enums.ParkingLotStatus;
import models.enums.SlotAllocationStrategyType;
import models.enums.VehicleType;

import java.util.ArrayList;
import java.util.List ;

public class ParkingLot extends BaseModel {
    private String address ;
    private List<ParkingFloor> parkingFloor ;
    private List<Gate> gate ;
    private ParkingLotStatus parkingLotStatus ;
    private List<VehicleType> allowedVehicleTypes ;
    private FeeCalculationStrategyType feeCalculationStrategyType  ;
    private SlotAllocationStrategyType slotAllocationStrategyType ;


    public ParkingLot(){
        this.address = "" ;
        this.parkingFloor = new ArrayList<>() ;
        this.gate = new ArrayList<>() ;
        this.allowedVehicleTypes = new ArrayList<>() ;
        this.parkingLotStatus = ParkingLotStatus.OPEN ;
        this.feeCalculationStrategyType = FeeCalculationStrategyType.HOURLY ;
        this.slotAllocationStrategyType = SlotAllocationStrategyType.RANDOM ;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingFloor> getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(List<ParkingFloor> parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public List<Gate> getGate() {
        return gate;
    }

    public void setGate(List<Gate> gate) {
        this.gate = gate;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<VehicleType> getAllowedVehicleTypes() {
        return allowedVehicleTypes;
    }

    public void setAllowedVehicleTypes(List<VehicleType> allowedVehicleTypes) {
        this.allowedVehicleTypes = allowedVehicleTypes;
    }

    public FeeCalculationStrategyType getFeeCalculationStrategyType() {
        return feeCalculationStrategyType;
    }

    public void setFeeCalculationStrategyType(FeeCalculationStrategyType feeCalculationStrategyType) {
        this.feeCalculationStrategyType = feeCalculationStrategyType;
    }

    public SlotAllocationStrategyType getSlotAllocationStrategyType() {
        return slotAllocationStrategyType;
    }

    public void setSlotAllocationStrategyType(SlotAllocationStrategyType slotAllocationStrategyType) {
        this.slotAllocationStrategyType = slotAllocationStrategyType;
    }

    public void setGates( ) {
    }

    public void setGates(List<Gate> gateList) {
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloorsList) {
    }
}
