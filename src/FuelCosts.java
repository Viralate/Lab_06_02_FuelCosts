import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) throws Exception {
        //initate scanner
        Scanner scanner = new Scanner(System.in);

        //declare variables
        double gallonsOfGas = getValidDoubleInput(scanner,"Enter number of gallons of gas in the tank: ");
        double fuelEfficiency = getValidDoubleInput(scanner, "Enter miles per gallon you get:  ");
        double pricePerGallon = getValidDoubleInput(scanner, "Enter the price of gas per gallon: ");

        //calculate for cost per miles and for distance
        double costPer100Miles = (100/ fuelEfficiency) * pricePerGallon;
        double maxDistance = gallonsOfGas * fuelEfficiency;

        // print results
        System.out.printf("Cost per 100 Miles is: $%.2f\n", costPer100Miles);
        System.out.printf("The car can go %.2f miles with the gas in the tank.\n", maxDistance);


    }
    // logic to ensure valid input
    private static double getValidDoubleInput(Scanner scanner, String prompt) {
        double input;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input please enter a valid number.");
                System.out.print(prompt);
                scanner.next(); // will clear input if it is invalid
            }
            input = scanner.nextDouble();
            //if the input is less than or equal to 0 it will prompt user to input another number till the condition is met
        }while (input <= 0);
        return input;
    }
}
