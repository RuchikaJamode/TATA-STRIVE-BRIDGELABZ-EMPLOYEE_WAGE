package com.bridgelabz.employeewage;

public class main {
	  private int fullTimeHours = 8;
	    private int partTimeHours = 4;
	    private int fullTimeWagePerHour = 20;
	    private int partTimeWagePerHour = 10;
	    private int totalWorkingHours = 100;
	    private int totalWorkingDays = 20;
		private int wagePerHour;

	    public main(int i, int j, int k, int l) {
			// TODO Auto-generated constructor stub
		}



		public main() {
			// TODO Auto-generated constructor stub
		}



		public void computeWage() {
	        int currentHours = 0;
	        int currentDays = 0;
	        int totalWage1 = 0;

	        while (currentHours < totalWorkingHours && currentDays < totalWorkingDays) {
	            currentHours += fullTimeHours;
	            currentDays++;
	            totalWage1 += fullTimeWagePerHour * fullTimeHours;
	        }

	        System.out.println("Total Working Days: " + currentDays);
	        System.out.println("Total Working Hours: " + currentHours);
	        System.out.println("Total Wage till condition met: " + totalWage1);
		}

		
		
		public static int computeWage(int companyCode, int totalWorkingDays, int totalWorkingHours) {
	        int wagePerHour;
	        int fullTimeHours;
	        int totalWage = 0;

	        if (companyCode == 1) {
	            wagePerHour = 20;
	            fullTimeHours = 8;
	        } else if (companyCode == 2) {
	            wagePerHour = 25;
	            fullTimeHours = 7;
	        } else {
	            // Default values if company code is invalid
	            wagePerHour = 0;
	            fullTimeHours = 0;
	            System.out.println("Invalid company code!");
	            return totalWage;
	        }

	        int currentHours = 0;
	        int currentDays = 0;

	        while (currentHours < totalWorkingHours && currentDays < totalWorkingDays) {
	            currentHours += fullTimeHours;
	            currentDays++;
	            totalWage += wagePerHour * fullTimeHours;
	        }

	        System.out.println("Total Working Days: " + currentDays);
	        System.out.println("Total Working Hours: " + currentHours);
	        System.out.println("Total Wage till condition met: " + totalWage);

	        return totalWage;
	    }
}

    

