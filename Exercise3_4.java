package CH03;

import java.util.Scanner;

/*
It is difficult to make a budget that spans several years, because prices are not stable.
If your company needs 200 pencils per year, you cannot simply use this year’s price
as the cost of pencils two years from now. Because of inflation, the cost is likely to
be higher than it is today. Write a program to gauge the expected cost of an item in
a specified number of years. The program asks for the cost of the item, the number
of years from now that the item will be purchased, and the rate of inflation. The
program then outputs the estimated cost of the item after the specified period.
Have the user enter the inflation rate as a percentage, such as 5.6 (percent). Your
program should then convert the percent to a fraction, such as 0.056, and should
use a loop to estimate the price adjusted for inflation.
 */
public class Exercise3_4 {
    public static void main(String[] args) {

        //Create Scanner class
        Scanner input = new Scanner(System.in);

        //Ask for the cost of the item
        System.out.print("Cost of the item: ");
        double costOfItem = input.nextInt();

        //Ask for the number of years from now that the item will be purchased
        System.out.print("Number of years: ");
        int years = input.nextInt();

        //Ask for the rate of inflation
        // Enter as a percentage: ex: 5.6(percent)
        System.out.print("Rate of inflation: ");
        double rateOfInflation = input.nextDouble();

        //Convert the percent to a fraction Ex:(0.056)
        double inflationRateToFraction = rateOfInflation / 100;

        //New Line
        System.out.println();

        System.out.printf("Cost of item: $%.2f \n" , costOfItem);
        System.out.println("Number of Years: " + years);
        System.out.println("Rate of Inflation: " + rateOfInflation + "%");

        //New Line
        System.out.println();

        //Use a loop to estimate the price adjusted for inflation
        for (int yearCounter = 1; yearCounter <= years; yearCounter++){
            //Output the estimated cost of the item after the specified period
            costOfItem = costOfItem + costOfItem * inflationRateToFraction;
        }
        System.out.printf("The item will cost $%.2f in %d years \n"
                , costOfItem, years);
    }
}
