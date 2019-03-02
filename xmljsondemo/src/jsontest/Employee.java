package jsontest;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
@JsonPropertyOrder(value= {
		"empNo",
		"name"
})
public class Employee implements Serializable{
	private int empNo;
	private String name;
	@JsonIgnore
	private String salary;
	
	
	/**
	 * @return the address
	 */
	/**
	 * @param address the address to set
	 */
	
	/**
	 * @return the empNo
	 */
	public int getEmpNo() {
		return empNo;
	}
	/**
	 * @param empNo the empNo to set
	 */
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the salary
	 */
	public String getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
