package entities;

public class Individual extends Payer {

	private double healthExpend;
	
	@Override
	public double paid() {
		// renda <20mil 15% renda >=20mil 25% - despesa saude abate 50%
				
				double paid =0;
				if(getAnualIncome()<20000) {
					paid=(getAnualIncome()*0.15)-(healthExpend*0.5);
				}
				else {
					paid=(getAnualIncome()*0.25)-(healthExpend*0.5);
				}
				if(paid<0) {
					paid = 0.0;
				}
				return paid;
				
		
	}

		public Individual(String name, Double anualIncome, double healthExpend) {
		super(name, anualIncome);
		this.healthExpend = healthExpend;
	}

		public double getHealthExpend() {
			return healthExpend;
		}

		public void setHealthExpend(double healthExpend) {
			this.healthExpend = healthExpend;
		}
	
	
	
	

}
