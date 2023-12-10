package com.promineotech;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {
	
	public static void main(String[] args) {

//Lists		
	List<String> students = new ArrayList<String>();
	students.add("Rob");
	students.add("Rob");
	students.add("Sam");
	students.add(null);
	 
	
	for (String student : students) {
		System.out.println(student);
	}
	
		System.out.println(students.get(2)); //Sam
		System.out.println(students.get(0)); //Rob
		
//Sets
		Set<String> states = new HashSet<String>();
		states.add("Alabama");
		states.add("Alaska");
		states.add("Arizona");
		states.add("Arkansas");
		states.add("California ");
 


		System.out.println(states.size());
		System.out.println(states.contains("Delaware"));
		if(states.contains("Alabama")) {
		states.remove("Alabama");
		}
		
		for (String state : states) {
			System.out.println(state);
		}
//Map
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		racerPlacements.put(1, "Tommy");
		racerPlacements.put(2, "Sally");
		racerPlacements.put(3, "John");
		
		System.out.println(racerPlacements.get(1));
		
		racerPlacements.remove(1);
		
		Set<Integer> racerKeys = racerPlacements.keySet();
		for(Integer key : racerKeys) {
			System.out.println(key + " : " + racerPlacements.get(key));
		}
		
		Collection<String> racers = racerPlacements.values();
		for (String racer : racers) {
		System.out.println(racer);
		}
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Augment", "make (something) greater by adding to it; increase.");
		dictionary.put("Diminish", "make or become less");
		dictionary.put("ostentatious", "characterized by vulgar or pretentious displayl designed to impress or attract notice");
		  
		 

		
		
		List<String> listOfNames = new ArrayList<>();
		listOfNames.add("Richard");
		listOfNames.add("Garyn");
		listOfNames.add("Helene");

		// Test your work
		System.out.println(listOfNames);

		
	        // *** Declare the map variable, javaDictionary ***
	        Map<String, String> javaDictionary = new HashMap<>();

	        // *** Populate the map with the following Java vocabulary words and definitions ***
	        javaDictionary.put("array", "A Java Object that contains a collection of data items, all of the same type, accessed by an integer index.");
	        javaDictionary.put("API", "Application Programming Interface. The way that a programmer writing an application will access the behavior and state of classes and objects.");
	        javaDictionary.put("autoboxing", "The automatic conversion between reference and primitive types.");
	        javaDictionary.put("primitive type", "A Java datatype in which the variable's value is of the appropriate size and format for its type. There are 8 primitive datatypes in Java.");
	        javaDictionary.put("reference type", "A variable data type in which the variable's value is an address.");
	        javaDictionary.put("stream", "A byte-stream of data that is sent from a sender to a receiver.");
	        javaDictionary.put("class", "A type that defines the implementation of an object.");

	        // *** Check the result ***
	        // Print the number of entries in the dictionary (Hint: use a method on the Map variable)
	        System.out.println("Number of entries in javaDictionary: " + javaDictionary.size());

	        // Print the dictionary (Hint: use the Map variable)
	        System.out.println(javaDictionary);
		
		
		
		
		 
		
		
		
}
}