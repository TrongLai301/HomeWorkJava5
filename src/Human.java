public class Human {
    private String name;
    private boolean gender;
    private int weight;
    public Human(String name, boolean gender, int weight){
        this.name=name;
        this.gender=gender;
        this.weight=weight;
    }
    public boolean isGender(){
        return gender;
    }
    public void isMale(){
        this.gender= true;
    }
    public void isFamale(){
        this.gender=false;
    }
    public void setGender(boolean gender){
        if(isGender()){
            System.out.println("Male");
        }else{
            System.out.println("Famale");
        }
    }
    public boolean checkApple(Apple apple){
        if(apple.getWeight()>0){
            return true;
        }else{
            return false;
        }
    }
    public void eat(Apple apple){
        if(apple.getWeight()>0){
            apple.decrease();
            weight++;
            System.out.println(getName()+" đã ăn một miếng táo");
        }else{
            System.out.println("Đã hết táo");
        }
    }
    public void say(String said){
        System.out.println(getName()+": "+said);
    }
    public String getName(){
        return name;
    }
    public int getWeight(){
        return weight;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
}
