import java.util.Scanner;
public class MoTaDenPin {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         Battery battery1=new Battery(3);
         FlashLamp flashLamp=new FlashLamp();
         flashLamp.setBattery(battery1);
         int i;
         do{
             System.out.println("1.Bật đèn pin");
             System.out.println("2.Tắt đèn pin");
             i=sc.nextInt();
             switch (i){
                 case 1:
                     flashLamp.turnOn();
                     flashLamp.light();
                     break;
                 case 2:
                     flashLamp.turnOff();
                     flashLamp.light();
                     break;
             }
         }while(battery1.energy>0);
    }
}

class FlashLamp {
    public boolean isOn;
    public Battery battery;

    public FlashLamp() {

    }

    public void setBattery(Battery battery) {
        this.battery = battery;
        isOn=true;
    }

    public int getBatteryInfo() {
        return battery.energy;
    }

    public boolean isOn() {
        return isOn;
    }
    public void turnOn() {
        this.isOn = true;
    }
    public void turnOff() {
        this.isOn = false;
    }

    public void light() {
        if (this.isOn) {
            System.out.println("Đèn pin đang bật");
            battery.decreaseEnergy();
        } else  {
            System.out.println("Đèn pin đang tắt");
        }
    }
}

class Battery {
    public int energy;

    public Battery(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void decreaseEnergy() {
        energy--;
    }
}