package entities;

public class Account {

	//Declaração dos atributos
	private int number;
	private String holder;
	private double balance;
	
	
	//Construtores
	public Account(int number, String holder) {
	
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit (initialDeposit);
	}

	//Métodos de acesso
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	
	//Métodos de depósito e saque
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		balance -= amount +5;
	}
	
	//Sobrescreve o método
	public String toString() {
		return "Account"
				+ number
				+ ", Holder:"
				+ holder
				+ ", Balance: $"
				+ String.format("%.2f", balance);
				
				
				
	}
}
