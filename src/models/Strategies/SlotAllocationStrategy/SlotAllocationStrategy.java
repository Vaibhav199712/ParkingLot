package models.Strategies.SlotAllocationStrategy;

import models.Gate;
import models.ParkingSlot;
import models.enums.VehicleType;

public interface SlotAllocationStrategy {
    // gate needed to get the closest available slot.
    public ParkingSlot getParkingSlot(VehicleType vehicleType, Gate gate);

}
