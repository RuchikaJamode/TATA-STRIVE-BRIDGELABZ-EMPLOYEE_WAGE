package com.bridgelabz.employeewage;

public class main {
	  private int fullTimeHours = 8;
	    private int partTimeHours = 4;
	    private int fullTimeWagePerHour = 20;
	    private int partTimeWagePerHour = 10;
	    private int totalWorkingHours = 100;
	    private int totalWorkingDays = 20;

	    public void computeWage() {
	        int currentHours = 0;
	        int currentDays = 0;
	        int totalWage = 0;

	        while (currentHours < totalWorkingHours && currentDays < totalWorkingDays) {
	            currentHours += fullTimeHours;
	            currentDays++;
	            totalWage += fullTimeWagePerHour * fullTimeHours;
	        }

	        System.out.println("Total Working Days: " + currentDays);
	        System.out.println("Total Working Hours: " + currentHours);
	        System.out.println("Total Wage till condition met: " + totalWage);
	    }
}
