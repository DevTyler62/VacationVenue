import java.util.Scanner;

public class boat extends rental{
String boatType;
double boatPrice;
double boatTotal;

public String getTypeOfBoat() {
	return boatType;
}
public void setTypeOfBoat(String boatType) {
	Scanner input = new Scanner(System.in);
	System.out.println("If you are planning on renting a boat please select from the following or just type N/A.");
	System.out.println("Padele Board: $65/day");
	System.out.println("Single Kayak: $45/day");
	System.out.println("Tandem Kayak: $65/day");
	System.out.println("3 Person canoe: $75/day");
	this.boatType = input.nextLine();
}
public double calculateBoatPrice(String boatType) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the total amounnt of boat's you plan on renting.");
	int numOfBoats = input.nextInt();
	System.out.println("Please enter the corresponding number to the boat type you have selected.");
	System.out.println("None = 0");
	System.out.println("Padele Board = 1");
	System.out.println("Single Kayak = 2");
	System.out.println("Tandem Kayak = 3");
	System.out.println("3 Person canoe = 4");
	int boatNumber = input.nextInt();
	if (boatNumber == 0) {
		boatPrice = 0;
	}
	else if (boatNumber == 1) {
		boatPrice = 65; 
		}
	else if (boatNumber == 2) {
		boatPrice = 45;
	}
	else if (boatNumber == 3){
		boatPrice = 65;
	}
	else if (boatNumber == 4) {
		boatPrice = 75;
	}
	boatTotal = boatPrice * numOfBoats;
	return boatTotal;
}
}
