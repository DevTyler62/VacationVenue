import java.util.Scanner;

public class customer extends rental{
String firstName;
String lastName;
String email;
String phoneNumber;

public customer() {
	
}
public customer(String firstName, String lastName, String phoneNumber) {
	
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your first name.");
	this.firstName = input.nextLine();
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your last name.");
	this.lastName = input.nextLine();
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your phone number.");
	this.phoneNumber = input.nextLine();
}
 public String getEmail() {
	return email;
}
public void setEmail(String email) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your email address so I can get in contact with you.");
	this.email = input.nextLine();
}
public void verificationOfRental() {
	
}
}
