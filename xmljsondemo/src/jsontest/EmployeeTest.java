package jsontest;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		
		emp.setEmpNo(101);
		emp.setName("Sachin");
		emp.setSalary("50000");
		String jsonEmployee = employeeHelpUtil.convertJavaToJson(emp);
		System.out.println(jsonEmployee);
		/*
		 * Employee empl = employeeHelpUtil.convertJsonToJava(jsonEmployee,
		 * Employee.class); System.out.println(empl.getName());
		 * System.out.println(empl.getSalary());
		 */
	}

}
