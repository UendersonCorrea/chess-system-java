package model.entities;

import model.exception.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;

	public Account() {

	}

	public Account(Integer number, String holder, Double withDrawLimit) {

		this.number = number;
		this.holder = holder;
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(Double amount) {
		if(balance == null) {
			balance =0.0;
		
		}
		
			balance += amount;
		
	}

	public void withdraw(Double amount) throws DomainException {
		if (amount > withDrawLimit) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
		}
		if (amount > balance) {
			throw new DomainException("Withdraw error: Not enough balance");
		}
		balance -= amount;
	}
	@Override
	public String toString() {
		return "Account: " 
				+ getNumber()
				+". "
				+getHolder()
				+", Balance: "
				+getBalance();
		
	}

}
