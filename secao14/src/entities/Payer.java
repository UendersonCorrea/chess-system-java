package entities;

public abstract class Payer {
	private String name;
	private Double anualIncome;
	
	public abstract double paid();

	public Payer(String name, Double anualIncome) {
		super();
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public String taxes() {
		return name 
				+ ": $ "
				+ String.format("%.2f", paid())
				;
	}
}
