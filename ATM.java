import java.util.*;

public class ATM{

    /*  1) Needs to keep track of the amount of money that it has!
        2) Needs to accept deposits
        3) Needs to deduct withdraws from reserve
        4) Needs a PIN
        5)
    */

    double reserve = 0;
    double bank_account = 500;
    int pin = 1234;

    public ATM(){
        super();
    }
    public ATM(double startAmount){
        //Set up the reserves and create a scanner to take in user input
        reserve = startAmount;
        Scanner user = new Scanner(System.in);
        System.out.println("Please Enter Your PIN Below");

        //While the user enters the wrong pin, deny login and try again.
        while(!login(((user.nextInt())))){
            System.out.println("These credentials are not correct, please try agian");
        }
        System.out.println("Successful Login");
        System.out.println();
        
        
        
    }

    public boolean login(int pin){
        if(pin == this.pin){
            return true;
        } else {
            return false;
        }
    }
    public double withdraw(double request){
        if(reserve>request && bank_account>request){
            bank_account -= request;
            reserve -= request;
        } else {
            return 0;
        }
        
        return bank_account;
    }

    public void deposit(double input){
        bank_account += input;
        reserve += input;
    }

    //This would never actually be shown to the user
    public double getReserve(){
        return reserve;
    }

    public double getBankAccount(){
        return bank_account;
    }



    

    public static void main(String args[]){
        System.out.println("THE ATM IS STARTING");
        System.out.println("PLEASE PREPARE YOUR PIN NUMBER");
        System.out.println();
        //Creating a new ATM that starts with $5,000,000
        ATM citi = new ATM(5000);
        //At this point I have a succesful login.
        //I can start to ask for withdraws or deposit?
        Scanner transaction_type = new Scanner(System.in);
        Scanner amount = new Scanner(System.in);

        for(;;){
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Reserves left: "+ citi.getReserve());
        System.out.println("Please Enter 0 For a Withdraw");
        System.out.println("Please Enter 1 For a Deposit");
        System.out.println("Please Enter 9 To Exit The ATM");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        
        
            int tType = transaction_type.nextInt();
            //It's a Withdraw
            if(tType==0){
                System.out.println("How Much Would You like to Withdraw?");
                System.out.print("$");
                citi.withdraw(amount.nextDouble());
                System.out.println("Your New Balance is $"+ citi.getBankAccount());
                System.out.println();
            }
            //It's a Deposit 
            else if (tType==1){
                
                System.out.println("How Much Would You like to Deposit?");
                System.out.print("$");
                double value = amount.nextDouble();
                citi.deposit(value);
                System.out.println("You have deposited $" + value);
                System.out.println("Your New Balance is $"+ citi.getBankAccount());
                System.out.println();
            }
            //Exit Menu
            else if (tType==9){
                System.out.println("Thank you for using the Citi ATM!");
                break;
            } 
            //Wasn't a valid number
            else{
                //Do nothing
            }

        }

    }
}