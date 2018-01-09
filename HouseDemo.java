import java.util.*;

public class HouseDemo {

	static Scanner kybd = new Scanner(System.in);

	public static void main(String[] args) {
		RealEstateAgent piano = new RealEstateAgent();
		Agency listing = new Agency();
		System.out.println("Would you like to make a listing");
		String keyboard = kybd.nextLine();
		piano.read();
		piano.homeDescriptionInput();
		listing.displayListings();
		System.out.println("Do you want to make another listing");
		keyboard = kybd.nextLine();
		while (keyboard.equalsIgnoreCase("yes")) {
			piano.read();
			piano.homeDescriptionInput();
			listing.displayListings();
			
			

		}

		if (keyboard.equalsIgnoreCase("no")) {
			System.out.println("Thank you for letting me help you find your new home.");
			System.exit(0);
		}

	}

}
