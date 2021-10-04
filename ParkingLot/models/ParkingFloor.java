package models;

//import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

import models.Constants.SlotTypes;

public class ParkingFloor {
    private Map<ParkingSlot,Enum<SlotTypes>> pSlots;
    ArrayList<ParkingSlot> parkingSlots;
    //private int maxSlots;
    private int lastSlotNo=0;
    

    public Boolean isFull(){
        if (this.pSlots.size()==Constants.MaxSlotsPerFloor){
            return true;
        }
        return false;
    }

    public static class Builder {
        private ParkingFloor pFloor;

        public Builder(){
            this.pFloor=new ParkingFloor();
            this.pFloor.pSlots=new HashMap<ParkingSlot,Enum<SlotTypes>>();
            this.pFloor.parkingSlots = new ArrayList<>();
        }

        public Builder addSlots(int no,Constants.SlotTypes type){
            //throw exception if parking slot capacity is exceeding
            //System.out.println("parkingfloor   "+this.pFloor.pSlots);
            if (no+this.pFloor.pSlots.size()>=Constants.MaxSlotsPerFloor){
                
                System.out.println("parking Floor can only add"+ (Constants.MaxSlotsPerFloor-this.pFloor.pSlots.size())+ "slots");
            }
            
            for (int i=0;i<no;i++){
                ParkingSlot newSlot=new ParkingSlot.Builder().addLoc(++this.pFloor.lastSlotNo).buid();
                this.pFloor.pSlots.put(newSlot, type);
                this.pFloor.parkingSlots.add(newSlot);
            }
            
            return this;
        }
        public ParkingFloor buidFloor(){
            return this.pFloor;
        }


    }
    
}
