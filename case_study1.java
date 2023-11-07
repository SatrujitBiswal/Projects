/**
 * case_study1
 */

import java.util.*;
 public class case_study1 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int count =0;
    int[]number= new int [5];
    System.out.println(" 'Test your luck and win 1 lakh rupees' \n ----You have 5 chances----");
    System.out.println("-:Enter the number between 1 to 1000:-");
    for(int i=0;i<number.length;i++){
        System.out.printf("enter your %d number:-\n",i+1);
        number[i]=sc.nextInt();
        count++;
        if(number[i]==678 || number[i]==47 || number[i]==890){
            System.out.println("-: CONGRADULATIONS :- \n you have won 1 lakh rupees");

            System.out.println("Enter your details for withdraw:--");
            System.out.println("Enter your name:--");
            String name =sc.next();
            System.out.println("Enter your bank name:--");
            String bname= sc.next();
            System.out.println("Enter the account number:--");
            long phone=sc.nextInt();
          
            System.out.println(" 'Money will be diposit within 3 days' \n **** THANK_YOU**** ");

            break;

        }
        else if(count==1)
        System.out.println("try again....!!!!! \t You have last 4 chances");

        else if(count==2)
        System.out.println("try again....!!!!! \t You have last 3 chances");


        else if(count==3)
        System.out.println("try again....!!!!! \t You have last 2 chances");

        else if(count==4)
        System.out.println("try again....!!!!! \t This is your last chance");

        else if(count==5){
          System.out.println("sorry...!!!");
        System.out.println("***** Better luck next time *****");
        }


    }

   
  }
    
}