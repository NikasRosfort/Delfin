import java.util.*;
import java.io.*;

public class Coach extends Employee{

   File file3 = new File("swimmer_times.txt");
   Scanner s = new Scanner(System.in);

   public void seKonkResult() throws FileNotFoundException{
      Scanner s3 = new Scanner(file3);
      
      ArrayList<String> line = new ArrayList<String>();
      while(s3.hasNextLine()){
         String l = s3.nextLine();
         if(l.equals(":")){
            line.add("");
         }
         else{
            line.add(l);
         }
      }
      
      for(int i = 0; i<line.size();i++){
         System.out.println(line.get(i));
      }     
      s3.close();   
   }

   public void editKonkResult() throws FileNotFoundException{
   
      Scanner s3 = new Scanner(file3);
      System.out.println("Type the full name you want to edit");
      String name = s.nextLine();
      
      
      ArrayList<String> person = new ArrayList<String>();
      
      while(s3.hasNextLine()){
         String linje = s3.nextLine();
         if(linje.equals(name)){
            while(s3.hasNextLine()){
               String linje2 = s3.nextLine();
               if(linje2.equals(":")){
                  break;
               }
               else{
                  person.add(linje2);
               }
            }
            
         }
      }
      
      for(int h = 0; h<person.size();h++){ 
         System.out.println(person.get(h));
      }
      
      System.out.println("\nType 1 for opdate training time or type 2 for add new training time or competition");
      int k = s.nextInt();
      if(k == 1){
         System.out.println("Type the disiplin and length you want to edit");
         String dal = s.nextLine();
         dal = s.nextLine();
         String[] edi = new String[person.size()];
         for(int m = 0; m<person.size(); m++){
            edi[m] = person.get(m);
         }
         int f = 1;
         for(int q = 0; q<edi.length; q++){
            String firstSpllit[] = edi[q].split(","); 
            if(firstSpllit[0].equals(dal)){
               break;  
            }
            else{
               f++;
            }
         }
         String secondSpllit[] = edi[(f-1)].split(",");
         
         System.out.println("Type the new time\tmin:sek:mlsek");
         String midl = s.nextLine();
         secondSpllit[1] = midl;
         person.set((f-1), secondSpllit[0] + "," + secondSpllit[1]); 
         
      }
      else if(k ==2){
         System.out.println("Type 1 for new traning time and 2 for competition time");
         int l = s.nextInt();
         if(l == 1){ 
            System.out.println("Type the disiplin and length");
            String dp = s.nextLine();
            dp = s.nextLine();
            System.out.println("Type the time\tmin:sek:mlsek");
            String time = s.nextLine();
            person.add(0, dp + "," + time);
         }
         else if(l == 2){
            System.out.println("Type the comepetision");
            String loc = s.nextLine();
            loc = s.nextLine();
            System.out.println("Type the disiplin and length");
            String dp = s.nextLine();
            System.out.println("Type the time\tmin:sek:mlsek");
            String time = s.nextLine();
            System.out.println("Type the number of the swimmers placement");
            String place = s.nextLine();
            person.add(person.size(), loc + "," + dp + "," + time + "," + place + ". plads,");
            
         }
      }
      
      s3.close();
      ////
      Scanner ss3 = new Scanner(file3);
      ArrayList<String> slut = new ArrayList<String>();
      
      int gg = 0;
      int ggg = 0;
      int gggg = 0;
      while(ss3.hasNextLine()){
         String linje3 = ss3.nextLine();
         if(gggg == 0){
            gg++;
         }
         if(linje3.equals(name)){
            ggg = 1;
            gggg = 1;
         }
         else if(linje3.equals(":")){
            slut.add(":");
            ggg = 0;
         }
         else if(ggg == 0){
            slut.add(linje3);
         }
      }
      gg--;
      slut.add(gg, name);
      gg++;
      for(int o = 0; o<person.size();o++){
         slut.add((gg+o), person.get(o)); 
      }
      
      PrintStream outPrint = new PrintStream(file3);
      for(int u = 0; u<slut.size(); u++){
         outPrint.println(slut.get(u));
      }
   }
   




}