package com.pratik.prototype;

import java.util.List;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emp1=new Employees();
		emp1.loadData();
		System.out.println(emp1.toString());
		
		//instead of loading employees data from db everytime 
		//we can clone already populated object with data
		// and modify that cloned object according to our need
		
		
	
		Employees emp2=emp1.clone();
		List<String> list1=emp2.getEmpList();
		list1.add("Jignesh");		
		System.out.println(list1.toString());		
		
		
		Employees emp3=emp1.clone();
		List<String> list2=emp3.getEmpList();
		list2.add("harry");
		list2.remove("Pankaj");
		System.out.println(list2.toString());

	}

}
