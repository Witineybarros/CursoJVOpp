
package entities;

public class Account {

    private String holder;
    private int acNumber;
    private double balance;

    public Account() {
    }
    

    public Account(String holder, int acNumber) {
        this.holder = holder;
        this.acNumber = acNumber;
    }

    public Account(String holder, int acNumber, double initialDeposit) {
        this.holder = holder;
        this.acNumber = acNumber;
        deposit(initialDeposit);
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getAcNumber() {
        return acNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5;
    }
    
    public String toString(){
        return "Account: "+ acNumber +"\n"
                
                +"Holder: " +holder +"\n"
               
                +"balance:$ "+String.format("%.2f", balance);
                
    }

}
