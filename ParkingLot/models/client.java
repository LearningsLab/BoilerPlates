package models;
import models.Constants.*;
import services.BookingSlotService;
public class client {
    public BookingSlotService bookingService;
    private static ParkStatus ParkVehicle(Vehicle vehicle,ParkingLot pLot){
        Boolean isParkingLotFull=pLot.isFull(vehicle.vtype);

        if (isParkingLotFull){
            return ParkStatus.FAIL;
        }

        // get empty slot and book it and return status

        ParkingSlot emptySlot=pLot.getFreeSlot();
        Boolean status=emptySlot.setBooked(true);
        if (status){
            return ParkStatus.SUCESS;
        }

        return ParkStatus.FAIL;
    }
    public static void main(String[] args) {

        //Create a ParkingLot
        //Add ParkingFloor to ParkingLot
        //Add Parking Slot to Parking Floor
        
        ParkingLot pLot= new ParkingLot.Builder("MALLROAD",5).addFloor(0,new 
            ParkingFloor.Builder().addSlots(3,Constants.SlotTypes.CAR).buidFloor()).buidParkingLot();
        // keep a list of available slots    
        for (ParkingFloor floor:pLot.pFloors){
            pLot.makeSlotsAvailbale(floor);
        }
        
        Vehicle car=new Vehicle(123,"HRBU7533",VehicleType.CAR);

        ParkStatus parkStatus=ParkVehicle(car,pLot);
        if (parkStatus==ParkStatus.SUCESS){
            System.out.println("VEhicle Parked Successfully");
            System.out.println("Current parking inventory"+pLot.emptySlots());
        }
        
        
    }
}
