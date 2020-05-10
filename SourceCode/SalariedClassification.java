

public class SalariedClassification implements PaymentClassification {
	public double salary;

	public SalariedClassification(double salary) {
		this.salary = salary;
	}
	public double calculatePay(int employeeId) {
		return salary; 
	}
}
