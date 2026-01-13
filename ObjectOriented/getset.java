package objectOriented;
public class objectsClasses{
    public static void main(String args[]){
        Pen p1=new Pen();
            p1.setColor("blue");
            p1.setTip(5);
            System.out.println(p1.getColor());
            
             System.out.println(p1.getTip());

        

    }
}

class Pen{
   private String color;
    private int tip;

    void setColor(String newColor){
        this.color=newColor;
    }

    String getColor(){
        return this.color;
    }

    void setTip(int newTip){
       this.tip=newTip;
    }
     int getTip(){
        return this.tip;
    }
}