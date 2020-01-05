
public class rentalDriver extends rental{

	public static void main(String[] args) {
		rental myRental = new rental();
		String typeOfRentalEquiment = null;
		String startDateOfRental = null;
		String firstName = null;
		String lastName = null;
		String phoneNumber = null;
		String email = null;
		String deliveryLocation = null;
		String boatType = null;
		String chairType = null;
		String umbrellaType = null;
		double numOfItemsRented = 0;
		double numOfDaysRentingEquiment = 0;

		myRental.setTypeOfRental(typeOfRentalEquiment);
		myRental.setNumOfRentals(myRental.numOfRentals);
		for(int i = 0; i < myRental.getNumOfRentals(); i++) {
		customer myCustomer = new customer();
		location myLocation = new location();
		umbrellas myUmbrellas = new umbrellas();
		boat myBoat = new boat();
		chairs myChairs = new chairs();
		myRental.setNumOfItemsRented(numOfItemsRented);
		myRental.setStartDateRental(startDateOfRental);
		myRental.setNumOfDaysRenting(numOfDaysRentingEquiment);
		myCustomer.setFirstName(firstName);
		myCustomer.setLastName(lastName);
		myCustomer.setPhoneNumber(phoneNumber);
		myCustomer.setEmail(email);
		myLocation.setDeliveryLocation(deliveryLocation);
		myLocation.deliveryInfo(deliveryLocation);
		myLocation.calculateDeliveryCharge(myLocation.deliveryNumber);
		myBoat.setTypeOfBoat(boatType);
		System.out.println("The type of boat or boats you are planning on renting is: " + myBoat.getTypeOfBoat());
		myBoat.boatInfo(boatType, myLocation.deliveryNumber);
		if(myBoat.boatNumber > 0) {
			myBoat.setNumOfPeopleInBoat(myBoat.numOfPeopleInBoat, myBoat.boatNumber);
			myBoat.setNumOfLifeJackets(myBoat.numOfLifeJackets);
			myBoat.setSizeOfJackets(myBoat.sizeOfJackets, myBoat.numOfLifeJackets);
			myBoat.setNumOfPaddles(myBoat.numOfPaddles);
			myBoat.setTypeOfPaddle(myBoat.typeOfPaddle);
		}
		myBoat.calculateBoatDiscount(myRental.numOfDaysRentingEquiment, myBoat.boatPrice, myBoat.boatNumber);
		myBoat.calculateBoatPrice(myBoat.boatPrice, myBoat.boatNumber, myBoat.numOfBoats);
		myChairs.setTypeOfChair(chairType);
		System.out.println("The type of chair or chairs you are planning to rent is: " + myChairs.getTypeOfChair());
		myChairs.chairInfo(chairType);
		myChairs.calculateChairDiscount(myChairs.numOfChairs, myChairs.chairPrice);
		myChairs.calculateChairPrice(myChairs.chairNumber, myChairs.chairPrice);
		myChairs.setChairColor(myChairs.chairNumber);
		myChairs.getChairColor(myChairs.chairNumber);
		myUmbrellas.setTypeOfUmbrella(umbrellaType);
		System.out.println("The type of umbrella or umbrellas you are planning on renting is: " + myUmbrellas.getTypeOfUmbrella());
		myUmbrellas.umbrellaInfo(umbrellaType, myLocation.deliveryNumber);
		myUmbrellas.calculateUmbrellaPrice(myUmbrellas.umbrellaNumber, myUmbrellas.numOfUmbrellas, myUmbrellas.umbrellaPrice);
		myRental.calculateUmbrellaRental(myRental.numOfDaysRentingEquiment, myUmbrellas.umbrellaTotal);
		myRental.calculateBoatRental(myRental.numOfDaysRentingEquiment, myBoat.boatTotal);
		myRental.calculateChairRental(myRental.numOfDaysRentingEquiment, myChairs.chairTotal);
		myRental.calculateSalesTax(myLocation.deliveryCharge, myRental.pricePerUmbrella, myRental.pricePerBoat, myRental.pricePerChair);
		myRental.calculateTotalCost(myRental.totalTax, myLocation.deliveryCharge, myRental.pricePerUmbrella, myRental.pricePerBoat, myRental.pricePerChair);
		System.out.println("The type of rental you plan or getting is: " + myRental.getTypeOfRental());
		System.out.println("The number of rentals you are doing is: " + myRental.getNumOfRentals());
		System.out.println("The number of items you are renting is: " + myRental.getNumOfItemsRented());
		System.out.println("The date of your rental is: " + myRental.getStartDateRental());
		System.out.println("The number of days you plan on renting your items for is: " + myRental.getNumOfDaysRenting());
		System.out.println("The name for the rental order is: " + myCustomer.getFirstName() + " " + myCustomer.getLastName());
		System.out.println("The phone number you have entered and the one I can call you at is: " + myCustomer.getPhoneNumber());
		System.out.println("The email you have entered and the one I will contact you at is: " + myCustomer.getEmail());
		System.out.println("The location you want your items delivered to is " + myLocation.getDeliveryLocation());
		System.out.println("Delivery charge is: $" + (String.format("%.2f", myLocation.deliveryCharge)));
		System.out.println("Boat rental per day cost: $" + (String.format("%.2f",myBoat.boatTotal)));
		System.out.println("Chair rental per day cost: $" + (String.format("%.2f",myChairs.chairTotal)));
		System.out.println("Umbrella rental per day cost: $" + (String.format("%.2f",myUmbrellas.umbrellaTotal)));
		System.out.println("Boat rental cost: $" + (String.format("%.2f",myRental.pricePerBoat)));
		System.out.println("Boat rental discount: $" + (String.format("%.2f",myBoat.calculateBoatDiscount(myRental.numOfDaysRentingEquiment, myBoat.boatPrice, myBoat.boatNumber))));
		System.out.println("Boat capacity: " + myBoat.getNumOfPeoplePerBoat());
		System.out.println("Number of Life jackets: " + myBoat.getNumOfLifeJackets());
		System.out.println("Size of the life jackets are: " + myBoat.getSizeOfJackets());
		System.out.println("Number of Paddles: " + myBoat.getNumOfPaddles());
		System.out.println("Type of paddlles are: " + myBoat.getTypeOfPaddle());
		System.out.println("Chair rental cost: $" + (String.format("%.2f",myRental.pricePerChair)));
		System.out.println("Chair rental discount: $" + (String.format("%.2f", myChairs.calculateChairDiscount(myChairs.numOfChairs, myChairs.chairPrice))));
		System.out.println("Umbrella rental cost: $" + (String.format("%.2f", myRental.pricePerUmbrella)));
		System.out.println("Sales Tax: $" + (String.format("%.2f", myRental.totalTax)));
		System.out.println("Total rental cost: $" + (String.format("%.2f", myRental.finalCost)));
		System.out.println("We will deliver all items to the the location within a 3 hour window.");
		System.out.println("Victoria will call or email you within 2 business days.");
		System.out.print("\n");
		}
	}
}

