public class ElectricLamp {
    private boolean status;
    public ElectricLamp(){

    }
    public boolean isStatus(){
        return status;
    }
    public void turnOff(){
        this.status=false;
    }
    public void turnOn(){
        this.status=true;
    }
}
