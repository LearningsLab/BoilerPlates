package models;

//import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

//import models.Constants.SlotOrVehicleTypes;

public class ParkingFloor {
    Map<Constants.SlotOrVehicleTypes,ArrayList<ParkingSlot>> pSlots;
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
            this.pFloor.pSlots=new HashMap<Constants.SlotOrVehicleTypes,ArrayList<ParkingSlot>>();
            this.pFloor.parkingSlots = new ArrayList<>();
        }

        public Builder addSlots(int no,Constants.SlotOrVehicleTypes type){
            //throw exception if parking slot capacity is exceeding
            //System.out.println("parkingfloor   "+this.pFloor.pSlots);
            if (no+this.pFloor.pSlots.size()>=Constants.MaxSlotsPerFloor){
                
                System.out.println("parking Floor can only add"+ (Constants.MaxSlotsPerFloor-this.pFloor.pSlots.size())+ "slots");
            }
            
            for (int i=0;i<no;i++){
                ParkingSlot newSlot=new ParkingSlot.Builder().addLoc(++this.pFloor.lastSlotNo).buid();
                System.out.println("slot "+ this.pFloor.pSlots.get(type));
                ArrayList<ParkingSlot> tmp=new ArrayList<ParkingSlot>();
                if (this.pFloor.pSlots.get(type)!=null){
                    tmp = this.pFloor.pSlots.get(type);
                }
                
                System.out.println("tmp value"+tmp);
                tmp.add(newSlot);
                this.pFloor.pSlots.put(type,tmp);
                this.pFloor.parkingSlots.add(newSlot);
            }
            
            return this;
        }
        public ParkingFloor buidFloor(){
            return this.pFloor;
        }


    }
    
}
