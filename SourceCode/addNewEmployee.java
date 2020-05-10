
import java.util.*;

public class addNewEmployee{

	PayrollDatabase db;
	Scanner sc;
	void run()
	{
		System.out.println("Enter Employee Name");
		String name = sc.next();
		System.out.println("Enter Employee Id");
		int employeeId = sc.nextInt();
		System.out.println("Enter Address");
		String address = sc.next();


		System.out.println("Enter PaymentMode");
		System.out.println("1: Payment Method by Direct Bank Transfer");
		System.out.println("2: Payment Method by Mail");
		System.out.println("3: Payment Method by Pickup");
		int choiceMethod = sc.nextInt();

		System.out.println("Enter Payment Schedule");
		System.out.println("1: Payment Weekly");
		System.out.println("2: Payment Monthly");
		int choiceSchedule = sc.nextInt();

		System.out.println("Enter Payment Classification");
		System.out.println("1: Hourly Employee");
		System.out.println("2: Commissioned Employee");
		System.out.println("3: Salaried Employee");
		int choiceClassification = sc.nextInt();
		addClassification( choiceClassification ,employeeId);

		db.addEmployee(name,employeeId,address,choiceMethod,choiceSchedule,choiceClassification);
	}
	void addClassification(int choiceClassification,int employeeId)
	{
		switch(choiceClassification)
		{
			case 1:
				System.out.println("Enter Hourly Rate");
				double hourlyRate = sc.nextDouble();
				db.addHourlyEmployee(employeeId, hourlyRate);
				break;
			case 2:
				System.out.println("Enter Commission");
				double commission = sc.nextDouble();
				System.out.println("Enter Base Rate");
    				double baseRate = sc.nextDouble();
				db.addCommissionedEmployee(employeeId,commission,baseRate);
				break;
			case 3:
				System.out.println("Enter Salary");
				double Salary = sc.nextDouble();
				db.addSalariedEmployee(employeeId,Salary);
				break;
			default:
				System.out.println("Invalide choice");
		}	
	}
	addNewEmployee(Scanner sc,PayrollDatabase db)
	{	
		this.sc = sc;
		this.db = db;
		run();
	}
}