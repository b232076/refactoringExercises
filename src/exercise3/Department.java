package exercise3;

public class Department {

	private String chargeCode;
	private Person manager;
// Acesso ao gerente: pessoa - departamento - gerente 
	public Department(Person arg) {
		manager = arg;
	}

	public Person getManager() {
		return manager;
	}

	// …
}
