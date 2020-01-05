import java.util.Scanner;

public class chairs extends rental {
String chairType;
String dackChairColor;
double chairPrice;
double chairTotal;
int chairNumber;
int numOfChairs;
double newChairPrice;

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
public double chairInfo(String chairType) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the total amounnt of chair's you plan on renting.");
	numOfChairs = input.nextInt();
	System.out.println("Please enter the corresponding number to the chair type you have selected.");
	System.out.println("None = 0");
	System.out.println("Sling Low = 1");
	System.out.println("Chaise Lounge = 2");
	System.out.println("Folding Classic = 3");
	System.out.println("Adirondack = 4");
	chairNumber = input.nextInt();
	if (chairNumber == 0) {
		//chairPrice = 0;
		return chairNumber = 0;
	}
	else if (chairNumber == 1) {	
		//chairPrice = 5;
		return chairNumber = 1;
	}
	else if (chairNumber == 2) {
		//chairPrice = 7;
		return chairNumber = 2;
	}
	else if (chairNumber == 3){
		//chairPrice = 5;
		return chairNumber = 3;
	}
	else if (chairNumber == 4) {
		//chairPrice = 10;
		setChairColor(chairNumber);
		//return chairNumber = 4;
	}
	//chairTotal = chairPrice * numOfChairs;
	//return chairTotal;
	return numOfChairs;
}
public double calculateChairDiscount(int numOfChairs, double chairPrice) {
	if(numOfChairs >= 4) {
		//newChairPrice = ((chairPrice * numOfChairs) * 0.10);
		//return newChairPrice;
		if (chairNumber == 0) {
			chairPrice = 0;
			//newChairPrice = ((chairPrice * numOfChairs) * 0.10);
			//return newChairPrice;
		}
		else if (chairNumber == 1) {	
			chairPrice = 5;
			//newChairPrice = ((chairPrice * numOfChairs) * 0.10);
			//return newChairPrice;
		}
		else if (chairNumber == 2) {
			chairPrice = 7;
			//newChairPrice = ((chairPrice * numOfChairs) * 0.10);
			//return newChairPrice;
		}
		else if (chairNumber == 3){
			chairPrice = 5;
			//newChairPrice = ((chairPrice * numOfChairs) * 0.10);
			//return newChairPrice;
		}
		else if (chairNumber == 4) {
			chairPrice = 10;
			//newChairPrice = ((chairPrice * numOfChairs) * 0.10);
			//chairTotal = newChairPrice;
			//return chairTotal;
		}
		//chairTotal = newChairPrice;
			//chairTotal = chairPrice * numOfChairs;
			//return chairTotal;
		}
		newChairPrice = ((chairPrice * numOfChairs) * 0.10);
		chairTotal = chairTotal - newChairPrice;
		return chairTotal;
}
public double calculateChairPrice(int chairNumber, double chairPrice) {
	if (chairNumber == 0) {
		chairPrice = 0;
		//return chairPrice;
	}
	else if (chairNumber == 1) {	
		chairPrice = 5;
		//return chairPrice;
	}
	else if (chairNumber == 2) {
		chairPrice = 7;
		///return chairPrice;
	}
	else if (chairNumber == 3){
		chairPrice = 5;
		//return chairPrice;
	}
	else if (chairNumber == 4) {
		chairPrice = 10;
		//setChairColor(chairNumber);
		//return chairPrice;
	}
	chairTotal = chairPrice * numOfChairs;
	return chairTotal;
}
public String getChairColor(int chairNumber){
	if (chairNumber == 4) {
	System.out.println("You selected Adirondack which comes in three colors and you picked this color: " + dackChairColor);
	return dackChairColor;
	}
	return "";
}
public void setChairColor(int chairNumber) {
	Scanner input = new Scanner(System.in);
	if (chairNumber == 4) {
		System.out.println("Adirondacks come in three colors please select the color of the chairs you would like: ");
		System.out.println("Blue");
		System.out.println("Red");
		System.out.println("Green");
		this.dackChairColor = input.nextLine();
		getChairColor(chairNumber);
		}
	}
}

