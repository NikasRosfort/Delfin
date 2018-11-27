import java.util.*;
import java.io.*;

public class Employee {

   private String read;
   File file1 = new File("konkurrence_swimmer.txt");
   File file2 = new File("swimmer.txt");


   public void seMedlemmer() throws FileNotFoundException{
      ArrayList<String> medlemmer = new ArrayList<String>();
      Scanner s1 = new Scanner(file1);
      Scanner s2 = new Scanner(file2);
      while(s2.hasNextLine()){
         read = s2.nextLine();
         medlemmer.add(read);
      }
      while(s1.hasNextLine()){
         read = s1.nextLine();
         medlemmer.add(read);
      }
      for(int i = 0; i<medlemmer.size(); i++){
         System.out.println(medlemmer.get(i));
      }
      s1.close();
      s2.close();
   }

}