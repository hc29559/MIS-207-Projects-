package assignment1;
import java.util.Scanner;
public class TaxReturn {
public static void main(String[] args) {
	final double rate1=0.15;
	final double rate2=0.28;
	final double rate3=0.31;
	final double single_bracket1=21450.0;
	final double single_bracket2=51900.0;
	final double married_bracket1=35800.0;
	final double married_bracket2=86500.0;
	double tax1=0.0;
	double tax2=0.0;
	double tax3=0.0;
	int dependents=0;
	double income=0;
	double yourIncome=0;
	double spouseIncome=0;
	System.out.print("Enter your filing status (single or married): ");
	Scanner myInput= new Scanner(System.in);
	String status= myInput.next();
	final String status1= "single";
	final String status2= "married";
	if(!status.equals(status1) && !status.equals(status2))
    {System.out.print("Invalid filing status input.");
     System.exit(-1);
  	}//end in invalid single or married input 
     if(status.contentEquals(status1)) 
     {System.out.print("Enter your annual income: ");
     if (myInput.hasNextDouble()) 
     {income= myInput.nextDouble();}
     else {System.out.print("Invalid income input");
     System.exit(-1);}
     if (income==0) 
    	  {double totalTax=tax1+tax2+tax3;
          System.out.printf("%-13s", "Filing");
          System.out.printf("%-25s","Annual Gross Income");
          System.out.printf("%-18s","Dependents");
          System.out.printf("%-12s","Tax Owed");
          System.out.println();
          System.out.printf("%-13s", status);
          System.out.printf("%,-25.2f", income);
          System.out.printf("%-18d", dependents);
          System.out.printf("%,-12.2f",totalTax);
    	   System.exit(-1);}
    	 if (income<0) 
    	  {System.out.println("Invalid income input");
    	   System.exit(-1);}//end if invalid income input 
    	 else 
    	  {System.out.print("Enter your number of dependents: ");
    	   if(myInput.hasNextInt()) 
    	    {dependents= myInput.nextInt();}
    	   else {System.out.print("Invalid dependent input");
    	         System.exit(-1);
    	   }//end checking if dependent is type int
    	   if (dependents<0) 
    	    {System.out.println("Invalid dependents input");
    		 System.exit(-1);}//invalid dependents input
    	   double exemptions= dependents+1;
    	   if (exemptions<5) 
    	    {exemptions= exemptions*5000;}//exemptions times 4500
    	   else {exemptions= exemptions*4500;}//exemption times 5000
    	   double adjustedIncome= income-exemptions;
    	   if (adjustedIncome==0) 
    	    {double totalTax=0;
            System.out.printf("%-13s", "Filing");
            System.out.printf("%-25s","Annual Gross Income");
            System.out.printf("%-18s","Dependents");
            System.out.printf("%-12s","Tax Owed");
            System.out.println();
            System.out.printf("%-13s", status);
            System.out.printf("%,-25.2f", income);
            System.out.printf("%-18d", dependents);
            System.out.printf("%-12.2f", totalTax);}//if adjustedIncome is 0
    	   if (adjustedIncome<=single_bracket1) 
    	    {tax1= rate1*adjustedIncome;}//single bracket 1
    	   else if (adjustedIncome<=single_bracket2) 
    	    {tax1= rate1*single_bracket1;
    	     tax2= rate2*(adjustedIncome-single_bracket1);}// btw single bracket 2
    	   else 
    	    {tax1= rate1*single_bracket1;
    	     tax2= rate2*(adjustedIncome-single_bracket1);
    	     tax3= rate3* (adjustedIncome-single_bracket2);}// above single bracket 2
    	   }//valid income input
    	 double totalTax=tax1+tax2+tax3;
    	 if (totalTax<0) 
    	 {totalTax=0;
         System.out.printf("%-13s", "Filing");
         System.out.printf("%-25s","Annual Gross Income");
         System.out.printf("%-18s","Dependents");
         System.out.printf("%-12s","Tax Owed");
         System.out.println();
         System.out.printf("%-13s", status);
         System.out.printf("%,-25.2f", income);
         System.out.printf("%-18d", dependents);
         System.out.printf("%-12.2f", totalTax);
    	 }//if tax owed is 0 
    	 
    	 if(totalTax>0)
         {System.out.printf("%-13s", "Filing");
         System.out.printf("%-25s","Annual Gross Income");
         System.out.printf("%-18s","Dependents");
         System.out.printf("%-12s","Tax Owed");
         System.out.println();
         System.out.printf("%-13s", status);
         System.out.printf("%,-25.2f", income);
         System.out.printf("%-18d", dependents);
         System.out.printf("%,-12.2f",totalTax);}//end if total tax >0
    	  }//end if single
     if (status.contentEquals(status2)) 
     {System.out.print("Enter your annual income: ");
     if (myInput.hasNextDouble()) 
     {yourIncome= myInput.nextDouble();}
     else 
      {System.out.print("Invalid income input");
       System.exit(-1);
      }
     if (yourIncome<0) 
	  {System.out.println("Invalid income input");
	   System.exit(-1);}//end if invalid yourIncome input 
     else 
     {System.out.print("Enter your spouse's annual income: ");}
      if(myInput.hasNextDouble()) 
      {spouseIncome= myInput.nextDouble();}
      else {System.out.print("Invalid income input");
      System.exit(-1);}
      if (spouseIncome<0) 
	  {System.out.println("Invalid income input");
	   System.exit(-1);}//end if invalid income input 
      income= yourIncome+spouseIncome;
      if (income==0) 
       {System.out.println("Tax owed is 0");
        System.exit(-1);}//if 0 income
      if (income<0) 
	   {System.out.println("Invalid income input");
	    System.exit(-1);}//end if invalid income input 
      else 
	   {System.out.print("Enter your number of dependents: ");
	   if(myInput.hasNextInt()) 
	    {dependents= myInput.nextInt();}
	   else {System.out.print("Invalid dependent input");
	         System.exit(-1);
	   }//end checking if dependent is type int
	    if (dependents<0) 
	     {System.out.println("Invalid dependents input");
		  System.exit(-1);}//invalid dependents input
	    double exemptions= dependents+2;
	    if (exemptions<5) 
	     {exemptions=exemptions*5000;}//exemptions times 5000
	    else 
	     {exemptions=exemptions*4500;}//exemptions times 4500
	    double adjustedIncome= income-exemptions;
	    if (adjustedIncome<=married_bracket1) 
	     {tax1= rate1*adjustedIncome;}//married bracket 1
	    else if (adjustedIncome<=married_bracket2) 
	     {tax1= rate1*married_bracket1;
	      tax2= rate2*(adjustedIncome-married_bracket1);}// btw married bracket 2
	    else 
	     {tax1= rate1*married_bracket1;
	      tax2= rate2*(adjustedIncome-married_bracket1);
	      tax3= rate3*(adjustedIncome-married_bracket2);}// above married bracket 2
      }//end if married 
      double totalTax=tax1+tax2+tax3;
      System.out.printf("%-13s", "Filing");
      System.out.printf("%-25s","Annual Gross Income");
      System.out.printf("%-18s","Dependents");
      System.out.printf("%-12s","Tax Owed");
      System.out.println();
      System.out.printf("%-13s", status);
      System.out.printf("%,-25.2f", income);
      System.out.printf("%-18d", dependents);
      System.out.printf("%,-12.2f",totalTax);
      
      
    } 
}//end main method 
}//end class TaxReturn 
