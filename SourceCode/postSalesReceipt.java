import java.util.*;


import org.joda.time.*;

public class postSalesReceipt{
	PayrollDatabase db;
	Scanner sc;

	void run()
	{
		System.out.println("Enter Employee Id");
		int employeeId = sc.nextInt();
		System.out.println("Enter amount of sale");
		double amount = sc.nextDouble();
		DateTime date = DateTime.now();
		SalesReceipt salesReceipt = new SalesReceipt(date,amount);
		db.addSalesReceipt(employeeId,salesReceipt);

	}

	postSalesReceipt(Scanner sc,PayrollDatabase db)
	{
		this.sc = sc;
		this.db = db;
		run();	
	}
}