//package
package coe318.lab4;
//class bank
public class Bank {
    //variables
    private String name;
    /**
     * An array of Accounts managed by
     * this bank.
     */
    //array variable
    private Account [] accounts;
    private int numAccounts;//number of active accounts
    //constructor 
    public Bank(String name, int maxNumberAccounts) {
        //assigning variables
        this.name = name;
        accounts = new Account[maxNumberAccounts];//assigning array-account to accounts variable
        numAccounts = 0;//setting the number off accoutns to 0
    }


    /**
     * @return the name
     */
    //retuning name
    public String getName() {
        return name;  
    }

    /**
     * @return the numAccounts
     */
    //returning number of accounts
    public int getNumAccounts() {
        return numAccounts; 
    }

    //returning accounts
    public Account[] getAccounts() {
        return accounts; 
    }

    /**
     * Return true if the Bank already has an account
     * with this number; otherwise false.
     * @param accountNumber
     * @return
     */
    //checks for account number
    public boolean hasAccountNumber(int accountNumber) {
       // checks all accounts in array for a match and returns true if found and will return false if not found
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].getNumber() == accountNumber) {
                 return true;
                
            }
        }
        
        return false;
    }

    /**
     * Adds the specified account to the Bank if possible. If the account number
     * already exists or the Bank has reached its maximum
     * number of accounts, return false and do not add it; otherwise,
     * add it and return true.
     * @param account
     * @return true if successful
     */
    public boolean add(Account account) {
        
                
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                if (hasAccountNumber (account.getNumber()) == false) {
                    accounts[i] = account;
                    numAccounts++;
                    return true;
                }
                break;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        String s = getName() + ": " + getNumAccounts() +
                " of " + getAccounts().length +
                " accounts open";
        for(Account account : getAccounts()) {
            if (account == null) break;
            s += "\n  " + account;
        }
        return s;
    }
}