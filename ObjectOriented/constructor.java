package ObjectOriented;
public class constructor{
    public static void main(String args[]){
        Student s1=new Student("Balerao Kamaldas",  5);
       System.out.println(s1.name +" "+ s1.rollNo);
    }
}

class Student{
    String name;
    int rollNo;

    Student(String newname, int newrollno){
        this.name=newname;
        this.rollNo=newrollno;
       
    }
}