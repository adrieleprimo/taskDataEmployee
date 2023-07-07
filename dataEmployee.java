package entities;

public class dataEmployee {
		public String Name;
		public double GrossSalary;
		
		public double Tax;
		
	public double netSalary () {
		return GrossSalary - Tax;
	}
	public  void increaseSalary ( double percentage) {
		
				this.GrossSalary = GrossSalary + ((GrossSalary/100)*percentage);
				
				
			
		
	}
	public String toString() {
		return  Name + ", $ " + String.format("%.2f", Math.abs(netSalary()));
	}
}
