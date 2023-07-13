package w23assignment1;
/* File name: MyHealthDataTest2.java
 * Course: 23W CST8284-312 Java Programming
 * Assignment: Lab Assignment 1
 * Due: Monday, June 19, 2023
 * Professor: Daniel Cormier
 * Purpose: This class uses the getBMI() method to test different inputs and outputs. The first test shows a successful 
 * execution while the second shows a failed execution. Both tests assume that the expected BMI values are accurate and that the BMI 
 * formula is correct. Then it retrieves the actual BMI value from the Patient class and compares the difference against
 * an Epsilon. It prints the patient's health record and displays whether the BMI calculation is accurate. 
 */
/**
 * @author Marina Pineda
 * @see w23assignment1.Patient
 * @see w23assignment1.MyHealthDataTest
 * @version 1
 * @since JDK 1.8
 *
 */
public class MyHealthDataTest2 {
	/**
	 * This is the main entry point for the program
	 * @param args An array of command line arguments
	 */
	public static void main(String[] args) {
		//Test case 1 with successful execution 
		//Constructor creates new patient object 
		Patient patient1 = new Patient("Peter", "Griffin", "Male", 1978, 5, 18, 70, 250);
		double expectedBMI1 = 35.87;
		double actualBMI1 = patient1.getBMI(); {
		
		patient1.displayMyHealthData(); 
		//Compares the actual BMI and expected BMI value difference to an Epsilon value of 0.01
			if (Math.abs(expectedBMI1 - actualBMI1) < 0.01) {
				System.out.println("Test 1 successful. BMI calculation is accurate.");
			} else {
				System.out.println("Test 1 failed. BMI calculation is inaccurate.");
			}
		}	
		
		System.out.println();
		//Test case 2 with unsuccessful execution
		//Constructor creates new patient object	
		Patient patient2 = new Patient("Lois", "Griffin", "Female", 1980, 4, 22, 68, 135);
		double expectedBMI2 = 20.57; //intentionally incorrect. Out of range by value of 0.05.
		double actualBMI2 = patient2.getBMI(); {
		
		patient2.displayMyHealthData(); 
		//Compares the actual BMI and expected BMI value difference to an Epsilon value of 0.01
			if (Math.abs(expectedBMI2 - actualBMI2) < 0.01) {
				System.out.println("Test 2 successful. BMI calculation is accurate.");
			} else {
				System.out.println("Test 2 unsuccessful. BMI calculation is inaccurate.");
			}
		}
		 System.out.println();
		 System.out.println("Program by Marina Pineda");
	}
}