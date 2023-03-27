public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;

    public SwitchButton() {

    }

    public void connectToLamp(ElectricLamp eL) {
        if(this.status){
            System.out.println("Connect to lamp");
            eL.turnOn();
        }else{
            System.out.println("Disconnect to lamp");
            eL.turnOff();
        }
    }
    public boolean Status(){
        return status;
    }
    public void switchOff() {
        this.status=false;
    }
    public void switchOn(){
        this.status=true;
    }
}
