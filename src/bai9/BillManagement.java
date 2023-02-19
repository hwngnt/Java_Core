package bai9;

import java.util.ArrayList;
import java.util.List;


public class BillManagement {
	List<Bill> bills;
	
	public BillManagement() {
		this.bills = new ArrayList<>();
	}
	
	public void addBill(Bill bill) {
		this.bills.add(bill);
		System.out.println(bill.toString());
		double price = (bill.newElectric - bill.oldElectric)*5;
		System.out.println("Payment: " + price);
	}
}
