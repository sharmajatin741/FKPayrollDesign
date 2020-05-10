import java.util.*;

import org.joda.time.DateTime;


public class CommissionedClassification implements PaymentClassification {

    public double commission;
    public double baseRate;
    PayrollDatabase db;
    public CommissionedClassification(double baseRate, double commission,PayrollDatabase db) {
        this.baseRate = baseRate;
        this.commission = commission;
        this.db = db;
    }

    public void addSalesReceipt(Employee employee,DateTime date, double amount) {
        db.addSalesReceipt(employee,new SalesReceipt(date,amount));
    }
    
    public double calculatePay(int employeeId) {
      double salary = baseRate;
      ArrayList<SalesReceipt> salesReceiptList = db.getEmployeeReceipt(employeeId);
      for(SalesReceipt salesReceipt: salesReceiptList)
      {
        double amount = commission*(salesReceipt.amount)/100.0;
        salary+= amount;
      }
      return salary;
    }
}
