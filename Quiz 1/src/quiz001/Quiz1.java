package quiz001;
public class Quiz1 {

}

import java.util.Scanner;

public class Football {

	public static void main(String[] args) {

		// create a scanner object
		Scanner input = new Scanner(System.in);


		// prompt the user for inputs
		System.out.print("How many passing attempts? ");

		double passattempts = input.nextDouble();


		System.out.print("Number of completions?");
		double comp = input.nextDouble();


		System.out.print("Passing yards? ");

		double passingy = input.nextDouble();


		System.out.print("Touchdown passes");
		double touchdown = input.nextDouble();


		System.out.print("Interceptions?");
		double interceptions = input.nextDouble();


		// close the scanner

		input.close();

	}


	public static double calculateRating(double passattempts, double comp, double passingy,
			double interceptions, double touchdown) {



		double a = ((comp /passattempts)-.3) * 5;
		double b = ((passingy /passattempts)-3) * .25;
		double c = (touchdown /passattempts) * 20;
		double d = (2.375 - ((interceptions /passattempts) * 25));


		double Rating = ((a+b+c+d)/6) * 100;
		return Rating;

	}





	}

