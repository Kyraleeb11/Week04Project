package com.promineotech;

import java.util.ArrayList;
import java.util.List;

public class Workspace04 {

	public static void main(String[] args) {
		
		String firstName = "Bob";
		String lastName = "Brown";
		String middleInitial = "B";
		String space = " ";
		
		System.out.println(firstName);
		System.out.println(lastName);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(firstName);
		sb.append(space);
		sb.append(lastName);
		System.out.println(sb.toString());
		
		sb.insert(firstName.length()+1, middleInitial + space);
		System.out.println(sb.toString());
	
	

String[] cars = new String[3]; {
cars [0] = "Camaro";
cars[1] = "F150";
cars[2] = "Mustang";

//List<E> list of E where E is the generic that will be replaced with the type
//List<String> reads as 'list of String'
	
	List<String> sports = new ArrayList<String>();
	sports.add("Wrestling");
	sports.add("Soccer");
	sports.add("Football");
	sports.remove(1);
	
	
	
	for(int i = 0; i < sports.size(); i++) {
	System.out.println(sports.get(i));  
	}

	for(String sport : sports) {
		System.out.println(sport);
	}



	
	
	

}
}
	}



