public class Account {
   private double balance;
   private int rateOfInterest;

    Account(double balance, int rateOfInterest) {
        this.balance = balance;
        this.rateOfInterest = rateOfInterest;
    }

    public double get_balance() {
        return balance;
    }

    public void addInterest() {
        System.out.println("Interest added (Base class)");
    }

public void get_details() {
        System.out.println("Balance: " + balance);
        System.out.println("Rate of Interest: " + rateOfInterest);
    }

    public static void main(String[] args){

        Savings s = new Savings(1000.0,5);
        s.get_details();
        s.addInterest();

        Credit c = new Credit(2000.0,10);
        c.get_details();
        c.addInterest();
    }
}

class Savings extends Account{

    Savings(double balance, int rateOfInterest){
        super(balance,rateOfInterest);
    }

    public void addInterest(){
        System.out.println("Interest added in Savings Account");
    }
}
class Credit extends Account{

    Credit(double balance, int rateOfInterest){
        super(balance,rateOfInterest);
    }

    public void addInterest(){
        System.out.println("Interest added in Credit Account");
    }
}
