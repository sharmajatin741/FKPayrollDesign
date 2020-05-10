import java.util.*;

public class Main{
	static Scanner sc;
	static PayrollDatabase db;
	static int noOfCommands = 8;
	static void Welcome()
	{
		System.out.println("------------------------------------------------");
		System.out.println("----------------Payroll Software----------------");
		System.out.println("-------------Created by Jatin Sharma------------");
		System.out.println("------------------------------------------------");
	}
	static void showMenu()
	{
		System.out.println("\nMain Menu");
		System.out.println("---------------------");
		System.out.println("1. Add a new employee");
		System.out.println("2. Delete an employee");
		System.out.println("3. Post a time card");
		System.out.println("4. Post a sales receipt");
		System.out.println("5. Post a union membership, service charge etc.");
		System.out.println("6. Change employee details (e.g., hourly rate, dues rate, membership fee etc)");
		System.out.println("7. Run the payroll for today");
		System.out.println("8. Quit");
		System.out.println("Select choice according to number");
	}

	static boolean validCommand(String command)
	{
		for(int i=0;i<command.length();i++)
		{
			if(Character.isLetter(command.charAt(i)))
			{
				return false;
			}
		}
		if(command.length()>=8)
		{
			return false;
		}
		if(Integer.parseInt(command)>noOfCommands)
		{
			return false;
		}
		return true;
	}
	static void doCommand(String command)
	{
		if(validCommand(command)==false)
		{
			System.out.println("Invalid Choice\n");
			return;
		}

		int commandInt =  Integer.parseInt(command);
		switch(commandInt)
		{
			case 1:
				new addNewEmployee(sc,db);	
				break;
			case 2:
				new deleteEmployee(sc,db);
				break;
			case 3:
				new postTimeCard(sc,db);
				break;
			case 4:
				new postSalesReceipt();
				break;
			case 5:
				new postUnionMembership();
				break;
			case 6:
				new changeEmployeeDetails();
				break;
			case 7:
				new runPayrollForToday();
				break;
			case 8:
				System.out.println("Thank You! Have a nice day");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");

		}
	}
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		db = new PayrollDatabase();
		char choice = 'N';
		Welcome();
		do{
			showMenu();
			String command = sc.next();
			doCommand(command);
			System.out.println("Want to do more ?[Y/n]");
			choice = sc.next().charAt(0);

		}while(choice=='y'||choice=='Y');
		System.out.println("Thank You! Have a nice day");
	}
}