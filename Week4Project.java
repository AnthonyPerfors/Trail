package com.promineotech;   //Anthony Perfors

public class Week4Project {

	public static void main(String[] args) {
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};  //This makes my array of 8 values
		
		System.out.println(subtract(ages));  //See method Subtract below
		
		int [] agesUpdated = { 1, 2, 3, 4, 5, 6, 7, 8, 9}; // The new array with 9 elements 
		
		System.out.println(subtract(agesUpdated));  //See method Subtract below
		int average; //To make our average and sum 
		int sum = 0;
		for (int i = 0; i < ages.length; i++) {  //for loop that will add the ages[] together into sum giving us a total 
			
			 sum += ages[i];
			
		}
		average = sum / ages.length;  //taking the sum of the ages[] and dividing it by how many or the length 
		
		System.out.println(average);  //Printing out the average to the console
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};  //our array of names   23 characters 
		
		int namesTotal = 0;   //To make our average and sum 
		int namesAverage;
		for(int i = 0; i < names.length; i++) {   //for loop to count the length of characters in each word inside the array 
			
			namesTotal += names[i].length();  // to find the total characters inside the string array 
			
		}
		namesAverage = namesTotal / names.length;  //finding the average 
		System.out.println(namesAverage); //Printing out the average to the console
		
		for(String name : names) {    // advanced for loop to concatenate the names together
			System.out.print(name + " ");
		}
		//3. to access the last element in an array you would take the length of the array and subtract 1
		//4. To access the first element of an array you would just put 0 as your index
		
		int[] namesLengths = new int [names.length];  //5. to create a new array with the length of the names 
		
		for(int i = 0; i < names.length; i++) {
			
			namesLengths[i] = names[i].length();  //namesLengths array will now be the length of each name
		}
		
		int totalNamesLength = 0;  //to find the total
		for(int num : namesLengths) {  
			totalNamesLength += num;   //6. To calculate the sum or the words total
		}
		
		System.out.println("\n" + totalNamesLength);  // print total to console
		
		System.out.println(multiWord("Hello", 3));  //7. Example of hello printing 3 times from method
		
		System.out.println(fullName("Anthony", "Perfors"));  //8. See method below this will print my full name
		
		System.out.println(greaterThan(ages));  // Should return true as greater than 100
		System.out.println(greaterThan(agesUpdated));  // Should return false as less than 100
		
		System.out.println(willBuyDrink(true, 10.60)); //12
	}
	
public static String multiWord(String name, int n) {   //7. method that returns a string and repeats it n number of times 
	
	return name.repeat(n);
	}
	
	public static  int subtract(int[] array) {  // 1a-bThis method takes in an int array
		
		int[] result = new int[array.length];   //Generates a new array to 
		int count = 0;             //to make the index 
		for(int num : array) {           // advanced for loop
			result[count] = num;   //This will make the number from the array[0] equal to the new array result[0]
			count++;           // To continue to the next index 
		}
		
		 return result[0] - result[result.length-1];  //The result that will be pulled
		
	}
public static String fullName(String firstName, String lastName) {  //8. method to take in two strings and combine them 
		
		return firstName + " " + lastName;
	}
public static boolean greaterThan(int[] array) {  // 9. method to take a int array and see if total is greater than 100
	int sum = 0; //initialize the sum
	for(int num : array) {
		sum += num;  //for each number in the array it will add to the sum 
	}
	
	if(sum <= 100) {  //if the sum is less than or equal to 100 return false as its not greater than 100
		return false;
	}
	return true;  //if greater than 100 return true 
}
public static double average(double[] number) { // 10. This method would take in a double array and find the average 
	double sum = 0;
	for(double num : number) {
		sum += num;
	}
	return sum / number.length;
}
public static boolean greaterAverage(double[] first, double[]second) { //11. this is taking in average of 2 array and seeing if first array is greater
	double sum1 = 0;  // to find the sum and average 
	double sum2 = 0;
	double averageFirst, averageSec;
	
	for(double num : first) {  //finding the sum of the first array
		sum1 =+ num;
	}
	for(double num : second) {  //finding the sum of the second array 
		sum2 =+ num;
	}
	averageFirst = sum1/first.length;  //finding the averages of both 
	averageSec = sum2/second.length;
	
	if(averageFirst > averageSec) {  //if first array is > than second array return true if not false
		return true;
	}else {
		return false;
	}
}
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket){  //12. method to determine if you should buy a drink 
		
		if(isHotOutside && moneyInPocket > 10.50) {  //if isHotOutside is true and moneyInPocket is greater than 10.50 you will buy a drink (true)if not false
			return true;
		}
			return false;
	}
	
	public static boolean isPalindrome(String x) {  //13. this checks to see if a word is a palindrome  
		String toLower = x.toLowerCase();  //First if puts the string into lowercase to make sure all characters are the same
		for (int i = 0; i < toLower.length() / 2; i++)   //This take the string length and keep repeating as for the half as many characters 
			if(toLower.charAt(i) != toLower.charAt(toLower.length() - i -1)) {  //in the string so 7 would do it 3 times as the middle would be the same
				return false;   //This checks to see if the character in index 0 is the same as the last character if so it continues until its false or passes
			}
		return true;
		
	}
	
}

