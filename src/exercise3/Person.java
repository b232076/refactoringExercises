package exercise3;

public class Person {

	private Department department;

	public void setDepartment(Department arg) {
		department = arg;
	}

	public Person getManager() {
		return department.getManager();//Couplers - Middle Man, a classe é uma "casca vazia". Podemos realizar esta função em departamento
	}

}
