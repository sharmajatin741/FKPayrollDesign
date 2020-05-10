import org.joda.time.DateTime;

import java.util.*;

public class HourlyClassification implements PaymentClassification{

    PayrollDatabase db;
    double hourlyRate;
    HourlyClassification(PayrollDatabase db,double hourlyRate) {
        this.db = db;
        this.hourlyRate = hourlyRate;
    }
    public void addTimeCard(Employee employee,DateTime date, double workingHours) {
          db.addTimeCard(employee,new TimeCard(workingHours,date));  
    } 
    public double calculatePay(int employeeId) {
      ArrayList<TimeCard> timeCardList = db.getEmployeeTimeCard(employeeId);
      double salary = 0;
      for(TimeCard timecard:timeCardList)
      {
        if(timecard.hours>8.0)
        {
          salary+=timecard.hours*hourlyRate*1.5;
        }
        else salary+=timecard.hours;

      } 
      return salary;
    }
}
