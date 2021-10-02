package services;

import models.ParkingLot;
import models.*;

public class BookingSlotService {
    private ParkingLot pLot;

    public BookingSlotService(ParkingLot parkingLot){
        this.pLot=parkingLot;
    }

    public Boolean bookSlot(){
        //get free slot on any of parking floor
        ParkingSlot pSlot=this.pLot.getFreeSlot();
        Boolean isBooked = pSlot.setBooked(true);
        return isBooked;
    }
}
