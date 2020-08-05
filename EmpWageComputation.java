public class EmpWageComputationProg
{
	public static void main(String args[])
	{
		//System.out.println("Welcome to Employee Wage Computation Program");
		final int IS_FULL_TIME=1;
		final int IS_PART_TIME=2;
		final int EMP_RATE_PER_HR=20;
		final int MAX_WORKINGS_DAYS=20;
		final int MAX_WORKING_HRS=10;
		int empHrs=0;
		int dailyWage=0;
		int totalEmpHrs=0;
		int workingDays=0;
		while(workingDays<MAX_WORKINGS_DAYS && totalEmpHrs<=MAX_WORKING_HRS)
		{
			workingDays++;
			double empCheck=Math.floor(Math.random()*10)%3;
			switch((int)empCheck)
      	{
         	case IS_FULL_TIME:
                  empHrs=8;
                  break;
         	case IS_PART_TIME:
                  empHrs=4;
                  break;
         	default:
                  empHrs=0;
                  break;
      	}
		totalEmpHrs+=empHrs;
		dailyWage+=empHrs;
		}
		System.out.println("Wage of Emp after "+MAX_WORKINGS_DAYS+" days is: "+dailyWage*EMP_RATE_PER_HR);
	}
}

