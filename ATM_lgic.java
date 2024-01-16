import java.util.*;


public class ATM_lgic extends Thread {
    
   
    public static void logic(int exp){

        int pass =6785;
        Scanner sc =new Scanner(System.in);

        switch (exp) {
            case 1:
            System.out.println("thank you for choose English \t");
            System.out.println("Do you want Bill ? \n 1.Yes \n 2.No ");
            String st = sc.nextLine();
            System.out.println("Enter your pin number");
            int pin = sc.nextInt();
            if(pin == pass){
            System.out.println("Please enter your amount");
                int amount = sc.nextInt();
                if(amount>10000){
                    System.out.println("Withdraw amount exceeded");

                }
                else{
                    System.out.println("wait for transaction to complete");
                    try {
                        Thread.sleep(5000);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                       
                        System.out.println("Transactions is successful");
                        System.out.println("\n \n \n");
                    
                }
                System.out.println("take your card");
            }
            else{
                System.out.println("Invalid pin number");
            }
                System.out.println("------- visit again -------" );
                break;
              case 2:
            System.out.println("thank you for choose Hindi \t");
               System.out.println("Kya aap ko BILL chahiye ? \n 1.Hna \n 2.Na ");
            String st1 = sc.nextLine();
           System.out.println("Apni PIN likhiye");
           int pin2=sc.nextInt();
           if(pin2==pass){
              System.out.println("Apna nikaase rashi likhiye");
                int amount1 = sc.nextInt();
                if(amount1>10000){
                    System.out.println("Nikaase rashi seema se bahar hai");

                }
                else{
                    System.out.println("lenden rashi milne tak thoda sabar ki jiye");
                       try {
                        Thread.sleep(5000);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                    
                        System.out.println("Transactions is successful");
                        System.out.println("\n \n \n");
                    
                }

                System.out.println("apna card li jiye");
           }
           else
            System.out.println("Galat PIN number");
                System.out.println("------- visit again -------" );
                break;

                   case 3:
            System.out.println("thank you for choose Odia ");
               System.out.println("Apana Rasid chahanti ki ? \n 1.Hna \n 2.Na ");
            String st3 = sc.nextLine();
         System.out.println("Apananka PIN lekhantu");
         int pin3 = sc.nextInt();
         if(pin3==pass){
               System.out.println("Uthana rashi lekhantu");
                int amount2 = sc.nextInt();
                if(amount2>10000){
                    System.out.println("Nirdharita rashi sima bahare");

                }
                else{
                    System.out.println("tanka miliba jae apekhya karantu");
                       try {
                        Thread.sleep(5000);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                           
                        System.out.println("Transactions is successful");
                        System.out.println("\n \n \n");
                    
                }
                System.out.println("Apananka card rakhantu");
         }
         else
          System.out.println("Dharjya PIN bhul ate");
                System.out.println("------- visit again -------" );
                break;
            default:
            System.out.println("Transaction Timeout");
                break;


        }
    }
    public static void main(String[] args) {
        Date date = new Date();
         System.out.println(date);
        Calendar c = Calendar.getInstance();
         int min =   c.get(Calender.MINUTE);
      //long startTime= System.nanoTime();
        Scanner sc1= new Scanner(System.in);
        System.out.println("Welcome To state bank of India");
        System.out.println("Select:- \n 1.English \n 2.hindi \n 3.Odia");
         

        int ch = sc1.nextInt();
            logic(ch);
        
    }
}
