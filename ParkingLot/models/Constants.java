package models;

public interface Constants {
    enum SlotTypes{
        CAR,
        TRUCK,
        BIKE
    }
    enum VehicleType {
        CAR,
        TRUCK,
        BIKE
    }
    enum ParkStatus{
        SUCESS,
        FAIL
    }
    final static int MaxSlotsPerFloor=20;
}
