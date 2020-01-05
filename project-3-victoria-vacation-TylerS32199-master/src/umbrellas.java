import java.util.Scanner;

public class umbrellas extends rental {
	String umbrellaType;
	double umbrellaPrice;
	double umbrellaTotal;
	int umbrellaNumber;
	int numOfUmbrellas;
	
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
public double umbrellaInfo(String umbrellaType, int deliveryNumber) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the total amounnt of umbrella's you plan on renting.");
	numOfUmbrellas = input.nextInt();
	System.out.println("Please enter the corresponding number to the umbrella type you have selected.");
	System.out.println("None = 0");
	System.out.println("Chair-Side = 1");
	System.out.println("Single = 2");
	System.out.println("Family = 3");
	System.out.println("Tent = 4");
	umbrellaNumber = input.nextInt();
	if (umbrellaNumber == 0) {
		return umbrellaNumber = 0;
	}
	else if (umbrellaNumber == 1) {
		return umbrellaNumber = 1;
		}
	else if (umbrellaNumber == 2) {
		return umbrellaNumber = 2;
	}
	else if (umbrellaNumber == 3){
		return umbrellaNumber = 3;
	}
	else if (umbrellaNumber == 4) {
		if(deliveryNumber == 3) {
			System.out.println("Sorry you are not allowed to rent this item at this location. Please try again.");
		}
		return umbrellaNumber = 4;
	}
	return numOfUmbrellas;
}
public double calculateUmbrellaPrice(int umbrellaNumber, int numOfUmbrellas, double umbrellaPrice) {
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
	umbrellaTotal = umbrellaPrice * numOfUmbrellas;
	return umbrellaTotal;
}
}
