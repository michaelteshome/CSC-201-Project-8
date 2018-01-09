import java.util.*;
import java.io.*;
public class RealEstateAgent{
	private static String welcome;
	private static String decision;
	private static String choice;
	private static String beds;
	private static String bath;
	private static String lot;
	private static String age;
	private static String price;
	private static String jurisdiction;
	private static String commute;
	static Scanner kybd = new Scanner(System.in);
	public RealEstateAgent(){
		
	}
	
	//for:
	//if that arralist.contains twostory
	//arraylist2.add
	
	public void read(){
		ArrayList greeting = new ArrayList();
		greeting.add("Century 21");
		greeting.add("Remax");
		greeting.add("Long & Foster");
		greeting.add("McEnearney");
		System.out.println("Hi, my name is Michael. Today I will help you buy your first home");
		for(int x = 0; x < greeting.size(); x ++){
			System.out.println(x + ")" + greeting.get(x));
		}
		System.out.println("Please choose from the following list of companies: please use numbers ");
		welcome = kybd.nextLine();
		
		
		
		
		if(welcome.equalsIgnoreCase("0123")){
			System.out.println("We will show listings form these compainies");
			System.out.println(greeting);
		}
		
		if(welcome.contains("0")){
			System.out.println("We will show listings from these companies:");
			System.out.println(greeting.get(0));
		}
		
		if(welcome.contains("1")){
			System.out.println("We will show listings from these companies: ");
			System.out.println(greeting.get(1));
		}
		
		if(welcome.contains("2")){
			System.out.println("We will show listings from these companies: ");
			System.out.println(greeting.get(2));
		}
		
		if(welcome.contains("3")){
			System.out.println("We will show listings from these companies: ");
			System.out.println(greeting.get(3));
		}
		System.out.println("We will now search for listings with these specifications");
		System.out.println();
		
		
	}
	
	public void homeDescriptionInput(){
		ArrayList homeDescription = new ArrayList();
		homeDescription.add("Style");
		homeDescription.add("Bedrooms");
		homeDescription.add("Bathrooms");
		homeDescription.add("Lot Size");
		homeDescription.add("Age");
		homeDescription.add("Price");
		homeDescription.add("Jurisdiction");
		homeDescription.add("Commute (miles)");
		System.out.println("Lets start with what filters you want for your listings:");
		for(int x = 0; x < homeDescription.size(); x++){
			System.out.println(x + ")" + homeDescription.get(x));
		}
		System.out.println("To start, choose from the following filters: please use only numbers");
		decision = kybd.nextLine();
		
		
		if(decision.equalsIgnoreCase("0")){
			ArrayList<String> style = new ArrayList<String>();
			style.add("Cape Cod");
			style.add("Rambler");
			style.add("Colonial");
			style.add("Split - Level");
			style.add("Georgian");
			style.add("Townhouse");
			style.add("Condominium");
			
			for(int j = 0; j < style.size(); j++){
				System.out.println(j + ")" + style.get(j));
			}
			System.out.println("choose styles from the following");
			choice = kybd.nextLine();
			if(choice.contains("0")){
				System.out.println("Style Selected: " + style.get(0));
			}
			if(choice.contains("1")){
				System.out.println("Style Selected: " + style.get(1));
			}
			if(choice.contains("2")){
				System.out.println("Style Selected: " + style.get(2));
			}
			if(choice.contains("3")){
				System.out.println("Style Selected: " + style.get(3));
			}
			if(choice.contains("4")){
				System.out.println("Style Selected: " + style.get(4));
			}
			if(choice.contains("5")){
				System.out.println("Style Selected: " + style.get(5));
			}
			if(choice.contains("6")){
				System.out.println("Style Selected: " + style.get(6));
			}
			if(choice.contains("7")){
				System.out.println("Style Selected: " + style.get(7));
			}
		}
		
		if(decision.equalsIgnoreCase("1")){
			ArrayList<String>bedrooms = new ArrayList<String>();
			bedrooms.add("1-3 bedrooms");
			bedrooms.add("3-5 bedrooms");
			bedrooms.add("more than 5 bedrooms");
			System.out.println();
			for(int j = 0; j < bedrooms.size(); j++){
				System.out.println(j + ")" + bedrooms.get(j));
			}
			System.out.println("Select from the following: bedrooms (please use numbers only)");
			beds = kybd.nextLine();
			
			if(beds.equalsIgnoreCase("0")){
				System.out.println("Number of Beds: " + bedrooms.get(0));
			}
			if(beds.equalsIgnoreCase("1")){
				System.out.println("Number of Beds: " + bedrooms.get(1));
			}
			if(beds.equalsIgnoreCase("2")){
				System.out.println("Number of Beds: " + bedrooms.get(2));
			}
			
		}
		
		if(decision.equalsIgnoreCase("2")){
			ArrayList<String>bathrooms = new ArrayList<String>();
			bathrooms.add("1-3 bathrooms");
			bathrooms.add("3-5 bathrooms");
			bathrooms.add("more than 5 bathroom");
			System.out.println();
			for(int j = 0; j < bathrooms.size(); j++){
				System.out.println(j + ")" + bathrooms.get(j));
			}
			System.out.println("Select from the following: bedrooms (please use numbers only)");
			bath = kybd.nextLine();
			
			if(bath.equalsIgnoreCase("0")){
				System.out.println("Number of Bathrooms: " + bathrooms.get(0));
			}
			if(bath.equalsIgnoreCase("1")){
				System.out.println("Number of Bathrooms: " + bathrooms.get(1));
			}
			if(bath.equalsIgnoreCase("2")){
				System.out.println("Number of Bathrooms: " + bathrooms.get(2));
			}
		
		}
		
		if(decision.equalsIgnoreCase("3")){
			System.out.println("How big do you want your lot to be:");
			lot = kybd.nextLine();
			System.out.println("Your lot size is: " + lot);
			
		}
		
		if(decision.equalsIgnoreCase("4")){
			ArrayList<String>years = new ArrayList<String>();
			years.add("less than 5 years");
			years.add("more than 5 years");
			for(int j = 0; j < years.size(); j++){
				System.out.println(j + ")" + years.get(j));
			}
			System.out.println("Choose from the following for age of house: ");
			age = kybd.nextLine();
			
			
			if(age.equalsIgnoreCase("0")){
				System.out.println("Age of listing: " + years.get(0));
			}
			if(age.equalsIgnoreCase("1")){
				System.out.println("Age of listing: " + years.get(1));
			}
			
			
			
		}
		
		if(decision.equalsIgnoreCase("5")){
			ArrayList<String>priceOfListings = new ArrayList<String>();
			priceOfListings.add("less than $500k");
			priceOfListings.add("greater than $500k");
			
			
			for(int j = 0; j < priceOfListings.size(); j++){
				System.out.println(j + ")" + priceOfListings.get(j));
			}
			System.out.println("What is your price range for your new home: please use numbers only");
			price = kybd.nextLine();
			
			
			if(price.equalsIgnoreCase("0")){
				System.out.println("Your price range for your home listings: " + priceOfListings.get(0));
			}
			if(price.equalsIgnoreCase("1")){
				System.out.println("Your price range for your home listings: " + priceOfListings.get(1));
			}
			
			
			
		}
		
		if(decision.equalsIgnoreCase("6")){
			ArrayList<String>townHall = new ArrayList<String>();
			townHall.add("Arlington");
			townHall.add("Alexandria");
			townHall.add("Fairfax");
			townHall.add("Falls Church");
			townHall.add("District of Columbia");
			for(int j = 0; j < townHall.size(); j++){
				System.out.println(j + ")" + townHall.get(j));
			}
			System.out.println("Which jurisdiction would you prefer your listings to be in: please use numbers only" );
			jurisdiction = kybd.nextLine();
			
			
			if(jurisdiction.equalsIgnoreCase("0")){
				System.out.println("Selected Jurisdiction: " + townHall.get(0));
			}
			
			if(jurisdiction.equalsIgnoreCase("1")){
				System.out.println("Selected Jurisdiction: " + townHall.get(1));
			}
			
			if(jurisdiction.equalsIgnoreCase("2")){
				System.out.println("Selected Jurisdiction: " + townHall.get(2));
			}
			
			if(jurisdiction.equalsIgnoreCase("3")){
				System.out.println("Selected Jurisdiction: " + townHall.get(3));
			}
			
			if(jurisdiction.equalsIgnoreCase("4")){
				System.out.println("Selected Jurisdiction: " + townHall.get(4));
			}
			
		}
		
		  if(decision.equalsIgnoreCase("7")){
			ArrayList<String>travel = new ArrayList<String>();
			travel.add("less than 5 miles");
			travel.add("5-10 miles ");
			travel.add("greater than 10 miles");
			for(int j = 0; j < travel.size(); j++){
				System.out.println(j + ")" + travel.get(j));
			}
			System.out.println("What is your commute preference for the home listings: please use numbers only");
			commute = kybd.nextLine();
			
			
			if(commute.equalsIgnoreCase("0")){
				System.out.println("Commute Preference: " + travel.get(0));
			}
			if(commute.equalsIgnoreCase("1")){
				System.out.println("Commute Preference: " + travel.get(1));
			}
			if(commute.equalsIgnoreCase("2")){
				System.out.println("Commute Preference: " + travel.get(2));
			}	
				
		  }
			
	}
	
	

	public String getWelcome() {
		return welcome;
	}

	public void setWelcome(String j) {
		j = welcome;
	}

	public String getDecision() {
		return decision;
	}

	public void setDecision(String d) {
		d = decision;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String c) {
		c = choice;
	}

	public String getBeds() {
		return beds;
	}

	public void setBeds(String b) {
		b = beds;
	}

	public String getBath() {
		return bath;
	}

	public void setBath(String b) {
		b = bath;
	}

	public String getLot() {
		return lot;
	}

	public void setLot(String lo) {
		lo = lot;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String a) {
		a = age;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String p) {
		p = price;
	}

	public String getJurisdiction() {
		return jurisdiction;
	}

	public void setJurisdiction(String jury) {
		jury = jurisdiction;
	}

	public String getCommute() {
		return commute;
	}

	public void setCommute(String com) {
		com = commute;
	}

	public static Scanner getKybd() {
		return kybd;
	}

	public static void setKybd(Scanner kybd) {
		RealEstateAgent.kybd = kybd;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
