package com.pratik.factory;

public class ComputerFactory {
	/* based on the input parameter, different subclass is created and returned */
	
public static Computer getComputer(String type, String ram, String hdd, String cpu) {
	
	if("PC".equalsIgnoreCase(type)) {
		return new PC(ram, hdd, cpu);
	}else if("Server".equalsIgnoreCase(type)) {
		return new Server(ram, hdd, cpu);
	}
	return null;	
}
}
