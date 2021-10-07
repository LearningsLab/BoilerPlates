package models;

public class Vehicle {
    private int id;
    private String identifier;
    private Constants.SlotOrVehicleTypes vtype;

    public Vehicle(int id,String registry,Constants.SlotOrVehicleTypes val){
        this.id=id;
        this.identifier=registry;
        this.vtype=val;
    }
    public String getVehicleRegistry(){
        return this.identifier;
    }
    public int getVehicleId(){
        return this.id;
    }
    public Constants.SlotOrVehicleTypes getVehicleType(){
        return this.vtype;
    }


}
