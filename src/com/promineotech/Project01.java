package com.promineotech;

public class Project01 {

	public static void main(String[] args) {
//#1		
		// created array of int called age using the following values:
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

	//subtract the value of the first element in the array from the last element and print result
		int difference = ages[ages.length - 1] - ages[0];
		System.out.println("The difference between the first and last element in the array is:" + " " + difference);

	// created new array called ages2 and set the value of the array to 9, adding 1 age to the ages array. 	
		int newAge = 42;
	//creates a new integer array ages2 with the length one element longer than the original ages array
		int[] ages2 = new int[ages.length + 1];
	//copy all elements from the original ages array to the ages2 array  
	    System.arraycopy(ages, 0, ages2, 0, ages.length);
	//adds the value of age2 (42) to the last element of the new array ages2
	    ages2[ages2.length - 1] = newAge; 		
	    difference = ages2[ages2.length - 1] - ages[0];
		System.out.println("The difference between the first and last element in the array is:" + " " + difference);

	//used a for loop to calculate the average age from the 9 different ages and
	//printed average age to console.
	    int averageAge = 0;
	    for (int age : ages2) {
	    	averageAge += age;
	 }   
	    averageAge = averageAge / ages2.length;
	    System.out.println("The average age is: " + averageAge);
//#2
	//created an array of String called names   
	    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	//declared an int variable named averageNameLength and initializes it to 0. This will be used to store the sum of the lengths of 
	//all names.
	    int averageNameLength = 0;
	 //for-each loop that iterates over each "String" element in the "names" array. For each "name" in the array, it adds the length 
	 // of that name to the "averageNameLength" variable.
	    for(String name : names) {
	    	averageNameLength += name.length();
	    }
	  //After the loop, this line calculates the average length of the names and then prints the calculated average
	  //number of letters per name.   
	    averageNameLength = averageNameLength / names.length;
	    System.out.println("The average number of letters per name is: " + averageNameLength);
	  
	  //initializes an empty string called allNames to store the concatenated result. Then iterates through each name in the array using
	  //another enhanced for loop, in each iteration it appends the current name and a space to the allNames string
	    String allNames = "";
	    for (String name : names) {
	    	allNames += name + " ";
	    }
	System.out.println("All the names concatenated together, seperated by spaces: " + allNames);
	
//#3	
//How do you access the last element of any array?
//Answer: use the index length - 1 ex: int lastElement = numbers[numbers.length - 1];
	
//#4
//How do you access the first element of any array?
//Answer: use the index 0 ex: int firstElement = numbers[0];

//#5
	//created a new array of int called nameLengths
		int[] nameLengths = new int[names.length];
	//this for loop iterates through each element of the array "names". For each element at the index 'i', it retrieves the length of the
	//corresponding string using the names[i].length() and assigns that length to the corresponding 
	//index in the "nameLengths array(namesLenths[i])
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
	//the nameLengths array will contain the lengths of the strings in the names array, in the same order.	
//#6
	//initialized an integer variable sumOfNameLengths and set its initial value to 0. This variable will be used to accumulate
	//the sum of the lengths of names.
		int sumOfNameLengths = 0;
	//This for loop is an enhanced loop that iterates through each element (nameLength) in the array (nameLengths). In each 
	//iteration, it adds the current nameLength to the sumOfNameLengths.	
		for(int nameLength : nameLengths) {
			sumOfNameLengths += nameLength;
		}
	//after the loop this line prints the result, displaying the sum of all the name lengths calculated in the previous loop.
	System.out.println("Step #6: \t The sum of all the name lengths is: " + sumOfNameLengths);
	
//#7	
	//calls the (repeatWord) method with arguments (hello and 3) and assigns the result to a string variable named result
		String result = repeatWord("Hello", 3);
		System.out.println(result);
 } //=======END OF MAIN===============
	
	//This is a method named repeatWord that takes the String word and an int n as parameters and returns a String. I used StringBuilder 
	//to efficiently concatenate the input word with itself 'n' times
		public static String repeatWord(String word, int n) {
	//Initializes a StringBuilder named repeatedWord to store the concatenated result 	
			StringBuilder repeatedWord = new StringBuilder();
	//This for loop will iterate 'n' times. In each iteration, it appends the input word to the repeatedWord StringBuilder		
			for (int i = 0; i < n; i++) {
	//after the loop, the method returns the final concatenated result by converting the StringBuilder to a String using toString()		
				repeatedWord.append(word);
     }
	//printed result to console	
			return repeatedWord.toString();
}	
//#8
	//createFullName method that takes two String parameters firstName and lastName and concatenates them with a space in between and returns 
	//the resulting full name.
		public static String createFullName (String firstName, String lastName) {
			String fullName = firstName + " " + lastName;
			return fullName;
		}
	
//#9
	//defines the method isSumGreaterthan100 and takes an array of integers as an argument and returns a boolean value		
		public static boolean isSumGreaterThan100(int[] array) {
	//initializes a variable sum to zero and then iterates through each element in the input array. In each iteration, 
	//it adds the current elements value to the sum
			int sum = 0;
			for (int element : array) {
				sum += element;
			} 
	//after calculating the sum of all elements in the array, the method returns true if the sum is greater than 100 and false otherwise
			return sum > 100;
		}
//#10
	//the calculateAverage method takes an array of doubles as a parameter and returns it as a double
		public static double calculateAverage(double[] array) {
	//it checks if the array is empty to avoid division by zero and returns 0.0 in that case
			if(array.length == 0) {
				return 0.0;
			}
	//initializes the variable sum to zero then iterates through each element in the input array		
			double sum = 0.0;
			for(double element : array) {
				sum += element;
		}
	//after calculating the sum of all the elements in the array, the method returns the average by dividing the sum by the length of the array

		return sum / array.length; 
		}
//#11
		//declaring the method and it is taking 2 parameters both are type double and returning a boolean 
		public static boolean isAvgOfArray1GreaterThanAvgOfArray2(double[] array1, double[] array2) {
	    //calculating the sum of the elements in the first array then dividing the sum by the length of array1 to find the average
				double sum1 = 0;
	            for (double value : array1) {
	                sum1 += value;
	            }
	            double avg1 = sum1 / array1.length;
	    //doing the same as above but for the second array
	            double sum2 = 0;
	            for (double value : array2) {
	                sum2 += value;
	            }
	            double avg2 = sum2 / array2.length;
	    //comparing the averages of the 2 arrays and if the average of the first array is greater than the second it will return true    
	            return avg1 > avg2;
	        }
//#12
		//created method that takes 2 parameters and will return a boolean 
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		//condition check using the && operator 
			if(isHotOutside == true && moneyInPocket > 10.50) {
		//returning true if it is hot outside and you have more than 10.50 in your pocket otherwise it will return false
				return true;
			}
			else {
				return false;
			}}
//#13
		// I created this billAndTip method using a double bill parameter and a int tip and will return as a double, as the total bill plus tip
			public static double billAndTip(double bill, int tip) {
		//this line is calculating the tip amount by making the tip a double to make sure tip is correctly divided and doesn't throw an error if the 
		// outcome is a decimal and divides by 100 to get the tip percentage then multiples to the bill to get the total tip amount
				double tipAmount = bill * ((double) tip / 100);
		//returns the total amount of bill + tip		
				return bill + tipAmount;
			
			
		
		// I chose this bill+tip method as it is a real world and practical example.  	

			
			
			
			
			
			
			
			
		}
}