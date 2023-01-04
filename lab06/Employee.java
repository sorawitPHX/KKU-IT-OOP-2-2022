package lab06;

public class Employee {
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void calcualteYearSalary() {
		int result_salary_year = (int)salary*12;
		System.out.printf("%s's salary is %,.0f bath/month (%,d bath/year).\n", name, salary, result_salary_year);
	}
	public void predictSalary(double percent) {
		if(percent>=1 && percent<=100) {
			double result_salary = salary+(salary*(percent/100));
			System.out.printf("if salary is raised %.0f%%, the salary will be %,.0f bath/month.\n", percent, result_salary);
		}else {
			System.out.println("invalid percent");
		}
	}
	
	
	
}
