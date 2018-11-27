import java.util.*;
import java.io.*;

public class Formand extends Employee{

   File file1 = new File("konkurrence_swimmer.txt");
   File file2 = new File("swimmer.txt");
   File file3 = new File("swimmer_times.txt");

   Scanner s = new Scanner(System.in);
   String APP;
   String PNN;

   public void opretMedlem() throws FileNotFoundException{
      System.out.println("Type: full name");
      String name = s.nextLine();
      System.out.println("Type: Date of birth (DD/MM/YYYY)");
      String birth = s.nextLine();
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
      System.out.println("Youth swimmers (under 18 years): 1000,- yearly, senior swimmers (18 and over): 1600,- yearly.");
      System.out.println("Members over 60 get a 25% discount.");
      System.out.println("Passive members pay 500,- yearly.");
   
      PrintStream outPrint2 = new PrintStream(new FileOutputStream(file2, true));   
      outPrint2.println(name + "," + birth + "," + mail + "," + phone + "," + APP);
   }
   
   
   public void opretKonkSwim() throws FileNotFoundException{
      System.out.println("Type: full name");
      String name = s.nextLine();
      System.out.println("Type: Date of birth (DD/MM/YYYY)");
      String birth = s.nextLine();
      System.out.println("Type: mail");
      String mail = s.nextLine();
      System.out.println("Type: phone number");
      int phone = s.nextInt();
   
      System.out.println("Rember to give new member payment information and price");
      System.out.println("Youth swimmers (under 18 years): 1000,- yearly, senior swimmers (18 and over): 1600,- yearly.");
      System.out.println("Members over 60 get a 25% discount.");
   
      PrintStream outPrint1 = new PrintStream(new FileOutputStream(file1, true));   
      outPrint1.println(name + "," + birth + "," + mail + "," + phone);
      
      PrintStream outPrint3 = new PrintStream(new FileOutputStream(file3, true));   
      outPrint3.println(name);
      //outPrint3.println("00:00:00-DD/MM/YYYY,00:00:00-DD/MM/YYYY,00:00:00-DD/MM/YYYY,00:00:00-DD/MM/YYYY,00:00:00-DD/MM/YYYY,00:00:00-DD/MM/YYYY,00:00:00-DD/MM/YYYY,00:00:00-DD/MM/YYYY,00:00:00-DD/MM/YYYY");
   }
   
   public void redigerMedlem() throws FileNotFoundException{
      Scanner s2 = new Scanner(file2);
      System.out.println("Type the full name you want to edit");
      String name = s.nextLine();
      int i = 0;
      
      while(s2.hasNextLine()){
         i++;
         String placeholder = s2.nextLine();
      }
      String[] medList = new String[i];
      s2.close();
      
      Scanner ss2 = new Scanner(file2);
      
      for(int p = 0; p<medList.length; p++){
         medList[p] = ss2.nextLine();
      }
      ss2.close();
      
      
      /*
      for(int h = 0; h<medList.length; h++){
      String[] medList22 = medList[h].split(",");
      if(medList22[1].equals(name)){
         h = medList.length;
         System.out.println(h);
      }
      }
      
      String test222 = ss2.nextLine();
      System.out.println(test222);
      */
   
   }
   
   
   

}