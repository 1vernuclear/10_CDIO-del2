package Spil;

public class Account {
    private int balance;

    public Account (int balance){
        this.balance = balance;
    }

    public int addToBalance(int amount){
        balance += amount;
        return balance;
    }

    public int subtractFromBalance(int amount){
        if (amount > balance) {
            balance = 0;
        }
        else {
            balance -= amount;
        }
        return balance;
    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
