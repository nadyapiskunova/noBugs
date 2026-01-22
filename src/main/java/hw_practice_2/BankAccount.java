package hw_practice_2;

public class BankAccount {
    String owner;
    int balance;

    BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }

    String getOwner(){
        return owner;
    }

    int getBalance(){
        return balance;
    }

    void setOwner(String newOwner){
        owner = newOwner;
    }

    void setBalance(int newBalance){
        balance = newBalance;
    }

    int deposit(int amount){
        return balance + amount;
    }

    int withdraw(int amount){
        return balance - amount;
    }

    void printBalance(){
        System.out.println("Ваш баланс: " + getBalance());
    }




}
