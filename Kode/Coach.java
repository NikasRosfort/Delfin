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
         
         System.out.println("Type the new time\t example: sek.mlsek  - 12.20");
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
   
   public void topFem() throws FileNotFoundException{
      
      
      System.out.println("Type the disiplin and lenth you want to see top 5\t\texample: bryst 200m");
      String top5 = s.nextLine();  
   /*
      Scanner ss3 = new Scanner(file3);
      ArrayList<String> fix = new ArrayList<String>();
      while(ss3.hasNextLine()){
         String fuck = ss3.nextLine();
         fix.add(fuck);
      }
   */
        
   
   
   
      Scanner s3 = new Scanner(file3);
      ArrayList<String> list = new ArrayList<String>();
      
      
      
      while(s3.hasNextLine()){
         String name = s3.nextLine();
         while(s3.hasNextLine()){
            String wait = s3.nextLine();
            String firstSplit[] = wait.split(",");
            if(firstSplit[0].equals(top5)){
               list.add(name);
               list.add(wait);
            }
            if(wait.equals(":")){
               break; 
            } 
         }
      }
      
      String midAr[] = new String[list.size()];
      
      for(int p = 0; p<midAr.length; p++){
         midAr[p] = list.get(p);
      }
         
      String[] lort = new String[midAr.length];
      String[] lort2 = new String[9999];
      ArrayList<Integer> fisk = new ArrayList<Integer>();
         
         //
         /*
         
      for(int l = 1; l<midAr.length; l = l + 2){
         lort = midAr[l].split(",");
         String peter = lort[1];
         lort2 = peter.split(":");
         fisk.add(Integer.parseInt(lort2[0]));
         fisk.add(Integer.parseInt(lort2[1]));
         fisk.add(Integer.parseInt(lort2[2]));
      }
         
      int m19 = 999999;
      int m18 = 999999;
      int m17 = 999999;
      
      int m29 = 99999;
      int m28 = 999999;
      int m27 = 999999;
      
      int m39 = 99999;
      int m38 = 999999;
      int m37 = 999999;
      
      int m49 = 99999;
      int m48 = 999999;
      int m47 = 999999;
      
      int m59 = 999999;
      int m58 = 999999;
      int m57 = 999999;
         
      for(int w = 0; w<fisk.size(); w=w+3){
         int test1 = fisk.get(w);
         int test2 = fisk.get((w+1));
         int test3 = fisk.get((w+2));
         if(test1<m19){
            m59 = m49;
            m49 = m39;
            m39 = m29;
            m29 = m19;
            m19 = test1;
            
            m58 = m48;
            m48 = m38;
            m38 = m28;
            m28 = m18;
            m18 = test2;
            
            m57 = m47;
            m47 = m37;
            m37 = m27;
            m27 = m17;
            m17 = test3;
            
         }
      }
      System.out.println(m19 + "¤" + m18 + "¤" + m17);
      System.out.println(m29 + "¤" + m28 + "¤" + m27);
      System.out.println(m39 + "¤" + m38 + "¤" + m37);
      System.out.println(m49 + "¤" + m48 + "¤" + m47);
      System.out.println(m59 + "¤" + m58 + "¤" + m57);
         */
         /*
         for(int w = 0; w<fisk.size(); w=w+3){
         System.out.println(fisk.get(w)+"#"+fisk.get((w+1))+"#"+fisk.get((w+2)));
         }
         */
         
      
      
      
      
      
      for(int y = 0; y<list.size();y++){
         System.out.println(list.get(y));
      }
      
   }



}