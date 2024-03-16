package entities;

public class Company extends Payer{

	int employees;

	@Override
	public double paid() {
		double paid=0;
		if(employees<=10) {
			paid = getAnualIncome()*0.16;
		}
		else {
			paid = getAnualIncome()*0.14;
		}
		return paid;
	}
	
	public Company(String name, Double anualIncome, int employees) {
		super(name, anualIncome);
		this.employees = employees;
	}

	public int getEmployees() {
		return employees;
	}

	public void setEmployees(int employees) {
		this.employees = employees;
	}
	

}
