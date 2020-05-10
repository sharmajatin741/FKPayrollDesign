
import java.util.*;

import org.joda.time.*;


public class postTimeCard{

	PayrollDatabase db;
	Scanner sc;
	void run(){
		System.out.println("Enter Employee Id");
		int employeeId = sc.nextInt();
		System.out.println("Enter no. of hours work");
		double hours = sc.nextDouble();
		DateTime date = DateTime.now();
		TimeCard timeCard = new TimeCard(hours,date);
		db.addTimeCard(employeeId,timeCard);
	}
	postTimeCard(Scanner sc,PayrollDatabase db)
	{
		this.sc = sc;
		this.db = db;
		run();
	}
}