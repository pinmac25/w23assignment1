package w23assignment1;

import java.time.LocalDate;
/* File name: Patient.java
 * Course: 23W CST8284-312 Java Programming
 * Assignment: Lab Assignment 1
 * Due: Monday, June 19, 2023
 * Professor: Daniel Cormier
 * Purpose: This class maintains important health information about a patient.
 */
/**
 * @author Marina Pineda
 * @see w23assignment1.MyHealthDataTest
 * @see w23assignment1.MyHealthDataTest2
 * @version 1
 * @since JDK 1.8
 *
 */

//TO DO 1: INCLUDE YOUR ATTRIBUTES HERE. REMEMBER TO CHECK THE UML CLASS DIAGRAM TO INCLUDE ALL ATTRIBUTES LISTED AND THEIR TYPES.


//START CODE
public class Patient {
	private String firstName;
	private String lastName;
	private String gender;
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	private double height;
	private double weight;

//END CODE


//TO DO 2: INCLUDE YOUR CONSTRUCTOR HERE 
//START CODE
	/**
	 * 
	 * @param firstName Patient's first name
	 * @param lastName Patient's last name
	 * @param gender Patient's gender
	 * @param birthYear Patient's year of birth
	 * @param birthMonth Patient's month of birth
	 * @param birthDay Patient's day of birth
	 * @param height Patient's height
	 * @param weight Patient's weight
	 */
	public Patient(String firstName, String lastName, String gender, int birthYear, int birthMonth, int birthDay, double height, double weight) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setGender(gender);
		this.setBirthYear(birthYear);
		this.setBirthMonth(birthMonth);
		this.setBirthDay(birthDay);
		this.setHeight(height);
		this.setWeight(weight);
	}
//END CODE


//TO DO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS TO ENSURE ALL ARE COMPLETE. SOME ARE ALREADY PROVIDED FOR YOU BELOW.


//THIS RETURNS THE PATIENT'S Body Mass Index (BMI) AND IT IS PROVIDED HERE FOR YOU. DO NOT CHANGE THIS PIECE OF CODE!
/**
 * 
 * @return First name
 */
	public String getFirstName() {
		return firstName;
	}
/**
 * 
 * @param firstName Sets the patient's first name
 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
/**
 * 
 * @return Last name
 */
	public String getLastName() {
		return lastName;
	}
/**
 * 
 * @param lastName Sets the patient's last name
 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
/**
 * 
 * @return Gender
 */
	public String getGender() {
		return gender;
	}
/**
 * 
 * @param gender Sets the patient's gender
 */
	public void setGender(String gender) {
		this.gender = gender;
	}
/**
 * 
 * @return Birth year
 */
	public int getBirthYear() {
		return birthYear;
	}
/**
 * 
 * @param birthYear Sets the patient's year of birth
 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
/**
 * 
 * @return Birth month
 */
	public int getBirthMonth() {
		return birthMonth;
	}
/**
 * 
 * @param birthMonth Sets the patient's birth month
 */
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
/**
 * 
 * @return Birth day
 */
	public int getBirthDay() {
		return birthDay;
	}
/**
 * 
 * @param birthDay Sets the patient's day of birth 
 */
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
/**
 * 
 * @return Height
 */
	public double getHeight() {
		return height;
	}
/**
 * 
 * @param height Sets the patient's height 
 */
	public void setHeight(double height) {
		this.height = height;
	}
/**
 * 
 * @return Weight
 */
	public double getWeight() {
		return weight;
	}
/**
 * 
 * @param weight Sets the patient's weight
 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
/**
 * Method that calculates and returns the patient's age using the difference between the current year and patient's birth year
 * @return Age
 */
	public int calculateAge() {
		return (LocalDate.now().getYear() - getBirthYear());
	}
/**
 * 	Method that calculates the patient's maximum heart rate using the formula 220 - patient age
 * @return Maximum heart rate
 */
	public int calcMaxHeartRate() {
		int age = calculateAge();
		return (220 - age);
	}
/**
 * Method that calculates the patient's minimum target heart rate using 50% of the calculated maximum heart rate 
 * @return Minimum target heart rate
 */
	public double calcMinTargetHR() {
		int maxHR = calcMaxHeartRate();
		return (maxHR * 0.5);
	}
/**
 * Method that calculates the patient's maximum target heart rate using 85% of the calculated maximum heart rate 
 * @return Maximum target heart rate
 */
	public double calcMaxTargetHR() {
		int maxHR = calcMaxHeartRate();
		return (maxHR * 0.85);
	}
/**
 * Method that calculates the patient's Body Max Index 
 * @return Body Mass Index
 */
	public double getBMI() {
		return (getWeight() * 703) / (getHeight() * getHeight());
	} 

//TO DO 4: THIS PORTION OF CODE SHOULD DISPLAY ALL THE PATIENT'S HEALTH DATA. DO NOT MISS ANY DATA / INFORMATION
/**
 * Method that displays all of the data as one patient health record
 */
	public void displayMyHealthData() { 

//TO DO 5: HINT: YOU MUST USE System.out.printf TO SHOW ALL HEALTH DATA. DO NOT MISS ANY ITEM.
 
//START CODE
System.out.println("Patient Health Record: ");
System.out.printf("First Name: %s\n", getFirstName());
System.out.printf("Last Name: %s\n", getLastName());
System.out.printf("Gender: %s\n", getGender());
System.out.printf("Date of Birth: %d-%d-%d\n", getBirthYear(), getBirthMonth(), getBirthDay());
System.out.printf("Age: %d\n", calculateAge());
System.out.printf("Height: %.2f inches\n", getHeight());
System.out.printf("Weight: %.2f lbs\n", getWeight());
System.out.printf("BMI: %.2f\n", getBMI());
System.out.printf("Maximum Heart rate: %d bpm\n", calcMaxHeartRate());
System.out.printf("Target Heart rate range: %.1f bpm - %.1f bpm\n", calcMinTargetHR(), calcMaxTargetHR());

//END CODE
 
//DO NOT MODIFY THIS PROTION OF CODE. IT SHOULD PRINT AS IT IS - ALREADY PROVIDED FOR YOU!!

 System.out.println("BMI VALUES");
 System.out.println("Underweight: less than 18.5");
 System.out.println("Normal:      between 18.5 and 24.9");
 System.out.println("Overweight:  between 25 and 29.9");
 System.out.println("Obese:       30 or greater");   
 
} 
	

} // end class Patient



