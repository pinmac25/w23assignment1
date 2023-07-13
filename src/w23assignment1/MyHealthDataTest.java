package w23assignment1;

import java.util.Scanner;
/*
 * File name: MyHealthDataTest.java
 * Course: 23W CST8284-312 Java Programming
 * Assignment: Lab Assignment 1
 * Due: Monday, June 19, 2023
 * Professor: Daniel Cormier
 * Purpose: This class accepts user input and calls the method from class Patient to display the patient's health record. 
 */
/**
 * @author Marina Pineda
 * @see w23assignment1.Patient
 * @see w23assignment1.MyHealthDataTest2
 * @version 1
 * @since JDK 1.8
 *
 */

public class MyHealthDataTest {
	
	/**
	 * This is the main entry point for the program
	 * @param args An array of command line arguments
	 */
	public static void main(String[] args) {
		

		Scanner keyboard = new Scanner(System.in);
		
		//Accepts user input entered by the patient
		System.out.println("Enter first name: ");
		String firstName = keyboard.nextLine();
		
		System.out.println("Enter last name: ");
		String lastName = keyboard.nextLine();
		
		System.out.println("Enter gender: ");
		String gender = keyboard.nextLine();
		
		System.out.println("Enter birth year (0000) : ");
		int birthYear = keyboard.nextInt();
		
		System.out.println("Enter birth month (00): ");
		int birthMonth = keyboard.nextInt();
		
		System.out.println("Enter birth day (00): ");
		int birthDay = keyboard.nextInt();
		
		System.out.println("Enter height in inches: ");
		double height = keyboard.nextDouble();
		
		System.out.println("Enter weight in lbs: ");
		double weight = keyboard.nextDouble();
		
		//Constructor that creates a new instance of the Patient class
		Patient patient = new Patient(firstName, lastName, gender, birthYear, birthMonth, birthDay, height, weight);
		
		//Calls the display health data method from the Patient class to print the patient's health report
		patient.displayMyHealthData();
		
		System.out.println();
		System.out.println("Program by Marina Pineda");
	}
}
