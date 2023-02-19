package bai9;

public class Bill {
	protected Customer customer;
	protected double oldElectric;
	protected double newElectric;
	
	public Bill(Customer customer, double oldElectric, double newElectric) {
		this.customer = customer;
		this.oldElectric = oldElectric;
		this.newElectric = newElectric;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getOldElectric() {
		return oldElectric;
	}

	public void setOldElectric(double oldElectric) {
		this.oldElectric = oldElectric;
	}

	public double getNewElectric() {
		return newElectric;
	}

	public void setNewElectric(double newElectric) {
		this.newElectric = newElectric;
	}
	
	@Override
	public String toString() {
		return "Bill\n" + "customer:\t" + customer.toString() + "\noldElectric:\t" + oldElectric +
				"\nnewElectric:\t" + newElectric ;
	}
}
