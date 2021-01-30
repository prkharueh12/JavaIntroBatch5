package day19OOP_Encapsulation;

public class BankAccount {
	
	/*
	create a custom class called BankAccount for Bank of America
	a.  public variables:  bankName, firstName, lastName
	b.  private variables: accountHolder, accountNumber, balance
	c.  encapsulate all the private data

	d. create a constructor that can initialize firstName and lastName

	e. public methods:
	deposit (apply set Methods)
	withdraw (apply set Methods)
	availableBalance (apply getter)
	*/

	final static String bankName = "PNc";
	public String firstName;
	public String lastName;
	
	private String acctHolder;
	private int acctNum;
	private double balance;
	
	//c.  encapsulate all the private data
	
	public int getAcctNum() {
		return acctNum;
	}
	public void setAcctNum(int acctNum) {
		this.acctNum = acctNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAcctHolder () {
		return this.acctHolder;
	}
	public void setAcctHolder (String acctHolder) {
		this.acctHolder = acctHolder;
	}
	
	
//d. create a constructor that can initialize firstName and lastName
	
	public BankAccount () { // constructor
		
	}
	
    public BankAccount (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
    
//    e. public methods:
//    	deposit (apply set Methods)
//    	withdraw (apply set Methods)
//    	availableBalance (apply getter)
    
    public void deposit (double amount) {
    	if (amount < 0) {
    		return;
    	}
    	this.balance = balance+amount;
    }
    
    public void withdraw (double amount ) {
    	balance -= amount;
    }
    public void availableBalance() {
    	System.out.println("Your balance is :$"+getBalance());
    }
    
}
