package com.ltts.DemoSpringConstructor;

public class Employee {
	private int EmpId;
	private String EmpName;
	private String EmpAddress;
	public int getEmpId() {
		return EmpId;
	}
	public Employee() {
		
	}
	
	public Employee(int empId, String empName, String empAddress) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpAddress = empAddress;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpAddress() {
		return EmpAddress;
	}
	public void setEmpAddress(String empAddress) {
		EmpAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpAddress=" + EmpAddress + "]";
	}
	
}
