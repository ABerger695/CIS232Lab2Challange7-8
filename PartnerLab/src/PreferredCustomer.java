
public class PreferredCustomer extends Customer
{
	double purchases;
	double discountLevel;
	
	public PreferredCustomer(String name, String address, String telephone,
							String number, boolean list, double purchases)
	{
		super(name, address, telephone, number, list);
		this.purchases = purchases;
	}
	
	public double discountLevel()
	{
		//Using if and else if statements to get a discount as a decimal
		if (purchases < 500)
		{
			discountLevel = 0;
		}
		else if (purchases < 999.99)
		{
			discountLevel = .05;
		}
		else if(purchases < 1499.99)
		{
			discountLevel = .06;
		}
		else if(purchases < 1999.99)
		{
			discountLevel = .07;
		}
		else if(purchases >= 2000)
		{
			discountLevel = .1;
		}
		return discountLevel;
	}
}
