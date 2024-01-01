package com.bridgelabz.employeewage;
import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("welcome to employeewage computational program");
uc1();
uc2();
uc3();
uc4();
uc5() ;
uc6();
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
    public static void uc2() {
        int wagePerHour = 20;
        int fullDayHours = 8;

        // Calculate daily wage
        int dailyWage = wagePerHour * fullDayHours;

        // Display the daily wage
        System.out.println("Daily Employee Wage: " + dailyWage);
    }

public static void uc3() {
    int wagePerHour = 20;
    int fullDayHours = 8;
    int partTimeHours = 4; // Assuming part-time hours are 4

    // Calculate daily wages for full-time and part-time employees
    int fullTimeWage = wagePerHour * fullDayHours;
    int partTimeWage = wagePerHour * partTimeHours;

    // Display the daily wages for full-time and part-time employees
    System.out.println("Full-time Employee Daily Wage: " + fullTimeWage);
    System.out.println("Part-time Employee Daily Wage: " + partTimeWage);
}
public static void uc4() {
    int fullTimeHours = 8;
    int partTimeHours = 4;
    int fullTimeWagePerHour = 20;
    int partTimeWagePerHour = 10;

    int employeeType = 1; // 1 for full-time, 2 for part-time

    switch (employeeType) {
        case 1:
            // Calculate full-time employee wage
            int fullTimeWage = fullTimeWagePerHour * fullTimeHours;
            System.out.println("Full-Time Employee Wage: " + fullTimeWage);
            break;
        case 2:
            // Calculate part-time employee wage
            int partTimeWage = partTimeWagePerHour * partTimeHours;
            System.out.println("Part-Time Employee Wage: " + partTimeWage);
            break;
        default:
            System.out.println("Invalid Employee Type");
    }
}
    public static void uc5() {
        int fullTimeHours = 8;
        int partTimeHours = 4;
        int fullTimeWagePerHour = 20;
        int partTimeWagePerHour = 10;
        int workingDaysPerMonth = 20;

        // Calculate monthly wages for full-time employee
        int fullTimeMonthlyWage = fullTimeWagePerHour * fullTimeHours * workingDaysPerMonth;
        System.out.println("Monthly Wage for Full-Time Employee: " + fullTimeMonthlyWage);

        // Calculate monthly wages for part-time employee
        int partTimeMonthlyWage = partTimeWagePerHour * partTimeHours * workingDaysPerMonth;
        System.out.println("Monthly Wage for Part-Time Employee: " + partTimeMonthlyWage);
    }

public static void uc6() {
    int fullTimeHours = 8;
    int partTimeHours = 4;
    int fullTimeWagePerHour = 20;
    int partTimeWagePerHour = 10;
    int totalWorkingHours = 100;
    int totalWorkingDays = 20;

    int currentHours = 0;
    int currentDays = 0;
    int totalWage = 0;

    // Loop to calculate wages until conditions are met
    while (currentHours < totalWorkingHours && currentDays < totalWorkingDays) {
        currentHours += fullTimeHours;
        currentDays++;

        // Calculate wages for full-time employee
        totalWage += fullTimeWagePerHour * fullTimeHours;
    }

    System.out.println("Total Working Days: " + currentDays);
    System.out.println("Total Working Hours: " + currentHours);
    System.out.println("Total Wage till condition met: " + totalWage);
}
}

