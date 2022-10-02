package org.test;

public class Employee {
	
	public void empId() {
    System.out.println("my employee id is 123");
	}
	
	public void empName() {
		System.out.println("my employee name is hari");

	}
	public void empDOB() {
    System.out.println("my employee dob is 23/10/1998");
	}
	
	public void empEmail() {
    System.out.println("arunahari2397mail.com");
    
	}
	
	public void empAddress() {
    System.out.println("omr");
	}
	
	
public static void main(String[] args) {
	Employee e=new Employee();
	e.empId();
	e.empName();
	e.empDOB();
	e.empEmail();
	e.empAddress();
	
}
}
