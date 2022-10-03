/*name: Aiden Russo
date: 10/2/22
In this program we caluclate the cost and time it takes to go a distance in an electric and gas car
I would give myself 100% because I completed all of the requirements
*/
import java.util.*;

public class TravelCalcRusso {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    description();
    System.out.print("How many time do you want to use the app: ");
    int count = kb.nextInt();
    for (int j = 1; j <= count; j++) {
      gasTravel(kb);
      for (int i = 1; i <= 30; i++) System.out.print("&");
      System.out.println();
      electricTravel(kb);
      for (int i = 1; i <= 30; i++) System.out.print("&");
      System.out.println();
    }
    System.out.println("GOOD BYE");
  }
  /*This method calculates the total cost charging the battery, Stops represents the number of the charges*/

  public static double chargeCost(int stops, double pricePerCharge) {

    return stops * pricePerCharge;
  }

  /*This method caluclates the total monet spend on the gas to travel */
  public static double gasCost(double distance, double milesPerGallon, double costPerGallon) {
    return distance / milesPerGallon * costPerGallon;
  }

  /*This method caluclates the number of the stops needed to charge the battery.
  milePerCharge represents the number of the miles  driven with a fully charged battery*/
  public static int stops(double distance, double milePerCharge) {
    return (int)
        (distance / milePerCharge); // We have to convert to int otherwise compiler gets mad
  }
  /*This method caluclate the hours of travel taking your gas car*/
  public static double travelHoursGasCar(double distance, double speed) {
    return distance / speed;
  }

  /*This method calculates the hours traveling using your electric car
  stops represenst the number of the times the car needs to be charged
  hoursPerStop represents the time it takes to fully charge your car
  distance represents the total distace traveled
  speed represents the speed of the car
  */
  public static double travelHoursWithElectricCar(
      int stops, double hoursPerStop, double distance, double speed) {
    return (stops * hoursPerStop) + (distance / speed);
  }

  /*This method calculates the cost and the time to travel with a gas car*/
  public static void gasTravel(Scanner kb) {
    System.out.println("\nTraveling with a gas car\n");
    System.out.print("Enter the total number of the miles you are traveling: ");
    double distance = kb.nextDouble();
    System.out.print("\nEnter the speed you are traveling: ");
    double speed = kb.nextDouble();
    System.out.print("\nEnter the miles per gallon: ");
    double mpg = kb.nextDouble();
    System.out.print("\nEnter the cost per gallon: ");
    double gsCost = kb.nextDouble();
    double gHours = travelHoursGasCar(distance, speed);
    double gCost = gasCost(distance, mpg, gsCost);
    System.out.println("\nTraveingl with your gas car: ");
    System.out.println("Hours " + gHours);
    System.out.println("Cost " + gCost);
  }

  /*This method calculates the cost and the time to travel with an electric car*/
  public static void electricTravel(Scanner kb) {
    System.out.println("\nTraveling with an electric car\n");
    System.out.print("Enter the total number of the miles you are traveling: ");
    double distance = kb.nextDouble();
    System.out.print("\nEnter the speed you are traveling: ");
    double speed = kb.nextDouble();
    System.out.print("\nEnter the miles that can be driven with a fully charged battery: ");
    double mpc = kb.nextDouble();
    System.out.print("\nEnter how long it takes to fully charge the car battery in hours: ");
    double hpc = kb.nextDouble();
    System.out.print("\nEnter the cost per battery charge: ");
    double batCost = kb.nextDouble();
    int stopAmount = stops(distance, mpc);
    double ehours = travelHoursWithElectricCar(stopAmount, hpc, distance, speed);
    double ecost = chargeCost(stopAmount, batCost);
    System.out.println("\nTraveling with your electric car\n");
    System.out.println("Hours of travel: " + ehours);
    System.out.println("Charge cost: " + ecost);
  }

  public static void description() {
    for (int i = 1; i <= 80; i++) System.out.print("&");
    System.out.println();
    System.out.println(
        "This program calculates the cost and the time to travel to your destination ");
    System.out.println(" given the needed information for both gas car and the electric car.");
    System.out.println("Just answer some simple questions");
    for (int i = 1; i <= 80; i++) System.out.print("&");
    System.out.println();
  }
}
