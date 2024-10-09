
import Services.TicketService;
import controller.TicketController;
import models.Gate;
import models.Operator;
import models.ParkingFloor;
import models.ParkingLot;
import models.enums.GateType;
import models.enums.SlotAllocationStrategyType;
import repositories.GateRepository;
import repositories.ParkingLotRepository;
import repositories.TicketRepository;
import repositories.VehicleRepository;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotApplication {
    public static void main(String[] args) {
        // can you give the order in which I will create the Repository, service, controller objects.
        // controller depends on service, service depends on repo.
        // controller -> service -> repo
        // what kind of dependency is this called? topological sorting.
        // dependencies are resolved in this manner.
        // the frameworks solve the dependencies in this manner.
        // find the dependencies using graph, solve it using topological sorting. then create the objects in order.

        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        TicketRepository ticketRepository = new TicketRepository();

        TicketService ticketService = new TicketService(
                gateRepository,
                vehicleRepository,
                parkingLotRepository,
                ticketRepository);

        TicketController ticketController = new TicketController(ticketService);

        initialiseDatabase();

        Client client = new Client(ticketController);
        client.generateIncomingRequests();
    }

    private static void initialiseDatabase(){
        Operator entryGateOperator = new Operator("111", "op1");
        Operator exitGateOperator = new Operator("222", "op2");

        Gate gate1 = new Gate(1, entryGateOperator, GateType.ENTRY_GATE);
        Gate gate2 = new Gate(2, exitGateOperator, GateType.EXIT_GATE);

        List<Gate> gateList = new ArrayList<>();
        gateList.add(gate1);
        gateList.add(gate2);

        ParkingFloor floor1 = new ParkingFloor(1);

        List<ParkingFloor> parkingFloorsList = new ArrayList<>();
        parkingFloorsList.add(floor1);

        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setGates(gateList);
        parkingLot.setSlotAllocationStrategyType(SlotAllocationStrategyType.RANDOM);
        parkingLot.setParkingFloors(parkingFloorsList);

        GateRepository.gatesTable.put(1L, gate1);
        GateRepository.gatesTable.put(2L, gate1);

        ParkingLotRepository.parkingLotTable.put(1L, parkingLot);
    }
}
