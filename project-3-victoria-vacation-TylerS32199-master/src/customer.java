import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class customer extends rental{
String firstName;
String lastName;
String email;
//List<String> telephoneNum = new ArrayList<String>();
String phoneNumber; // = "^[0-9]+$";
//Pattern pattern = Pattern.compile(phoneNumber);

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
	//List<String> telephoneNum = new ArrayList<String>();
	//Pattern pattern = Pattern.compile(phoneNumber);
	//for(String telephone : telephoneNum) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your phone number.");
	//Matcher matcher = pattern.matcher(telephone);
	//System.out.println(matcher.matches());
	this.phoneNumber = input.nextLine();
	//}
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
