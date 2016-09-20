
public class PreferredCustomer extends Customer
{
	public double purchases;
	
	public double getPurchases() {
		return purchases;
	}

	public void setPurchases(double purchases) {
		this.purchases = purchases;
	}

	public PreferredCustomer(String name, String address, String telephone, String number, boolean list, double purchases)
	{
		super(name, address, telephone, number, list);
		
		this.purchases = purchases;
	}
}
