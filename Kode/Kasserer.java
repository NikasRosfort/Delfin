import java.util.*;
import java.io.*;

public class Kasserer extends Employee{

   Scanner s = new Scanner(System.in);
   File file1 = new File("konkurrence_swimmer.txt");
   File file2 = new File("swimmer.txt");
   File file4 = new File("kontigent.txt");
   File file5 = new File("kontigentKonk.txt");

   public void seRestanceMedlem() throws FileNotFoundException{
   
      Scanner s4 = new Scanner(file4);
      ArrayList<Integer> res = new ArrayList<Integer>();   
      
      Scanner s2 = new Scanner(file2);
      ArrayList<String> info = new ArrayList<String>();
      
      while(s2.hasNextLine()){
         String infoo = s2.nextLine();
         info.add(infoo);
      }
      
      while(s4.hasNextInt()){
         int tal = s4.nextInt();
         res.add(tal);
      }
      
      for(int i = 0; i<res.size();i++){
         if(res.get(i) != 0){
            System.out.println(info.get(i) + "\t\tRestance: " + res.get(i));
         }
      }
            
   }

   public void seRestanceKonkSwim() throws FileNotFoundException{
   
      Scanner s5 = new Scanner(file5);
      ArrayList<Integer> res = new ArrayList<Integer>();   
      
      Scanner s1 = new Scanner(file1);
      ArrayList<String> info = new ArrayList<String>();
      
      while(s1.hasNextLine()){
         String infoo = s1.nextLine();
         info.add(infoo);
      }
      
      while(s5.hasNextInt()){
         int tal = s5.nextInt();
         res.add(tal);
      }
      
      for(int i = 0; i<res.size();i++){
         if(res.get(i) != 0){
            System.out.println(info.get(i) + "\t\tRestance: " + res.get(i));
         }
      }   
   }


   public void retRestanceMedlem() throws FileNotFoundException{
   
      Scanner s2 = new Scanner(file2);
      System.out.println("Type the full name you want to change arrears");
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
      
      int f = 1;
      for(int q = 0; q<medList.length; q++){
         String firstSpllit[] = medList[q].split(","); 
         if(firstSpllit[0].equals(name)){
            break;  
         }
         else{
            f++;
         }
      }
   
      Scanner s4 = new Scanner(file4);
      ArrayList<Integer> res = new ArrayList<Integer>();   
      
      while(s4.hasNextInt()){
         int tal = s4.nextInt();
         res.add(tal);
      }
   
      System.out.println("Type the amount you want to change it to");
      int change = s.nextInt();
      res.set((f-1), change);
   
      System.out.println("The change is updatede");
   
      PrintStream outPrint = new PrintStream(file4); 
      for(int l = 0; l<res.size(); l++){
         outPrint.println(res.get(l));
      }   
   
   
   }


   public void retRestanceKonkSwim() throws FileNotFoundException{
   
      Scanner s1 = new Scanner(file1);
      System.out.println("Type the full name you want to change arrears");
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
      
      int f = 1;
      for(int q = 0; q<medList.length; q++){
         String firstSpllit[] = medList[q].split(","); 
         if(firstSpllit[0].equals(name)){
            break;  
         }
         else{
            f++;
         }
      }
   
      Scanner s5 = new Scanner(file5);
      ArrayList<Integer> res = new ArrayList<Integer>();   
      
      while(s5.hasNextInt()){
         int tal = s5.nextInt();
         res.add(tal);
      }
   
      System.out.println("Type the amount you want to change it to");
      int change = s.nextInt();
      res.set((f-1), change);
   
       System.out.println("The change is updatede");
   
      PrintStream outPrint = new PrintStream(file5); 
      for(int l = 0; l<res.size(); l++){
         outPrint.println(res.get(l));
      }   
   
   
   }

   public void seKontingent() {
      System.out.println("Youth swimmers (under 18 years): 1000,- yearly, senior swimmers (18 and over): 1600,- yearly.");
      System.out.println("Members over 60 get a 25% discount.");
      System.out.println("Passive membership is 500,- yearly");

   }






}