class Animal{
    String color;
    int abc;
    String abc1;
   
    Animal(String color ,String abc){
        this.color=color;
        this.abc1 = abc1;
    }
    Animal(int abc){
        this.abc=abc;
    }
    Animal(String abc1){
        this.abc1=abc1;
    }
    public void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    String sound;
    Dog(String color, String sound){
        super(color);
        this.sound=sound;
    }
}

public class Upcastig {
    public static void main(String[] args) {
        Animal a1=new Dog("white","bark");
        System.out.println(a1.abc1);

    }
    
}


