import java.util.Scanner;

public class chairs extends rental {
String chairType;
String dackChairColor;
double chairPrice;
double chairTotal;
int chairNumber;

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
		setChairColor(chairNumber);
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

