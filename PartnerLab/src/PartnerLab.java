
public class PartnerLab {

	public static void main(String[] args) {
		Person p = new Person("Alex", "123 Easy Street", "4431234567");
		
		System.out.printf("Person name: %s%nPerson address: %s%n"
				+ "Person telephone number: %s%n",p.getName(), p.getAddress(), p.getTelephone());

	}

}
