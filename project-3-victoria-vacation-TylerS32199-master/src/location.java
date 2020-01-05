import java.util.Scanner;

public class location extends rental {
String deliveryLocation;
double deliveryCharge;
int deliveryNumber;

public String getDeliveryLocation() {	
	return deliveryLocation;
}
public void setDeliveryLocation(String deliveryLocation) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the location you would will like to pick up your items from: ");
	System.out.println("The Vacation Venue: Delivery charge = $0");
	System.out.println("Bella’s Beach: Delivery charge = $10");
	System.out.println("Griffin’s Grove: Delivery charge = $20");
	this.deliveryLocation = input.nextLine();
}
public double deliveryInfo(String deliveryLocation) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the corresponding number to the delivery locaation you have selected.");
	System.out.println("Vacation Venue = 1");
	System.out.println("Bella's Beach = 2");
	System.out.println("Griffin's Grove = 3");
	deliveryNumber = input.nextInt();
	if (deliveryNumber == 1) {
		//deliveryCharge = 0;
		deliveryNumber = 1;
		}
	else if (deliveryNumber == 2) {
		//deliveryCharge = 10;
		deliveryNumber = 2;
	}
	else if (deliveryNumber == 3){
		//deliveryCharge = 20;
		deliveryNumber = 3;
	}
	return deliveryNumber;
}
public double calculateDeliveryCharge(int deliveryNumber) {
	if (deliveryNumber == 1) {
		deliveryCharge = 0;
		}
	else if (deliveryNumber == 2) {
		deliveryCharge = 10;
	}
	else if (deliveryNumber == 3){
		deliveryCharge = 20;
	}
	return deliveryCharge;
}

}
