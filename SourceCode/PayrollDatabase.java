
import java.sql.*;

import java.util.*;

public class PayrollDatabase{

	Connection con;
	PayrollDatabase(){
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","password");    
		}
		catch(Exception e){ 
			System.out.println(e);
		}
	}
	void addEmployee(String name,int employeeId,String address,int choiceMethod,int choiceSchedule,int choiceClassification)
	{
		try{
			String query = " insert into employee (name, employeeId, address, choiceMethod, choiceSchedule,choiceClassification)"+ " values (?, ?, ?, ?, ?,?)";
			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setString(1,name);
			preparedStmt.setInt(2,employeeId);
			preparedStmt.setString(3,address);
			preparedStmt.setInt(4,choiceMethod);
			preparedStmt.setInt(5,choiceSchedule);
			preparedStmt.setInt(6,choiceClassification);
			preparedStmt.execute();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	void addHourlyEmployee(int employeeId,double hourlyRate)
	{
		try{
			String query = " insert into HourlyEmployee (employeeId, hourlyRate)"+ " values (?, ?)";
			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setInt(1, employeeId);
			preparedStmt.setDouble(2, hourlyRate);
			preparedStmt.execute();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	void addCommissionedEmployee(int employeeId,double commission,double baseRate)
	{
		try{
			String query = " insert into CommissionedEmployee (employeeId,commision,baseRate)"+ " values (?, ?, ?)";
			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setInt(1, employeeId);
			preparedStmt.setDouble(2, commission);
			preparedStmt.setDouble(3, baseRate);
			preparedStmt.execute();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	void addSalariedEmployee(int employeeId,double Salary)
	{
		try{
			String query = " insert into SalariedEmployee (employeeId, Salary)"+ " values (?, ?)";
			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setInt(1, employeeId);
			preparedStmt.setDouble(2, Salary);
			preparedStmt.execute();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	void deleteHourlyEmployee(int employeeId)
	{

	}
	void deleteCommissionedEmployee(int employeeId)
	{

	}
	void deleteSalariedEmployee(int employeeId)
	{

	}
	Employee getEmployeeById(int employeeId)
	{
		return new Employee("",1,"");
	}

	void addTimeCard(Employee employee,TimeCard timeCard){

	}
	ArrayList<TimeCard> getEmployeeTimeCard(int employeeId){
		ArrayList<TimeCard> dummy = new ArrayList<>();
		return dummy;
	}
	int getHourlyRate(Employee employee){
		return 1;
	}
	ArrayList<SalesReceipt> getEmployeeReceipt(int employeeId)
	{
		ArrayList<SalesReceipt> dummy = new ArrayList<>();
		return dummy;	
	}
	void addSalesReceipt(Employee employee,SalesReceipt salesReceipt)
	{

	}
}