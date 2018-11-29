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
      
      //Den splitter linjerne op og tester om navnet passer
      //så splitter den den rigtig linje op igen 
      //så vælger du hvad du vil ændre og ændre det og så skriver den det ind i filen igen
      int f = 0;
      for(int q = 0; q<medList.length; q++){
         String firstSpllit[] = medList[q].split(",");
         f++;  
         if(firstSpllit[0].equals(name)){
            q = medList.length;  
         }
      }
      
      System.out.println(medList[(f-1)]);
      String secondSpllit[] = medList[(f-1)].split(",");
      
      System.out.println("Type 1 for name, type 2 for birthday, type 3 for mail, type 4 for phone, type 5 for activ passive");
      int nummer = s.nextInt();
      System.out.println("Type change");
      String gemmer = s.nextLine();
      gemmer = s.nextLine();
      secondSpllit[(nummer-1)] = gemmer;
      medList[(f-1)] = secondSpllit[0] + "," + secondSpllit[1] + "," + secondSpllit[2] + "," + secondSpllit[3] + "," + secondSpllit[4];
      
      PrintStream outPrint11 = new PrintStream(file2); 
      for(int l = 0; l<medList.length; l++){
         outPrint11.println(medList[l]);
      }
   
   }
   
 public void redigerKonku() throws FileNotFoundException{
      
      Scanner s1 = new Scanner(file1);
      System.out.println("Type the full name you want to edit");
      String name = s.nextLine();
      int i = 0;
      
      while(s1.hasNextLine()){
         i++;
         String placeholder = s1.nextLine();
      }
      String[] medList = new String[i];
      s1.close();
      
      Scanner ss1 = new Scanner(file1);
      
      for(int p = 0; p<medList.length; p++){
         medList[p] = ss1.nextLine();
      }
      ss1.close();
      
      //Den splitter linjerne op og tester om navnet passer
      //så splitter den den rigtig linje op igen 
      //så vælger du hvad du vil ændre og ændre det og så skriver den det ind i filen igen
      int f = 0;
      for(int q = 0; q<medList.length; q++){
         String firstSpllit[] = medList[q].split(",");
         f++;  
         if(firstSpllit[0].equals(name)){
            q = medList.length;  
         }
      }
      
      System.out.println(medList[(f-1)]);
      String secondSpllit[] = medList[(f-1)].split(",");
      
      System.out.println("Type 1 for name, type 2 for birthday, type 3 for mail, type 4 for phone");
      int nummer = s.nextInt();
      System.out.println("Type change");
      String gemmer = s.nextLine();
      gemmer = s.nextLine();
      secondSpllit[(nummer-1)] = gemmer;
      medList[(f-1)] = secondSpllit[0] + "," + secondSpllit[1] + "," + secondSpllit[2] + "," + secondSpllit[3];
      
      PrintStream outPrint11 = new PrintStream(file1); 
      for(int l = 0; l<medList.length; l++){
         outPrint11.println(medList[l]);
      }
   
   }

   

}