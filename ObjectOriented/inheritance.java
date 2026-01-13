package ObjectOriented;

public class inheritance{
    public static void main(String args[]){
        Fish shark=new Fish();
        shark.eat();
    }
}

class animal{
    String color;

    void eat(){
       System.out.println("eat");
    }

    void breathe(){
System.out.println("breathe");
    }
}

class Fish extends animal{
    int fins;

    void swim(){
        System.out.println("swim");
    }
}