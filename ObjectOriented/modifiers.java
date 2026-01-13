package objectOriented;

public class modifiers{
    public static void main(String args[]){
        BankAccount BA=new BankAccount();

        BA.setName("Kamaldas");
        BA.setPassword("dfsfsdfdsgdsfs");
          
          System.out.println(BA.name);
      
    }
}

class BankAccount{
   public String name;
    private String password;

    void setName(String newName){
        name=newName;
    }

   public void setPassword(String newPassword){

        password=newPassword;
    }


}