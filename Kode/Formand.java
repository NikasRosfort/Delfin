import java.util.*;
import java.io.*;

public class Formand extends Employee{

   Scanner s = new Scanner(System.in);
   String APP;
   String PNN

   public void opretMedlem(){
      System.out.println("Type: full name");
      String name = s.nextLine();
      System.out.println("Type: Date of birth");
      
      System.out.println("Type: mail");
      String mail = s.nextLine();
      System.out.println("Type: phone number");
      int phone = s.nextInt();
      System.out.println("Type: \"1\" for activ or \"2\" for passive membership");
      int AP = s.nextInt();
      if(AP == 1){
         APP = "activ";
      }
      else if(AP == 2){
         APP = "passive";
      }
      System.out.println("Rember to give new member payment information and price");
      
      
   
   
   }
   
   
   
   
   
   
   
   

}