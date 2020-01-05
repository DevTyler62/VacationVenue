import java.util.Scanner;

// This class is no longer being used for anything as I 
// have broke up each type of equipment into its on sub class.  

public class pricing extends rental {
String boatType;
String chairType;
String umbrellaType;
double boatPrice;
double chairPrice;
double umbrellaPrice;

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
public String getTypeOfChair() {
	return chairType;
}
public void setTypeOfChair(String chairType) {
	Scanner input = new Scanner(System.in);
	System.out.println("If you are planning on renting a chair please select from the following or just type N/A.");
	System.out.println("Sling Low: $5/day");
	System.out.println("Chaise Lounge: $7/day");
	System.out.println("Folding Classic: $5/day");
	System.out.println("Adirondack: $10/day");
	this.chairType = input.nextLine();
}
public String getTypeOfUmbrella() {
	return umbrellaType;
}
public void setTypeOfUmbrella(String umbrellaType) {
	Scanner input = new Scanner(System.in);
	System.out.println("If you are planning on renting a umbrella please select from the following or just type N/A.");
	System.out.println("Chair-Side: $5/day");
	System.out.println("Single: $10/day");
	System.out.println("Family: $15/day");
	System.out.println("Tent: $20/day");
	this.umbrellaType = input.nextLine();   
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
	double boatTotal = boatPrice * numOfBoats;
	return boatTotal;
}
public double calculateChairPrice(String chairType) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the total amounnt of chair's you plan on renting.");
	int numOfChairs = input.nextInt();
	System.out.println("Please enter the corresponding number to the chair type you have selected.");
	System.out.println("None = 0");
	System.out.println("Sling Low = 1");
	System.out.println("Chaise Lounge = 2");
	System.out.println("Folding Classic = 3");
	System.out.println("Adirondack = 4");
	int chairNumber = input.nextInt();
	if (chairNumber == 0) {
		chairPrice = 0;
	}
	else if (chairNumber == 1) {
		chairPrice = 5; 
		}
	else if (chairNumber == 2) {
		chairPrice = 7;
	}
	else if (chairNumber == 3){
		chairPrice = 5;
	}
	else if (chairNumber == 4) {
		chairPrice = 10;
	}
	double chairTotal = chairPrice * numOfChairs;
	return chairTotal;
}
public double calculateUmbrellaPrice(String umbrellaType) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the total amounnt of umbrella's you plan on renting.");
	int numOfUmbrellas = input.nextInt();
	System.out.println("Please enter the corresponding number to the umbrella type you have selected.");
	System.out.println("None = 0");
	System.out.println("Chair-Side = 1");
	System.out.println("Single = 2");
	System.out.println("Family = 3");
	System.out.println("Tent = 4");
	int umbrellaNumber = input.nextInt();
	if (umbrellaNumber == 0) {
		umbrellaPrice = 0;
	}
	else if (umbrellaNumber == 1) {
		umbrellaPrice = 5; 
		}
	else if (umbrellaNumber == 2) {
		umbrellaPrice = 10;
	}
	else if (umbrellaNumber == 3){
		umbrellaPrice = 15;
	}
	else if (umbrellaNumber == 4) {
		umbrellaPrice = 20;
	}
	double umbrellaTotal = umbrellaPrice * numOfUmbrellas;
	return umbrellaTotal;
}

// Dead code I might use just leaving it here for now

//public double getBoatPrice() {
	//return boatPrice;
//}
//public void setBoatPrice(double boatPrice) {
	//this.boatPrice = boatPrice;
//}
//public double getChairPrice() {
	//return chairPrice;
//}
//public void setChairPrice(double chairPrice) {
	//this.chairPrice = chairPrice;
//}
//public double getUmbrellaPrice() {
	//return umbrellaPrice;
//}
//public void setUmbrellaPrice(double umbrellaPrice) {
	//this.umbrellaPrice = umbrellaPrice;
//}
}
