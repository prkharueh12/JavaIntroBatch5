package day19OOP_Encapsulation;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount park = new BankAccount("Park", "Fernandez");
		park.setAcctHolder("Park Fernandez");
		park.setAcctNum(5878);
		park.deposit(2000);
		park.availableBalance();
		
		park.withdraw(99);
		park.withdraw(700);
		park.availableBalance();
		
		park.deposit(1000);
		park.availableBalance();

	}

}
