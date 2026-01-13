package ObjectOriented;

public class typeConstructors{
    public static void main(String args[]){
        student s1=new student();
        System.out.println(s1.name);

         student s3=new student("Balerao Kamaldas");
        System.out.println(s3.name);

        student s2=new student(5);
        System.out.println(s2.rollNo);
    }
}

class student{
    int rollNo;
    String name;

    student(){
        System.out.println("not called");
    }

    student(String newname){
        this.name=newname;
    }
     student(int rollNo){
        this.rollNo=rollNo;
    }
}