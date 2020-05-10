
import org.joda.time.DateTime;


public class PayCheck{
	public final DateTime payDate;
	public DateTime startDate;
	public double grossPay;
	public double deductions;
	public double netPay;
	
	public PayCheck(DateTime startDate,DateTime payDate)
	{	
		this.startDate = startDate;
		this.payDate = payDate;
	}
}