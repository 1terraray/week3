import java.util.Arrays;
import java.util.OptionalDouble;

public class week3 {

	public static void main(String[] args) {
		int [] age = {3, 9, 23, 23};
		
		//first value of array minus last value of array
		System.out.println(age[0]-(age[age.length-1]));
		
		
		//average sum of array
		int sum = 0;
		int length = age.length;
		int average = sum/length;
		for (int i = 0; i < age.length; i++) {
			sum += age[i];
		}
			average = sum /length;
			System.out.println (average);
			{
	
				
				
		//string array of names
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		
		//counts all of the characters in the string[]
		sum=0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
		}
		System.out.println ("Characters in all the names togeather "+sum);
		
		
		//average the characters in each name length
			average = sum / names.length;
			System.out.println ("The average characters in the string " +average);
		
		
		//concatenate the names together
			String namef = "";
			for (int i = 0; i < names.length; i++) {
				namef += names[i] + ", ";
				System.out.println (namef);
			}
			
			
		//access the last element of an array	
			System.out.println ("Last element "+names[names.length - 1]);
			
		//access the first element of an array
			System.out.println("First element "+names[0]);
			
		//new array of nameLengths = names array
			int [] nameLengths = new int[names.length];
			for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
			}
		//sum of all of the elements in the array
			sum = 0;
			for (int i = 0; i < nameLengths.length; i++) {
				sum += nameLengths[i];
			}
			System.out.println ("Sum of elements in the nameLengths array " 
					+ sum);
			}
			// print out the method below dupWord at n times
			int n = 7;
			System.out.println(dupWord("Hello " , n));
			
			//print out string fullName method
			String firstName = "Terra";
			String lastName = "Ray";
			String wholeName = fullName(firstName, lastName);
			System.out.println (wholeName);
			
			
			
			
			
			int [] ages = {3, 9, 23, 123};	
			System.out.println("100 greater " + practice(ages));
			
			double [] dates = {1.2, 2.7, 127.2};
			System.out.println ("Sum of double dates: "+ practice2(dates));
			
			double [] dates1 = {1.4, 3.7, 28.2};
			System.out.println ("is second array greater:  " + isFirstGreater (dates, dates1));
			
	}
	
	//method to repeat returned word (string), n (int) number of times
	public static String dupWord(String word, int n) {
		String dupWord = "";
		for (int i = 0; i <= n; i++) {
			dupWord += word;
		}
		return "dupWord method: " + dupWord;
	
	// method for two strings
	}
	public static String fullName(String x, String y) {
		return x +  " " + y;
		
	}
	
	//Write a method that takes an array of int and returns true if
	//the sum of all the ints in the array is grater than 100.
	public static boolean practice(int [] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum > 100;
	}
		
	
	//Method double array and returns the sum of all the elements in the array.
	public static double practice2 (double [] arr) {
		double sum = 0;
		double average = 0;
		for (int i = 0; i< arr.length; i++) {
			sum += arr [i];
			average = sum / arr.length;
		}
		return average;
	}
	
	//Method takes to arrays of double and returns true if the average of elements
	//in the first array is greater than the average of the elements in the second.
	public static double practice3 (double [] arr) {
		double sum = 0;
		double average = 0;
		for (int i = 0; i<arr.length; i++) {
			sum+=arr[i];
			average = sum / arr.length;
		}
		return average;
		
	}
	
	public static boolean isFirstGreater (double [] firstArr, double [] secondArr) {
		return practice2(firstArr) < practice3(secondArr);
	}
	
	
	
		
	
		
		
		
		
		
		
		
	
	
	
	
	
	

	
	
	
		
	
		
		
			
			
		
		
		
				
		
		
		

	
	
	}//end of main

}//end of class
