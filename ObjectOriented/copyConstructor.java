package ObjectOriented;

public class copyConstructor{
    public static void main(String args[]){
        student s1=new student();
        s1.name="kamaldas";
        s1.rollNo=5;
        System.out.println(s1.name+ s1.rollNO);

    }
}

class student{
    int rollNo;
    String name;
    int marks[];

    student(){
        this.name=name;
        this.rollNo=rollNO;
    }
   
    student( student s2){
        marks=new int[3];
    }
}