package models;

public class ParkingSlot {
    private int loc;
    private Boolean isBooked;
    private Boolean isActive;

    public int getLocation(){
        return this.loc;
    }
    public Boolean setBooked(Boolean val){
        this.isBooked=val;
        return this.isBooked;
    }
    public Boolean getBookedStatus(){
        return this.isBooked;
    }    

    public Boolean getStatus(){
        return this.isActive;
    }
    public static class Builder{
        private ParkingSlot pSlot;
        public Builder(){
            this.pSlot=new ParkingSlot();
        }
        public Builder addLoc(int no){
            this.pSlot.loc=no;
            this.pSlot.isActive=true;
            return this;
        }
        public ParkingSlot buid(){
            return this.pSlot;
        }

    }
    public static Object Builder() {
        return null;
    }

}
