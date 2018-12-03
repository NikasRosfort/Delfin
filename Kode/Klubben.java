import java.io.*;
import java.util.*;
public class Klubben {
   public static void main(String[] args) throws FileNotFoundException{
   
      int loop = 0;
      
   
      Scanner s = new Scanner(System.in);
      while(loop == 0){
         System.out.println("Type your password or type \"exit\" to close");
         String password = s.next();
         
         int loopf = 0;
         int loopk = 0;
         int loopc = 0;
         
         if(password.equals("exit")){
            loop = 1;
         }
      
         else if(password.equals("master")){
            while(loopf == 0){
               Formand formand = new Formand();
            
               System.out.println("Type 1 to see all memberships, type 2 for members, type 3 for competition swimmers or type 0 to log out");
               int pick = s.nextInt();
               if(pick == 0){
                  loopf = 1;
               }
               else if(pick == 1){
                  formand.seMedlemmer();
               }
               else if(pick == 2){
                  System.out.println("Type 1 for creat new membership, type 2 to edit member, type 3 to delete member or type 0 to log out");
                  int NED = s.nextInt();
                  if(NED == 0){
                     loopf = 1;
                  }
                  if(NED == 1){
                     formand.opretMedlem();
                  }
                  else if(NED == 2){
                     formand.redigerMedlem();
                  }
                  else if(NED == 3){
                     formand.sletMedlem();
                  }
               }
               else if(pick == 3){
                  System.out.println("Type 1 for creat new competition swimmer, type 2 to edit competition swimmer, type 3 to delete competition swimmer or type 0 to log out");
                  int NED1 = s.nextInt();
                  if(NED1 == 0){
                     loopf = 1;
                  }
                  else if(NED1 == 1){
                     formand.opretKonkSwim();
                  }
                  else if(NED1 == 2){
                     formand.redigerKonkSwim();
                  }
                  else if(NED1 == 3){
                     formand.sletKonkSwim();
                  }
               
               }
            }
         }
         else if(password.equals("cash")){
            Kasserer kas = new Kasserer();
            
            while(loopk == 0){
               System.out.println("Type 1 to see all memberships, type 2 for members, type 3 for competition swimmers, type 4 see payment prices or type 0 to log out");
               int pick1 = s.nextInt();
               if(pick1 == 0){
                  loopk = 1;
               }
               else if(pick1 == 1){
                  kas.seMedlemmer();
               }
               else if(pick1 == 2){
                  System.out.println("Type 1 to see lak of payment or type 2 edit payment or type 0 to log out");
                  int LE = s.nextInt();
                  if(LE == 0){
                     loopk = 1;
                  }
                  else if(LE == 1){
                     kas.seRestanceMedlem();
                  }
                  else if(LE == 2){
                     kas.retRestanceMedlem();
                  }
               }
               else if(pick1 == 3){
                  System.out.println("Type 1 to see lak of payment or type 2 edit payment or type 0 to log out");
                  int LE = s.nextInt();
                  if(LE == 0){
                     loopk = 1;
                  }
                  else if(LE == 1){
                     kas.seRestanceKonkSwim();
                  }
                  else if(LE == 2){
                     kas.retRestanceKonkSwim();
                  }
               }
               else if(pick1 == 4){
                  kas.seKontingent();
               }
            }
         
         }
         else if(password.equals("worker")){
            Coach coa = new Coach();
            
            while(loopc == 0){
            System.out.println("Type 1 to see all memberships, type 2 too see all results, type 3 for training and competition times, type 4 see top 5 swimmers or type 0 to log out");
            int pick2 = s.nextInt();
            if(pick2 == 0){
               loopc = 1;
            }
            else if(pick2 == 1){
               coa.seMedlemmer();
            }
            else if(pick2 == 2){
               coa.seKonkResult();
            }
            else if(pick2 == 3){
               coa.editKonkResult();
            }
            else if(pick2 == 4){}
               coa.topFem();
            }
         }
      
      }
   
   }



}