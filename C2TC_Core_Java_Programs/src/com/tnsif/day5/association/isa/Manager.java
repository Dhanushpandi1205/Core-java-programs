package com.tnsif.day5.association.isa;

public class Manager extends Employee{
	private int teamSize;

	// constructors
	public Manager() {
		super();

	}

	public Manager(String name, int employeeId, String department, int teamSize) {
		super(name, employeeId, department);
		this.teamSize = teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String toString() {
		return "Manager [TeamSize=" + teamSize + ", Name=" + getName() + ", EmployeeId=" + getEmployeeId()
				+ ", Department=" + getDepartment() + "]";
	}
	
}
