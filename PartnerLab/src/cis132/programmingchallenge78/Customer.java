package cis132.programmingchallenge78;
public class Customer extends Person {
	
	String number;
	boolean list;
	
	public Customer(String name, String address, String telephone, String number, boolean list){
		super(name, address, telephone);
		this.number = number;
		this.list = list;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public boolean isList() {
		return list;
	}

	public void setList(boolean list) {
		this.list = list;
	}

}
