package models;
import models.Constants.*;
import services.BookingSlotService;
public class client {
    public BookingSlotService bookingService;
    private static ParkStatus ParkVehicle(Vehicle vehicle,ParkingLot pLot){
        Boolean isParkingLotFull=pLot.isFull();

        if (isParkingLotFull){
            return ParkStatus.FAIL;
        }

        //if bookingService.

        return ParkStatus.SUCESS;
    }
    public static void main() {

        //Create a ParkingLot
        //Add ParkingFloor to ParkingLot
        //Add Parking Slot to Parking Floor
        
        ParkingLot pLot= new ParkingLot.Builder("MALLROAD",5).addFloor(0,new 
            ParkingFloor.Builder().addSlots(3,Constants.SlotTypes.CAR).buidFloor()).buidParkingLot();
        // keep a list of available slots    
        for (ParkingFloor floor:pLot.pFloors){
            pLot.updateEmptySlots(floor);
        }
        
        Vehicle car=new Vehicle(123,"HRBU7533",VehicleType.CAR);

        ParkStatus parkStatus=ParkVehicle(car,pLot);
        if (parkStatus==ParkStatus.SUCESS){
            System.out.println("VEhicle Parked Successfully");
        }
        
        
    }
}
