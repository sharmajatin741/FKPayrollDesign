import org.joda.time.DateTime;

public interface PaymentSchedule{
	
	public DateTime getPayPeriodStartDate(DateTime payDate);
	public boolean isPayDate(DateTime payDate);
}