package models;

public class Vehicle {
    private int id;
    private String identifier;
    private Constants.VehicleType vtype;

    public Vehicle(int id,String registry,Constants.VehicleType val){
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
    public Constants.VehicleType getVehicleType(){
        return this.vtype;
    }


}
