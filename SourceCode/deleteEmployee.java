
import java.util.*;

public class deleteEmployee{

	PayrollDatabase db;
	Scanner sc;
	void run()
	{
		System.out.println("Enter Employee Id of the Employee which you want to delete");
		int employeeId = sc.nextInt();
		db.deleteEmployee(employeeId);
	}
	
	deleteEmployee(Scanner sc,PayrollDatabase db)
	{	
		this.sc = sc;
		this.db = db;
		run();
	}

}