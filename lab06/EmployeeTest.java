package lab06;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee person = new Employee("Lisa", 42000);
		person.calcualteYearSalary();
		person.predictSalary(-1);
	}

}
