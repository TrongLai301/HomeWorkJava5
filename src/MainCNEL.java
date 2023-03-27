import java.util.Scanner;

public class MainCNEL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SwitchButton sB= new SwitchButton();
        ElectricLamp eL=new ElectricLamp();
        int i,k=-1;
        System.out.println("1. Bật đèn pin");
        System.out.println("2. Tắt đèn pin");
        i= sc.nextInt();
        do{

            switch (i){
                case 1:
                    sB.switchOn();
                    sB.connectToLamp(eL);
                    System.out.println("2. Tắt đèn pin");
                    i= sc.nextInt();
                    if(i==1){
                        System.out.println("Đèn pin vẫn đang bật");
                    }
                    break;
                case 2:
                    sB.switchOff();
                    sB.connectToLamp(eL);
                    System.out.println("1. Bật đèn pin");
                    i= sc.nextInt();
                    if(i==2){
                        System.out.println("Đèn pin vẫn đang tắt");
                    }
                    break;
            }
        }
        while(k<0);
    }
}
