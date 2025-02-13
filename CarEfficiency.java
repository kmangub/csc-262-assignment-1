import java.util.Scanner;

public class CarEfficiency {
    public static void main(String[] args) {
        System.out.println("Enter current number of gallons of gas in the car tank: ");

        /*
        For some reason, when I paste the next line to the assignment document, the "S" 
        in System.in gets changed to lowercase. Just make sure to watch out for it.
        */
        
        Scanner keyboard = new Scanner(System.in);
        int currentNumberOfGallons = keyboard.nextInt();
        
        System.out.println("Please enter how many miles can this car travel per gallon? ");
        int fuelEfficiency = keyboard.nextInt();

        System.out.println("Enter price per gallon: ");
        float costOfGas = keyboard.nextFloat();

        float costRequiredToTravel = ((100.0f / fuelEfficiency) * costOfGas);
        System.out.println("It will cost you $" + String.format("%.2f", costRequiredToTravel) + " to travel 100 miles.");

        int maxDistance = currentNumberOfGallons * fuelEfficiency;
        System.out.println("With your current gallons of gas, you are able to travel up to " + maxDistance + " miles.");

        int gallonsNeededTofillTank = 20 - currentNumberOfGallons;
        float costForFullTank = gallonsNeededTofillTank * costOfGas;

        System.out.println( gallonsNeededTofillTank + " gallons is needed to fill up the tank and it will cost $" + String.format("%.2f", costForFullTank) + " to fill up your tank.");
    }
}

