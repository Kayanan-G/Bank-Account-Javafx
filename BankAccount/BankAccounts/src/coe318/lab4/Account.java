//package
package coe318.lab4;
//class account
public class Account {
    //initialized variable
    private String name;
    private int number;
    private double balance;
    
    //constructor
    public Account (String name, int number, double balance) {
        //assigning variables
        this.name = name;
        this.number = number;
        this.balance = balance;
    }
    
    /**
     * @return the name 
     */
    //returning name
    public String getName() {
        return name;
    } 
    
    /**
     * @return the account number 
     */
    //returning number
    public int getNumber() {
        return number;
    }
    
    /**
     * @return the account balance 
     */
    //returning balance
    public double getBalance() {
        return balance;
    }
    
    /**
     * Return true if the money that user would like to deposit
     * is above $0; otherwise return false
     * @param amount 
     * @return 
     */
    //deposit
    public boolean deposit (double amount) {
         //checks if the amount is less then 0 and returns false
        if (amount < 0) {
            return false;
        }
        //if greater then 0 adds amount to the balance
        else {
            balance += amount;
            return true;
        }
    }
    
    /**
     * Return true if the money the user would like to withdraw is 
     * less than the account balance and greater than $0; otherwise
     * return false
     * @param amount
     * @return 
     */
    //withdraw
    public boolean withdraw (double amount) {
        //checks of amount is greater than 0 and ammont is greater than less then balance
        if ((amount > 0) && (amount < balance)) {
            //takes the amount out of the balance/account
            balance -= amount;
            return true;
            //if amount is not greater than 0 and ammont is not greater than less then balance return true/ next section of code
        } else {
            return false;
        }
    }
    
    @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " + String.format("$%.2f", getBalance()) + ")";
    }
}