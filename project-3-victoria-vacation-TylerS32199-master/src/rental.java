import java.util.Date;
import java.util.Scanner;

public class rental {
	String typeOfRentalEquiment;
	double numOfItemsRented; // From (1-20)
	String startDateOfRental; // Formatted to be 1-1-2018
	double numOfDaysRentingEquiment;
	double pricePerRental;
	double totalTax;
	double costBeforeTax;
	double finalCost;
	int numOfRentals;// less than or equal to 5
	double umbrellaPrice;
	double pricePerItem;
	double pricePerUmbrella;
	double pricePerBoat;
	double pricePerChair;
	double deliveryCharge;

public rental() {
	
}
public String getTypeOfRental() {
	return typeOfRentalEquiment;
}
public void setTypeOfRental(String typeOfRentalEquiment) {
	Scanner input = new Scanner(System.in);
	System.out.println("Welcome to Victoria's Vacation Venue where we offer rentals of vacation equipment.");
	System.out.println("We offer for rental boats, chairs, and umbrellas.");
	System.out.println("What equipment would you like to rent today? ");
	this.typeOfRentalEquiment = input.nextLine();
}
public int getNumOfRentals() {
	return numOfRentals;
}
public void setNumOfRentals(int numOfRentals) {
	Scanner input = new Scanner(System.in);
	boolean continueInput = true;
	do {
		try {
	System.out.println("Please enter the amount of rentals you would like: ");
	this.numOfRentals = input.nextInt();
	if(this.numOfRentals < 1 || this.numOfRentals > 5)
		throw new Exception("Value is not with in the range of 1--5. Try again");
		continueInput = false;
		}
		catch(Exception ex) {
			System.out.println("Sorry you are only limited to at max 5 rentals and a minimum of 1. Enter a number within that range");
			input.nextLine();
		}
	} while(continueInput);
}
public double getNumOfItemsRented() {
	return numOfItemsRented;
}
public void setNumOfItemsRented(double numOfItemsRented) {
	Scanner input = new Scanner(System.in);
	boolean continueInput = true;
	do {
		try {	
			System.out.println("Please enter the number of items you plan on renting today.");
			this.numOfItemsRented = input.nextDouble();
			if(this.numOfItemsRented < 1 || this.numOfItemsRented > 20)
				throw new Exception("Value is not with in the range of 1--20. Try again");
			continueInput = false;
			}
			catch(Exception ex) {
				System.out.println("Sorry we only limit you to pick between 1 or 20 items total to rent please try entering a number within our specified region.");
				input.nextLine();
		}
	} while(continueInput);
}
public String getStartDateRental() {
	return startDateOfRental;
}
public void setStartDateRental(String startDateOfRental) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the starting date of your rental or rentals.");
		this.startDateOfRental = input.nextLine();
}
public double getNumOfDaysRenting() {
	return numOfDaysRentingEquiment;
}
public void setNumOfDaysRenting(double numOfDaysRentingEquiment) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the number of days you are renting your items for.");
	this.numOfDaysRentingEquiment = input.nextDouble();
	if(this.numOfDaysRentingEquiment < 1 || this.numOfDaysRentingEquiment > 7)
	{
		System.out.println("Sorry we only limit you to renting our items for 1 to 7 days please try again.");
		return;
	}
}
public double calculateUmbrellaRental(double numOfDaysRentingEquiment, double umbrellaTotal) {
	pricePerUmbrella = numOfDaysRentingEquiment * umbrellaTotal;
	return pricePerUmbrella;
}
public double calculateBoatRental(double numOfDaysRentingEquiment, double boatTotal) {
	pricePerBoat = numOfDaysRentingEquiment * boatTotal;
	return pricePerBoat;
}
public double calculateChairRental(double numOfDaysRentingEquiment, double chairTotal) {
	pricePerChair = numOfDaysRentingEquiment * chairTotal;
	return pricePerChair;
}
public double calculateSalesTax(double deliveryCharge, double pricePerUmbrella, double pricePerBoat, double pricePerChair) {
	totalTax = ((deliveryCharge + pricePerUmbrella + pricePerBoat + pricePerChair) * 0.06); 
	return totalTax;
}
public double calculateTotalCost(double totalTax, double deliveryCharge, double pricePerUmbrella, double pricePerBoat, double pricePerChair) {
	finalCost = totalTax + deliveryCharge + pricePerUmbrella + pricePerBoat + pricePerChair;
	return finalCost;
}
}
