import java.util.Scanner;
public class Momo{

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int min_bal=2000;
       int deposit=0;
       int withdraw=0;
       int new_balance=min_bal +deposit;
       while (true){
        System.out.println("MTN MOBILE MONEY\n1.Deposit Money\n2.Check Balance\n3.Withdraw Money\n0.Exit");
        
        System.out.println("reply: ");
        int reply=input.nextInt();

        if (reply==1){
             System.out.println("enter the amount to deposit: ");
             deposit=input.nextInt();

             if (deposit>=1000) {
                 new_balance+=deposit;
                 System.out.println("You have deposited UgShs "+deposit);
             }else{
                 System.out.println("You have to deposit an amount greater than or equal to 1000");
             }

        }else if (reply==2){
            System.out.println("Your account balance is " + new_balance);
        }
        else if(reply==3){
            System.out.println("enter amount to withdraw: ");
            withdraw=input.nextInt();
            
            if (withdraw<new_balance && withdraw>=1000) {
                new_balance-=withdraw;
                System.out.println("you have withdrawn UgShs" + withdraw);
                
            }else{
                System.out.println("you have to withdraw 1000 or an amount not equal to your min balance");
            }
            
        }
        else if (reply==0){
            System.out.println("Thank You,Good Bye ");
            break;
        }
        else{
            System.out.println("Unknown Option");
        }
    }
    }
}