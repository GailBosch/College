import java.util.Scanner;

public class LoanRepaymentCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner ( System.in ) ;
		
		System.out.println("Enter loan amount?");
		double loanAmount = input.nextDouble();
		
		System.out.println("Enter annual interest rate (e.g. 0.04)?");
		double interestRate = input.nextDouble();
		double monthlyInterestRate = interestRate / 12 ;
		
		System.out.println("Enter the term of the loan in years?");
		double term = input.nextDouble();
		double termMonths = term * 12;
		
		double monthlyRepayments = (((((monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), termMonths)))) / (((Math.pow((1 + monthlyInterestRate), termMonths)) - 1)))) * loanAmount);
		
		System.out.printf("The monthly repayment for a %.0f year loan of %.2f at an annual interest rate of %.2f would be %.2f", term, loanAmount, interestRate, monthlyRepayments);
		
		input.close();

	}

}
