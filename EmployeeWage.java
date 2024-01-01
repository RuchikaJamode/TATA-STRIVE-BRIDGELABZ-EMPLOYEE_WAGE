package com.bridgelabz.employeewage;
import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("welcome to employeewage computational program");
uc1();
	}


public static void uc1() {
    // Create an instance of the Random class
    Random rand = new Random();

    // Generate a random number (0 or 1) to represent present or absent
    int attendance = rand.nextInt(2); // Generates a random number between 0 (inclusive) and 2 (exclusive)

    // Check if the employee is present or absent based on the random number
    if (attendance == 1) {
        System.out.println("Employee is Present");
    } else {
        System.out.println("Employee is Absent");
    }
}
}
