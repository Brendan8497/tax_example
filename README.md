# tax_example
# By Brendan Ryan

      This program calculates for the user's taxes and income using the
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
