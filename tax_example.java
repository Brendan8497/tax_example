/***
	
	Name: Brendan Ryan
	Date: 10/9/2017
	File Name: tax_example.java
	
	Purpose: This program calculates for the user's taxes and income using the
			new tax laws. It first asks the user for their Social Security
			Number (SSN), and then initializes an if statement checking to see if
			the SSN is not 0. If it is 0, an else statement is run and "Goodbye!"
			is printed to the screen. If SSN is not 0, a while loop checks the same
			thing. An if statement is started on the first iteration of the
			loop that asks for the user's exemptions amount and checks the
			validity of the data, then asks for the filing status. A while
			loop is initialized if the filing status is not 'S', 'J', or 'M',
			and the user is asked to re enter their filing status until valid
			data is entered. When valid data is entered, the program asks the
			user for their gross income and calculates for their taxable income.
			A switch is then initialized that calculates the
			user's tax rate and tax amount based on their filing status,
			gross income, the Standard Deduction, and the number of exemptions.
			After all the data has been input and calculated for, the
			SSN, Taxable Income, Tax Rate, and Tax Amount are all displayed to
			the screen. The user is then asked for their SSN again. If
			the SSN is 0, "Goodbye is displayed to the screen." If the SSN
			is not zero, user is asked for number of exemptions and filing
			status again, checking for the validity of both after data is
			input. While loop reiterates, skipping the first if statement
			after the first iteration. Program continues until the value
			SSN is set to 0 by the user.
			

***/

import java.util.Scanner; // imports the java.util.Scanner class
import java.text.DecimalFormat; // imports the DecimalFormat class to the program

public class tax_example

{
	
	// defines the standard deduction as a constant with the value of 5000
	public static final double STANDARD_DEDUCTION = 5000;
	
	public static void main(String[] args)  
	
	{
		
		// integers exemptions and loop_count declared and initialized to 0. SSN declared.
		int exemptions = 0, SSN, loop_count = 0;
		// doubles taxable_income and gross_income declared. Tax_rate and
		// tax_amount declared and initialized to 0.00
		double taxable_income, gross_income, tax_rate = 0.00, tax_amount = 0.00;
		// char filing_status is set to 'A' by default
		char filing_status = 'A';
		Scanner scanner = new Scanner(System.in); // creates the scanner object
		DecimalFormat df = new DecimalFormat("#.00"); // formats to 2 decimals places
		DecimalFormat pf = new DecimalFormat("%#0.000"); // formats to show percentages
		
		// asks for social security number
		System.out.print("What is your Social Security Number? (Input 0 to quit) ");
		SSN = scanner.nextInt();
		
		// if Social Security Number entered is not 0
		if (SSN != 0) {
		
			// while Social Security Number entered is not 0
			while (SSN != 0) {
				
				// if loop_count is zero, or if the loop is run for the first time
				// will only run at the beginning of the first run through for this loop
				if (loop_count == 0) {
					
					// asks user how many exceptions they have
					System.out.print("\nHow many Exemptions do you have? ");
					exemptions = scanner.nextInt();

					// checks to see if exemptions amount is valid
					while ((exemptions < 0) || (exemptions > 12)) {
						
						// tells user that number of exceptions is invalid and asks again
						System.out.println("\nInvalid number of exemptions");
						System.out.print("\nHow many Exemptions do you have? ");
						exemptions = scanner.nextInt();
						
					}
					
					// asks user for their filing status
					System.out.println("\nS: Single; M: Married; J: Married Filing Jointly;");
					System.out.print("What is your Filing Status? ");
					filing_status = scanner.next().charAt(0);
					
				}
				
				// checks to see if filing status is S, M, or J
				if ((filing_status == 'S') || (filing_status == 'M') ||
					(filing_status == 'J')) {
						
						// asks for user's gross income
						System.out.print("\nWhat is your Gross Income? ");
						gross_income = scanner.nextDouble();
						
						// calculates for taxable income
						taxable_income = (gross_income - STANDARD_DEDUCTION -
											(exemptions * 1000));
						
						// while taxable income is less than zero
						// asks user for exemptions amount and gross income again
						while (taxable_income < 0) {
							
							// tells user taxable income cannot be less than zero and asks
							// for exemptions again
							System.out.println("\nTaxable Income cannot be less than 0");
							System.out.print("\nHow many Exemptions do you have? ");
							exemptions = scanner.nextInt();
							
							// checks to see if exemptions amount is valid
							while ((exemptions < 0) || (exemptions > 12)) {
						
								// tells user amount of exemptions is invalid and asks again
								System.out.println("\nInvalid number of exemptions");
								System.out.print("\nHow many Exemptions do you have? ");
								exemptions = scanner.nextInt();
						
							}
							
							// asks user for gross income
							System.out.print("\nWhat is your Gross Income? ");
							gross_income = scanner.nextDouble();
							
							// calculates for taxable income
							taxable_income = (gross_income - STANDARD_DEDUCTION -
											(exemptions * 1000));
							
						}
						
						// initializes a switch statement for filing status
						switch (filing_status) {
						
							// if filing status is 'S'
							case 'S':
							
							// if taxable_income is less than $5,000
							if (taxable_income < 5000) {
								
								// tax_rate is set to %15
								tax_rate = .15;
								
							}
							
							// if taxable_income is greater than or equal to $5,000
							// and less than or equal to $20,000
							else if (taxable_income >= 5000 && taxable_income <= 20000) {
								
								// tax_rate is set to %22
								tax_rate = .22;
								
							}
							
							// if taxable_income is greater than $20,000
							else if (taxable_income > 20000) {
								
								// tax_rate is set to %31
								tax_rate = .31;
								
							}
							
							// calculates for the tax amount
							tax_amount = taxable_income * tax_rate;
							
							break;
							
							// if filing status is 'M'
							case 'M':
							
							// if taxable_income is less than $10,000
							if (taxable_income < 10000) {
							
								// tax_rate is set to %15
								tax_rate = .15;
							
							}
							
							// if taxable_income is greater than or equal to $10,000
							// and less than or equal to $40,000
							else if (taxable_income >= 10000 && taxable_income <= 40000) {
								
								// tax_rate is set to %22
								tax_rate = .22;
								
							}
							
							// if taxable_income is greater than $40,000
							else if (taxable_income > 40000) {
								
								// tax_rate is set to %31
								tax_rate = .31;
								
							}
							
							// calculates for the tax amount
							tax_amount = taxable_income * tax_rate;
							
							break;
							
							// if filing status is 'J'
							case 'J':
							
							// if taxable_income is less than $7,000
							if (taxable_income < 7000) {
							
								// tax_rate is set to %17
								tax_rate = .17;
							
							}
							
							// if taxable_income is greater than or equal to $7,000
							// and less than or equal to $25,000
							else if (taxable_income >= 7000 && taxable_income <= 25000) {
								
								// tax_rate is set to %24
								tax_rate = .24;
								
							}
							
							// if taxable_income is greater than $25,000
							else if (taxable_income > 25000) {
								
								// tax_rate is set to %33
								tax_rate = .33;
								
							}
							
							// calculates for the tax amount
							tax_amount = taxable_income * tax_rate;
							
							break;
						
						}
						
						// displays "SSN", "Taxable Income", "Tax Rate", and "Tax Amount"
						// with tabs between them, and then the associated data underneath
						System.out.println("\n\tSSN\t\tTaxable Income\t\tTax Rate\tTax Amount");
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println("\n\t"+SSN+"\t$"+df.format(taxable_income)+"\t"+
											pf.format(tax_rate)+"\t$"+df.format(tax_amount));
											
						// asks user for their social security number again
						System.out.print("\n\nWhat is your Social Security Number? ");
						System.out.print("(Input 0 to quit) ");
						SSN = scanner.nextInt();
						
						// if SSN is not 0
						if (SSN != 0) {
							
							// asks user how many exemptions they have
							System.out.print("\nHow many Exemptions do you have? ");
							exemptions = scanner.nextInt();
							
							// checks to see if exemptions amount is valid
							while ((exemptions < 0) || (exemptions > 12)) {
						
								System.out.println("\nInvalid number of exemptions");
								System.out.print("\nHow many Exemptions do you have? ");
								exemptions = scanner.nextInt();
						
							}
							
							// asks user for their filing status
							System.out.println("\nS: Single; M: Married; J: Married Filing Jointly;");
							System.out.print("What is your Filing Status? ");
							filing_status = scanner.next().charAt(0);
							
						}
						
						// if Social Security Number entered is 0, program ends
						else {
			
							System.out.println("\nGoodbye!");
			
						}
						
					}
				
				// if the filing status is not S, M, or J
				else {
					
					// tells the user that the value entered is invalid and asks again
					System.out.println("\nFiling Status entered is invalid.");
					System.out.println("\nS: Single; M: Married; J: Married Filing Jointly;");
					System.out.print("What is your Filing Status? ");
					filing_status = scanner.next().charAt(0);
					
				}
				
				loop_count++; // loop_count is incremented by one, so first
							  // if statement will never run again

			
			}
		
		}
		
		// if Social Security Number entered is 0, program ends
		else {
			
			System.out.println("Goodbye!");
			
		}
	
	}
}