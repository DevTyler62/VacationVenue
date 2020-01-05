import java.util.Scanner;

public class boat extends rental{
String boatType;
double boatPrice;
double boatTotal;
int numOfPeopleInBoat;
int numOfLifeJackets;
int sizeOfJackets;
int numOfPaddles;
String typeOfPaddle;
int boatNumber;
int numOfBoats;
double newBoatTotal;

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
public int boatInfo(String boatType, int deliveryNumber) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the total amounnt of boat's you plan on renting.");
	numOfBoats = input.nextInt();
	System.out.println("Please enter the corresponding number to the boat type you have selected.");
	System.out.println("None = 0");
	System.out.println("Padele Board = 1");
	System.out.println("Single Kayak = 2");
	System.out.println("Tandem Kayak = 3");
	System.out.println("3 Person canoe = 4");
	boatNumber = input.nextInt();
	if (boatNumber == 0) {
		//boatPrice = 0;
		return boatNumber = 0;
	}
	else if (boatNumber == 1) {
		//boatPrice = 65;
		if(deliveryNumber == 3) {
			System.out.println("Sorry you are not allowed to rent this item at this location. Please try again.");
		}
		return boatNumber = 1;
	}
	else if (boatNumber == 2) {
		//boatPrice = 45;
		return boatNumber = 2;
	}
	else if (boatNumber == 3){
		//boatPrice = 65;
		return boatNumber = 3;
	}
	else if (boatNumber == 4) {
		//boatPrice = 75;
		return boatNumber = 4;
	}
	//boatTotal = boatPrice * numOfBoats;
	//return boatTotal;
	return numOfBoats;
}
public double calculateBoatDiscount(double numOfDaysRentingEquiment, double boatPrice, int boatNumber) {
	if(numOfDaysRentingEquiment >= 3) {
	if (boatNumber == 0) {
		boatPrice = 0;
		//return boatNumber = 0;
	}
	else if (boatNumber == 1) {
		boatPrice = 65;
		//return boatNumber = 1;
	}
	else if (boatNumber == 2) {
		boatPrice = 45;
		//return boatNumber = 2;
	}
	else if (boatNumber == 3){
		boatPrice = 65;
		//return boatNumber = 3;
	}
	else if (boatNumber == 4) {
		boatPrice = 75;
		//return boatNumber = 4;
	}
	}
	newBoatTotal = ((boatPrice * numOfBoats) * 0.10);
	boatTotal = boatTotal - newBoatTotal;
	return boatTotal;
}
public double calculateBoatPrice(double boatPrice, int boatNumber, int numOfBoats) {
	if (boatNumber == 0) {
		boatPrice = 0;
		//return boatNumber = 0;
	}
	else if (boatNumber == 1) {
		boatPrice = 65;
		//return boatNumber = 1;
	}
	else if (boatNumber == 2) {
		boatPrice = 45;
		//return boatNumber = 2;
	}
	else if (boatNumber == 3){
		boatPrice = 65;
		//return boatNumber = 3;
	}
	else if (boatNumber == 4) {
		boatPrice = 75;
		//return boatNumber = 4;
	}
	boatTotal = boatPrice * numOfBoats;
	return boatTotal;
}
public int getNumOfPeoplePerBoat() {
	return numOfPeopleInBoat;
}
public void setNumOfPeopleInBoat(int numOfPeopleInBoat, int boatNumber) {
	Scanner input = new Scanner(System.in);
	boolean continueInput = true;
do {
	try {
		System.out.println("Please enter the number of people that will be riding in the boat. ");
		this.numOfPeopleInBoat = input.nextInt();
		if(boatNumber == 4 && this.numOfPeopleInBoat > 3)
			throw new Exception("Exceeded number of people in boat. Try again");
		continueInput = false;
		}
		catch(Exception ex) {
			System.out.println("Opps look like you entered more than 3 people for a canoe please try entering a number less than or equal to 3.");
			input.nextLine();
		}
	} while(continueInput);
}
public int getNumOfLifeJackets() {
	return numOfLifeJackets;
}
public void setNumOfLifeJackets(int numOfLifeJackets) {
	Scanner input = new Scanner(System.in);
	boolean continueInput = true;
	do {
		try {
			System.out.println("Enter the number of life jackets you need from 1-3. ");
			this.numOfLifeJackets = input.nextInt();
			if(this.numOfLifeJackets < 1 || this.numOfLifeJackets > 3)
				throw new Exception("Value is not with in the range of 1--3. Try again");
			continueInput = false;
			}
			catch(Exception ex) {
				System.out.println("Sorry we limit only 1--3 life jackets per boat please try entering a number within our specified region.");
				input.nextLine();
		}
	} while(continueInput);
}
public int getSizeOfJackets() {
	return sizeOfJackets;
}
public void setSizeOfJackets(int sizeOfJackets, int numOfLifeJackets) {
	Scanner input = new Scanner(System.in);
	boolean continueInput = true;
	do {
		try {
			if(numOfLifeJackets > 0 && numOfLifeJackets < 4) {
				System.out.println("Enter the size of life jackets you need from 1-6. ");
				this.sizeOfJackets = input.nextInt();
				if(this.sizeOfJackets < 1 || this.sizeOfJackets > 6)
					throw new Exception("Value is not with in the range of 1--6. Try again");
				continueInput = false;
				}
			}
			catch(Exception ex) {
				System.out.println("Sorry we only carry life jackets sizes from 1--6 please try entering a number within our specified region.");
				input.nextLine();
			}
		} while(continueInput);
	}
public int getNumOfPaddles() {
	return numOfPaddles;
}
public void setNumOfPaddles(int numOfPaddles) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the number of paddles you will need for your boat rental. ");
	this.numOfPaddles = input.nextInt();
}
public String getTypeOfPaddle() {
	return typeOfPaddle;
}
public void setTypeOfPaddle(String typeOfPaddle) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the type of paddle for your boat rental. ");
	this.typeOfPaddle = input.nextLine();
}
}
