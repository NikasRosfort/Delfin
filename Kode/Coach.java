import java.util.*;
import java.io.*;

public class Coach extends Employee{

   File file3 = new File("swimmer_times.txt");
   Scanner s = new Scanner(System.in);

   //scanner filen swimmer_times.txt og ligger hver linje ind i en arraylisten MEN hvis linjen er ":" sætter den en tom linje ind istedet
   //og printer så arraylisten ud
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

   //giver mulighed for at ændre noget i filen swimmer_times.txt
   public void editKonkResult() throws FileNotFoundException{
   
      //her skal du skrive det navn du skal ændre i
      Scanner s3 = new Scanner(file3);
      System.out.println("Type the full name you want to edit");
      String name = s.nextLine();
      
      
      ArrayList<String> person = new ArrayList<String>();
      //hvis den møder navnet begynder den at lægge linjerne ind i arraylisten inttil den igen møder en linje med ":"
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
      
      //printer den persons information ud
      for(int h = 0; h<person.size();h++){ 
         System.out.println(person.get(h));
      }
      
      //her skal du vælge om du vil opdatere et træningsresultat eller putte en ny træningstid ind
      //hvis du vælger opdater skal du skrive den diciplin og tid også kan du ændre linjen
      //hvis du vælger ny træningstid skal du skrive diciplinen og længen og tid også kommer det ind i filen under navnet
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
         
         System.out.println("Type the new time\t example: sek.mlsek  - 12.20");
         String midl = s.nextLine();
         secondSpllit[1] = midl;
         person.set((f-1), secondSpllit[0] + "," + secondSpllit[1]); 
         
      }
      //hvis du vælger ny træningstid kommer det som ny linje i toppen af filen
      //hvis du vælger ny konkurence tid kommer det som en ny linje i buden af personen
      else if(k ==2){
         System.out.println("Type 1 for new traning time and 2 for competition time");
         int l = s.nextInt();
         if(l == 1){ 
            System.out.println("Type the disiplin and length");
            String dp = s.nextLine();
            dp = s.nextLine();
            System.out.println("Type the time\t example: sek.mlsek  - 12.20");
            String time = s.nextLine();
            person.add(0, dp + "," + time);
         }
         else if(l == 2){
            System.out.println("Type the comepetision");
            String loc = s.nextLine();
            loc = s.nextLine();
            System.out.println("Type the disiplin and length");
            String dp = s.nextLine();
            System.out.println("Type the time\t example: sek.mlsek  - 12.20");
            String time = s.nextLine();
            System.out.println("Type the number of the swimmers placement");
            String place = s.nextLine();
            person.add(person.size(), loc + "," + dp + "," + time + "," + place + ". plads,");
            
         }
      }
      
      s3.close();
      
      //printer til fillen
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
   
   //metode som viser de 5 med den lavets tid indefor den diciplin og længde du skriver
   public void topFem() throws FileNotFoundException{
      
      //vælger dicipin
      System.out.println("Type the disiplin and lenth you want to see top 5\t\texample: bryst 200m");
      String top5 = s.nextLine(); 
   
      //laver et arrayliste med navn tid og konkurance
      Scanner s3 = new Scanner(file3);
      ArrayList<String> list = new ArrayList<String>();
      
      while(s3.hasNextLine()){
         String name = s3.nextLine();
         while(s3.hasNextLine()){
            String wait = s3.nextLine();
            String firstSplit[] = wait.split(",");
            if(firstSplit[0].equals(top5)){
               list.add(name + "," + wait);
            }
            if(wait.equals(":")){
               break; 
            } 
         }
      }
      
      //laver et nyt Array som kan splittes
      String midAr[] = new String[list.size()];
      
      for(int p = 0; p<midAr.length; p++){
         midAr[p] = list.get(p);
      }
      
      //splitter arrayet og gemmer navn og tid i hvert sin arrayListe         
      String[] swimmerName = new String[midAr.length];
      ArrayList<Double> sTime = new ArrayList<Double>();
      ArrayList<String> timeName = new ArrayList<String>();
      for(int a = 0; a<midAr.length; a++){
         swimmerName = midAr[a].split(",");
         sTime.add(Double.parseDouble(swimmerName[2]));
         timeName.add(swimmerName[0]);
      }
      
      //gemmer tiderne i variabler
      double m1 = 999999999;
      double m2 = 999999999;
      double m3 = 999999999;
      double m4 = 999999999;
      double m5 = 999999999;
      String n1 = "Not enough swimmers";
      String n2 = "Not enough swimmers";
      String n3 = "Not enough swimmers";
      String n4 = "Not enough swimmers";
      String n5 = "Not enough swimmers";
      
      //tester hvem der har den beste tid og sætter dem om i en top 5
      for(int x  = 0; x<sTime.size();x++){
         if(sTime.get(x)<m1){
            m5 = m4;
            m4 = m3;
            m3 = m2;
            m2 = m1;
            m1 = sTime.get(x);
            
            n5 = n4;
            n4 = n3;
            n3 = n2;
            n2 = n1;
            n1 = timeName.get(x) + " with the time: " + sTime.get(x) + "sek";
         }
         else if(sTime.get(x)<m2){
            m5 = m4;
            m4 = m3;
            m3 = m2;
            m2 = sTime.get(x);
            
            n5 = n4;
            n4 = n3;
            n3 = n2;
            n2 = timeName.get(x) + " with the time: " + sTime.get(x) + "sek";
         }
         else if(sTime.get(x)<m3){
            m5 = m4;
            m4 = m3;
            m3 = sTime.get(x);
            
            n5 = n4;
            n4 = n3;
            n3 = timeName.get(x) + " with the time: " + sTime.get(x) + "sek";
         }
         else if(sTime.get(x)<m4){
            m5 = m4;
            m4 = sTime.get(x);
            
            n5 = n4;
            n4 = timeName.get(x) + " with the time: " + sTime.get(x) + "sek";
         }
         else if(sTime.get(x)<m5){
            m5 = sTime.get(x);
            
            n5 = timeName.get(x) + " with the time: " + sTime.get(x) + "sek";
         }   
         
      }
      
      //printer top 5 ud  
      System.out.println("1. " + n1);
      System.out.println("2. " + n2);
      System.out.println("3. " + n3);
      System.out.println("4. " + n4);
      System.out.println("5. " + n5);
      
   }

}