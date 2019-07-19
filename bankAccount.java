/* This is just a bank account code I made whilst practicing with classes, if/else statements and general Java syntax. It's simple and self explanantory but I've created several methods to deposit, withdraw and transfer between bank accounts, so feel free to have a play around. I haven't been programming in Java very long so any feedback is appreciated. */

public class bankAccount {
  
  int balance;
  int savings;
  String owner;
  
  public bankAccount(int bankBalance, int savingsBalance, String ownerName) {
    balance = bankBalance;
    savings = savingsBalance;
    owner = ownerName;
  }
  
  public String toString() {
    return "Account owner: " + owner + "\n" + "Bank account balance: " + balance + "\n" + "Savings account balance: " + savings + "\n";
  }
  
  public void bankDeposit(int depositAmount) {
    balance = balance + depositAmount;
    System.out.println("You just deposited " + depositAmount + " in your bank account.");
    System.out.println("Your bank account balance is now " + balance + ".\n");
  }
  
  public void bankWithdraw(int withdrawAmount) {
    
    if (withdrawAmount > balance) {
        System.out.println("You do not have enough money to withdraw " + withdrawAmount + " from your bank account!\n");
        
    } else {
        balance = balance - withdrawAmount;
        System.out.println("You just withdrew " + withdrawAmount + " from your bank account.");
        System.out.println("Your bank account balance is now " + balance + ".\n");
    }
  }
  
  public void savingsDeposit(int savingsDepositAmount) {
    savings = savings + savingsDepositAmount;
    System.out.println("You just deposited " + savingsDepositAmount + " in your savings account.");
    System.out.println("Your savings account balance is now " + balance + ".\n");
  }
  
  public void savingsWithdraw(int savingsWithdrawAmount) {
      
    if (savingsWithdrawAmount > savings) {
        System.out.println("You do not have enough money to withdraw " + savingsWithdrawAmount + " from your savings account!\n");
        
    } else {
        savings = savings - savingsWithdrawAmount;
        System.out.println("You just withdrew " + savingsWithdrawAmount + " from your savings account.");
        System.out.println("Your savings account balance is now " + savings + ".\n");  
    }    
  }
  
  public void transferToBank(int bankTransferAmount) {
      
    if (bankTransferAmount > savings) {
        System.out.println("You do not have enough money to transfer " + bankTransferAmount + " from your savings account to your bank account!\n");
        
    } else { 
        savings = savings - bankTransferAmount;
        balance = balance + bankTransferAmount;
        System.out.println("You have just transferred " + bankTransferAmount + " from your savings account to you bank account.");
        System.out.println("Your savings account balance is now " + savings + ", and your bank account balance is now " + balance + ".\n");
    }    
  }
  
  public void transferToSavings(int savingsTransferAmount) {
      
    if (savingsTransferAmount > balance) {
        System.out.println("You do not have enough money to transfer " + savingsTransferAmount + " from your bank account to your savings account!\n");    
    } else {
        balance = balance - savingsTransferAmount;
        savings = savings + savingsTransferAmount;
        System.out.println("You have just transferred " + savingsTransferAmount + " from your bank account to you savings account.");
        System.out.println("Your bank account balance is now " + balance + ", and your savings account balance is now " + savings + ".\n");
    } 
  }
  
  public static void main(String[] args){
    bankAccount myAccount = new bankAccount(2000, 0, "Bob");
    
    System.out.println(myAccount);
    
    myAccount.bankDeposit(500);
    
    myAccount.bankWithdraw(2500);
    
    myAccount.bankWithdraw(250);
    
    myAccount.savingsDeposit(1000);
    
    myAccount.savingsWithdraw(150);
    
    myAccount.transferToBank(1000);
    
    myAccount.transferToBank(500);
    
  }       
}
