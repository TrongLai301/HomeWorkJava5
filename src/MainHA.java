import java.util.Scanner;

public class MainHA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Human adam= new Human("Adam", true,40);
        Human eva= new Human("Eva",false,30);
        Apple apple=new Apple();
        adam.say("Hello eva, gọi em là eva vì Em và Anh là một đôi, vậy nên ăn táo với anh không!!?");
        eva.say("Ahihi, ví anh như culi, vì mỗi khi em muốn đi ăn là một cây táo của nhà hàng xóm lại đổ, dạ ăn!!!");
        while(apple.getWeight()>0){
            adam.eat(apple);
            eva.eat(apple);
        }
    }
}
