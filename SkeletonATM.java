import java.util.*;

public class SkeletonATM{

    /*  1) Needs to keep track of the amount of money the ATM has!
        2) Withdraw support
        3) Deposit support
        4) Needs a PIN for security
        5) A way to interact with the ATM in the main
    */

    double reserve = 20000.0;
    double bank_account = 0;
    int pin = 0000;

    public SkeletonATM(){
        super();
    }
    public SkeletonATM(double startAmount){
        //Set up the reserves and create a scanner to take in user input
        //While the user enters the wrong pin, deny login and try again.
        
    }

    public boolean login(int pin){
        //Take the input pin and see if it matches the one we have
        return false;
    }
    public double withdraw(double request){
        //Take moeny out of the bank account but dont forget the reserves
        return 0;
    }

    public void deposit(double input){
        //Put money into the bank account

    }



    

    public static void main(String args[]){
        
    }
}