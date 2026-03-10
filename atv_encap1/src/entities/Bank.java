package entities;

public class Bank {
	private Integer account;
	private String clientName;
	private Double accountValue;
	
	public Bank(Integer account, String clientName, Double accountValue) {
		this.account = account;
		this.clientName = clientName;
		this.accountValue = accountValue;
	}

	public Bank(Integer account, String clientName) {
		this.account = account;
		this.clientName = clientName;
	}

	// Getter e Setter
	public Integer getAccount() {
		return account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	public Double getAccountValue() {
		return accountValue;
	}
	
	// Métodos de Classe
	public void deposit(double value) {
		this.accountValue += value;
	}
	
	public void withdrawal(double value) {
		this.accountValue -= (value+5.00);
	}
	
	public String toString() {
		return "Account data: \n"
				+ "Account " + getAccount()
				+ ", Holder: " + getClientName()
				+ ", Balance: $" + getAccountValue();
	}
	
	

}
