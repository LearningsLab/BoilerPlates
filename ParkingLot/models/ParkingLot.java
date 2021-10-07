package models;


import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Map;
//import java.util.Currency;
//import java.util.Map;
import java.util.Stack;

public class ParkingLot{

    private String name;
    ArrayList<ParkingFloor> pFloors;
    //Map<Constants.VehicleType,Stack<ParkingSlot>> mapSlots;
    private Stack<ParkingSlot> emptySlots;
    private int maxFloors;

    public ParkingLot(String name,int floors){
        this.emptySlots=new Stack<>();
        this.maxFloors=floors;
        this.name=name;
    }

    public String getLocation(){
        return this.name;
    }
    public Boolean isFull(Constants.SlotOrVehicleTypes stype){
        for (ParkingFloor  floor:this.pFloors){
            ArrayList<ParkingSlot> slots=floor.pSlots.get(stype);
            if (slots.size()>0){
                return false;
            }
        }
        return true;
    }
    public Boolean makeSlotsAvailbale(ParkingFloor floor){
         for (  ParkingSlot slot : floor.parkingSlots) {
             this.emptySlots.add(slot);
         }
        return true;
    }

    public ParkingSlot getFreeSlot(){
        return this.emptySlots.pop();
    }
    public int emptySlots(){
        return this.emptySlots.size();
    }

    public static class Builder{
        private ParkingLot pLot;
        public Builder(String name,int floors){
            this.pLot=new ParkingLot(name,floors);
            this.pLot.pFloors= new ArrayList<>();
            this.pLot.emptySlots = new Stack<ParkingSlot>();
            //this.pLot.mapSlots = new HashMap<>();
        }
        public Builder setName(String name){
            this.pLot.name=name;
            return this;
        }
        public Builder addFloor(int no,ParkingFloor pFloor){
            if (this.pLot.pFloors.size()==this.pLot.maxFloors){
                System.out.println("reached max no already ");
            }
            this.pLot.pFloors.add(pFloor);
            return this;
        }

        public ParkingLot buidParkingLot(){
            return this.pLot;
        }

    }

}