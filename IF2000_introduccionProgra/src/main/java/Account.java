import domain.Person;

public abstract class Account {
  private String accountNumber;
  private double balance;
  private Person client; 
  
  public Account(){
  }
public Account(String accountNumber, double balance, Person client){
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.client = client;
    
}

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Person getClient() {
        return client;
    }

    public void setClient(Person client) {
        this.client = client;
    }
  public abstract void deposit();
  public abstract void withdraw();
  public abstract double interestCalculation();
  
  
  public String toString(){
      String result = "\nBANK ACCOUNT INFORMATION:"
              +"\n---------------------------"
              +"\nAccount Number: "+this.getAccountNumber()
              +"\nBalance: "+this.getBalance()
              +"\nAccount Owner: "+this.getClient() . toString();
      return result;
      
      
      
  }
}

