package com.pratik.prototype;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

public class Employees implements Cloneable {
	private List<String> empList;

	public Employees() {
		empList = new ArrayList<>();
	}

	public Employees(List<String> empList) {
		this.empList = empList;
	}

	public Employees(String employee) {
		// TODO Auto-generated constructor stub
	}

	public void loadData() {
		// read all employees from database and put into the list
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("David");
		empList.add("Lisa");
	}

	public List<String> getEmpList() {
		return empList;
	}

	@Override
	protected Employees clone() throws CloneNotSupportedException {
		// determining how do we want to clone it
		// we are just copying object element by element
		List<String> tempList = new ArrayList<String>();
		for (String s : this.getEmpList()) {
			tempList.add(s);
		}

		//empList.stream().map(employee -> new Employees(employee)).collect(Collectors.toList());

		return new Employees(tempList);
	}

	@Override
	public String toString() {
		return "Employees [empList=" + empList + "]";
	}

}
