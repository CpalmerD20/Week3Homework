package week3;
import java.util.Arrays;

public class Assignment {
	//method for step 7
	public static String concatWordInt(String w, int n)  {
		String word = w;
		for (int i = 1; i < n; i++) {
			word = word + w;
		}	
		return word;
	}
	
	//method for step 8
	public static String makeFullName(String a, String b) {
		String c = a + " " + b;
		return c;
	}
	
	//method for step 9
	public static boolean isTrueIfOverHundred(int[] x) {
		int aSum = 0;
		for (int arrayVal : x) {
			aSum += arrayVal;
		}
		System.out.println("Step 9 Value: " + aSum);
		boolean gThanHundred = (aSum > 100);
		return gThanHundred;
	}
	
	//method for step 10
	public static double averageArray(double[] x) {
		double aSum = 0;
		for (double arrayVal : x) {
			aSum += arrayVal;
		}
		double arrayAve = aSum / x.length; 
		
		return arrayAve;
		
	}
	//method for step 11
	public static boolean averageTwoArrRetBoolean(double[] x, double[] y) {
		double arrayX = 0;
		for (double arrayValX : x) {
			arrayX += arrayValX;
		}
		double arrayY = 0;
		for (double arrayValY : y) {
			arrayY += arrayValY;
		}
		boolean f = arrayX/x.length > arrayY/y.length;
		return f;
	}	
	//method for step 12
	public static boolean willBuyDrink(boolean a, double b) {
		boolean c = a && b > 10.5;
		return c;
	}
	
	//13.	Create a method of your own that solves a problem. In comments,
	//write what the method does and why you created it.
	public static int dealDamage(int a, int b, double c) {
		int max = 1+a-b;
		int d = (int) (Math.random()*max+b);
		if (Math.random() < c) {
			d = d*2;
			System.out.println("Step 13: player deals " + d + " critical damage!");
		} else {
			System.out.println("Step 13: player deals " + d + " damage!");
		}
		return d;
	}
	
	public static void main(String[] args) {
//Step 1: Create an array of int called ages that 
//contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages;
		ages = new int[9]; 
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 25;
		ages[7] = 93;
		
//Step1a: Programmatically subtract the value of the first element in the array 	
//from the value in the last element of the array (i.e. do not use ages[7] in your code).
//Print result to console
		int lastMinusFirstA = ages[ages.length-2] - ages[ages.length - ages.length];
		
		System.out.println("Step 1a: " + lastMinusFirstA);
//Step1b: Add a new age to your array and repeat the step above 
//to ensure it is dynamic (works for arrays of different lengths).
		ages[8] = 33;
		int lastMinusFirstB = ages[ages.length-1] - ages[ages.length - ages.length];
		System.out.println("Step 1b: " + lastMinusFirstB);
		
		//int ages2 = ages.push(54,66); keep getting error
		

//Step1c: Use a loop to iterate through the array and calculate the average age.
//Print the result to the console.
		int numeratorC = 0;
		for(int index = 0; index < ages.length; index++) {
			numeratorC += ages[index];
		}
		int averageC = numeratorC / ages.length;
		System.out.println("Step 1c: " + averageC);
		
//Step 2: Create an array of String called names that contains the following values: 
//“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
//Step 2a: Use a loop to iterate through the array and calculate the   
//average number of letters per name. Print results to console. (23)
		int letterCount = 0;
		for (int ind = 0; ind < names.length; ind++) {
		String name = names[ind];
		for (int i = 0; i < name.length(); i++) {
			if(Character.isLetter(name.charAt(i)))
				letterCount++;
		}
		}
			int averageLetter = letterCount / names.length;
			System.out.println("Step 2a: " + averageLetter);
			
//Step 2b: Use a loop to iterate through the array again and concatenate all the names 
//together, separated by spaces, and print the result to the console.
		String allNames = "Step 2b: ";
		for (String x : names) {
				allNames += x + " ";
		}
		System.out.println(allNames);
//	Step 3.	How do you access the last element of any array?
		System.out.println("Step 3: How do you access the last element of any array?");
		System.out.println("  Answer: anyArray[anyArray.length - 1]");
//	Step 4.	How do you access the first element of any array?
		System.out.println("Step 4: How do you access the first element of any array?");
		System.out.println("  Answer: anyArray[0]");
		
//	Step 5.	Create a new array of int called nameLengths. Write a loop to 
//	iterate over the previously created names array and add the 
//	length of each name to the nameLengths array.	
		int[] nameLengths = new int[names.length];
		
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		System.out.println("Step 5: " + Arrays.toString(nameLengths));
//Step 6.	Write a loop to iterate over the nameLengths array and 
//calculate the sum of all the elements in the array. 
//Print the result to the console.
		int sumNames = 0;
		for (int y : nameLengths) {
			sumNames += y; 
		}
		System.out.println("Step 6: " + sumNames);

//Step 7. Write a method that takes a String, word, and an int, n, as arguments 
//and returns the word concatenated to itself n number of times. 
//(i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
		//public static int concatWordInt(String word, int n)  {
		String word = "Hello";
		int n  = 3;
		String abc = concatWordInt(word,n);
		System.out.println("Step 7: " + abc);
		
//Step 8.	Write a method that takes two Strings, firstName and lastName, 
//and returns a full name (the full name should be the first and the last
//name as a String separated by a space).		
		String firstName = "Bill";
		String lastName = "Murray";
		
		String fullName = makeFullName(firstName, lastName);
		System.out.println("Step 8: " + fullName);

//Step 9.	Write a method that takes an array of int and returns 
//true if the sum of all the ints in the array is greater than 100.
		int[] stepNineArray = {20, 20, 20, 20, 20};
		boolean greaterTest1 = isTrueIfOverHundred(stepNineArray);
		System.out.println("Step 9 Boolean: " + greaterTest1);
		
		int[] step9Array = {20, 20, 20, 20, 21};
		boolean greaterTest2 = isTrueIfOverHundred(step9Array);
		System.out.println("Step 9 Boolean: " + greaterTest2);
		
//10.	Write a method that takes an array of double and 
//returns the average of all the elements in the array.
		double[] partTen = {10.5, 20.7, 30.8};
		double averagePartTen = averageArray(partTen);
		System.out.println("Step 10: " + averagePartTen);
		
//11.	Write a method that takes two arrays of double and returns true 
//if the average of the elements in the first array is greater than the 
//average of the elements in the second array.
		double[] partElevenA = {5.5, 6.6, 7.7, 8.9};
		double[] partElevenB = {5.5, 6.6, 7.7, 8.8};
		boolean checkPartEleven = averageTwoArrRetBoolean(partElevenA, partElevenB);
		System.out.println("Step 11: " + checkPartEleven);
		
		double[] partElevenC = {5.5, 6.6, 7.7, 8.8};
		double[] partElevenD = {5.5, 6.6, 7.7, 8.8};
		boolean checkPart11 = averageTwoArrRetBoolean(partElevenC, partElevenD);
		System.out.println("Step 11: " + checkPart11);
		
//12.	Write a method called willBuyDrink that takes a boolean isHotOutside,
//and a double moneyInPocket, and returns true if it is hot outside and 
//if moneyInPocket is greater than 10.50.
		boolean isHotOutside = true;
		double moneyInPocket = 11.11;
		boolean buyDrink = willBuyDrink(isHotOutside, moneyInPocket);
		System.out.println("Step 12: " + buyDrink);

//13.	Create a method of your own that solves a problem. In comments,
//write what the method does and why you created it.
		//Create a method to deals damage for a game
		//Each character has stats for max damage, min damage, and critical chance
		//when damage is critical, it is doubled and can exceed max damage.
		//the method uses RNG to interact with the parameters
		//to give the expected results from the character sheet
		
		//I created this because I wanted to see what would have to be done on the 
		//back end to allow the user to see correct information in the GUI
		//The use would see max damage, but the method has to manipulate that stat
		//behind the scenes for the game to make sense 
		//(this wouldn't work as intended if the method was using the wrong instructions)
		int maxDamage = 7;
		int minDamage = 5;
		double critChance = 0.5;
		int damageDealt = dealDamage(maxDamage,minDamage,critChance);
		
	}
}

