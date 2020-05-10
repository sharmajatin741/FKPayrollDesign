
import java.util.*;

import org.joda.time.DateTime;

public class Employee{
	
	public String name;
	public int employeeId;
	public String address;
	public PaymentMode paymentMode;
	public PaymentSchedule paymentSchedule;
	public PaymentClassification paymentClassification;

	public Employee(String name,int employeeId,String address)
	{
		this.name = name;
		this.employeeId = employeeId;
		this.address = address;
	}  

	public void PayDay(PayCheck paycheck)
	{
		double grossPay = paymentClassification.calculatePay(employeeId);
		double netPay = grossPay;
		paycheck.grossPay = grossPay;
		paycheck.deductions = 0;
		paycheck.netPay = netPay;
		paymentMode.pay(paycheck);
	}

	public boolean isPayDate(DateTime payDate)
	{
		return paymentSchedule.isPayDate(payDate);
	}

	public DateTime getPayPeriodStartDate(DateTime payDate) {
		return paymentSchedule.getPayPeriodStartDate(payDate);
	}
}