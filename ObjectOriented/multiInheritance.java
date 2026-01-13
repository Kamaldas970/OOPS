package ObjectOriented;
public class multiInheritance{
    public static void main(String args[]){
        Animals l=new Animals();
        
        l.eat();


    }
}

class Animals{
    String Color;

    void eat(){
        System.out.println("eat");
    }
}

class Human extends Animals{
    String brain;
    
    void intelligence(){
        System.out.println("intelligence");
    }
}

class Monkey extends Animals{
    String legs;
    
    void walk(){
        System.out.println("walk");
    }
}
