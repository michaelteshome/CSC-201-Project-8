import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;
public class Agency extends RealEstateAgent {

	private String century21 = "Century21 Listings.txt";
	private String remax = "Remax Listings.txt";
	private String Long_Foster = "Long & Foster Listings.txt";
	private String mcEnearney = "McEnearney Listings.txt";
	private ArrayList <String> Century21 = new ArrayList <String>();
	private ArrayList <String> Remax = new ArrayList <String>();
	private ArrayList <String> LongFoster = new ArrayList <String>();
	private ArrayList <String> McEnearney = new ArrayList <String>();
	
	public Agency(){
		
	}
	
	public void findListing() {
		
	}
	
	public void displayListings(){
		
		
		if(super.getWelcome().contains("0")) {
			Century21Listings();
			//readCentury21();
			//printCentury21();
		}
		
		if(super.getWelcome().contains("1")) {
			RemaxListings();
			//readRemax();
			//printRemax();
		}
		
		if(super.getWelcome().contains("2")) {
			LongFosterListings();
			//readLongFoster();
			//printLongFoster();
		}
		
		if(super.getWelcome().contains("3")) {
			McEnearneyListings();
			//readMcEnearney();
			//printMcEnearney();
		}
	 // Start the loop for the style
		
		
		
		
	}
	
	public void Century21Listings() {
		readCentury21();
		if(super.getDecision().contains("0") && super.getChoice().contains("0")) {
			System.out.println(Century21.get(0));
			System.out.println(Century21.get(44));
			System.out.println(Century21.get(45));
		}
		
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("1")) {
			System.out.println(Century21.get(0));
			System.out.println(Century21.get(17));
			System.out.println(Century21.get(18));
			System.out.println(Century21.get(32));
			System.out.println(Century21.get(33));
		}
		
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("2")) {
			System.out.println(Century21.get(0));
			System.out.println(Century21.get(56) + "\n" + Century21.get(57));
			System.out.println(Century21.get(50) + "\n" + Century21.get(51));
			System.out.println(Century21.get(41) + "\n" + Century21.get(42));
			System.out.println(Century21.get(23) + "\n" + Century21.get(24));
			System.out.println(Century21.get(8) + "\n" + Century21.get(9));
			System.out.println(Century21.get(2) + "\n" + Century21.get(3));
		}
		
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("3")) {
			System.out.println(Century21.get(0));
			System.out.println(Century21.get(26));
			System.out.println(Century21.get(27));
			System.out.println(Century21.get(38));
			System.out.println(Century21.get(39));
		}
		
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("4") ) {
			System.out.println(Century21.get(0));
			System.out.println(Century21.get(47));
			System.out.println(Century21.get(48));
			System.out.println(Century21.get(11));
			System.out.println(Century21.get(12));
		}
		
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("5") ) {
			System.out.println(Century21.get(0));
			System.out.println(Century21.get(14));
			System.out.println(Century21.get(15));
			System.out.println(Century21.get(20));
			System.out.println(Century21.get(21));
			System.out.println(Century21.get(29));
			System.out.println(Century21.get(30));
			System.out.println(Century21.get(59));
			System.out.println(Century21.get(60));
		}
		
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("6")) {
			System.out.println(Century21.get(0));
			System.out.println(Century21.get(53));
			System.out.println(Century21.get(54));
			System.out.println(Century21.get(35));
			System.out.println(Century21.get(36));
			System.out.println(Century21.get(5));
			System.out.println(Century21.get(6));
		}
		
		if(super.getDecision().equalsIgnoreCase("5") && super.getPrice().equalsIgnoreCase("0")) {
			System.out.println(Century21.get(0));
			System.out.println(Century21.get(29) + "\n" + Century21.get(30));
			System.out.println(Century21.get(2) + "\n" + Century21.get(3));
			System.out.println(Century21.get(5) + "\n" + Century21.get(6));
			System.out.println(Century21.get(8) + "\n" + Century21.get(9));
			System.out.println(Century21.get(11) + "\n" + Century21.get(12));
			System.out.println(Century21.get(14) + "\n" + Century21.get(15));
			System.out.println(Century21.get(17) + "\n" + Century21.get(18));
			System.out.println(Century21.get(20) + "\n" + Century21.get(21));
			System.out.println(Century21.get(23) + "\n" + Century21.get(24));
			System.out.println(Century21.get(26) + "\n" + Century21.get(27));
			System.out.println(Century21.get(32) + "\n" + Century21.get(33));
			System.out.println(Century21.get(35) + "\n" + Century21.get(36));
			System.out.println(Century21.get(38) + "\n" + Century21.get(39));
			System.out.println(Century21.get(41) + "\n" + Century21.get(42));
			System.out.println(Century21.get(44) + "\n" + Century21.get(45));
			System.out.println(Century21.get(47) + "\n" + Century21.get(48));
			System.out.println(Century21.get(53) + "\n" + Century21.get(54));
			System.out.println(Century21.get(56) + "\n" + Century21.get(57));
			System.out.println(Century21.get(59) + "\n" + Century21.get(60));
		}
		if(super.getDecision().equalsIgnoreCase("5") && super.getPrice().equalsIgnoreCase("0")) {
			System.out.println(Century21.get(0));
			System.out.println(Century21.get(50) + "\n" + Century21.get(51));
		}
		//case for reading age greater than 5 years
		if(super.getDecision().equalsIgnoreCase("4") && super.getAge().equalsIgnoreCase("0")) {
			System.out.println(Century21.get(0));
			System.out.println(Century21.get(5) + "\n" + Century21.get(6));
			System.out.println(Century21.get(8) + "\n" + Century21.get(9));
			System.out.println(Century21.get(11) + "\n" + Century21.get(12));
			System.out.println(Century21.get(13) + "\n" + Century21.get(14));
		}
		
		//case for reading age less than 5 years
		if(super.getDecision().equalsIgnoreCase("4") && super.getAge().equalsIgnoreCase("1")) {
			System.out.println(Century21.get(0));
			
		}
		
		

		

		
		
		

		



		
	}
	
	
	public void RemaxListings() {
		readRemax();
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("0")) {
			System.out.println(Remax.get(0));
			System.out.println(Remax.get(44) + "\n" + Remax.get(45));
		}
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("1")) {
			System.out.println(Remax.get(0));
			System.out.println(Remax.get(17) + "\n" + Remax.get(18));
			System.out.println(Remax.get(32) + "\n" + Remax.get(33));
		}
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("2")) {
			System.out.println(Remax.get(0));
			System.out.println(Remax.get(8) + "\n" + Remax.get(9));
			System.out.println(Remax.get(41) + "\n" + Remax.get(42));
		}
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("3")) {
			System.out.println(Remax.get(0));
			System.out.println(Remax.get(2) + "\n" + Remax.get(3));
			System.out.println(Remax.get(23) + "\n" + Remax.get(24));
			System.out.println(Remax.get(26) + "\n" + Remax.get(27));
			System.out.println(Remax.get(38) + "\n" + Remax.get(39));
			System.out.println(Remax.get(50) + "\n" + Remax.get(51));
		}
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("4")) {
			System.out.println(Remax.get(0));
			System.out.println(Remax.get(11) + "\n" + Remax.get(12));
			System.out.println(Remax.get(47) + "\n" + Remax.get(48));
			System.out.println(Remax.get(56) + "\n" + Remax.get(57));
		}
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("5")) {
			System.out.println(Remax.get(0));
			System.out.println(Remax.get(14) + "\n" + Remax.get(15));
			System.out.println(Remax.get(20) + "\n" + Remax.get(21));
			System.out.println(Remax.get(29) + "\n" + Remax.get(30));
			System.out.println(Remax.get(59) + "\n" + Remax.get(60));
		}
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("7")) {
			System.out.println(Remax.get(0));
			System.out.println(Remax.get(5) + "\n" + Remax.get(6));
			System.out.println(Remax.get(35) + Remax.get(36));
			System.out.println(Remax.get(53) + Remax.get(54));
		}
		//Start Loop for Bedrooms and Bathrooms. use super.getBath() and super.getBeds() to evaluate options
		if(super.getDecision().equalsIgnoreCase("1") && super.getBeds().equalsIgnoreCase("0")) {
			System.out.println(Remax.get(0));
			System.out.println(Remax.get(5) + "\n" + Remax.get(6));
			System.out.println(Remax.get(8) + "\n" + Remax.get(9));
			System.out.println(Remax.get(11) + "\n" + Remax.get(12));
			System.out.println(Remax.get(14) + "\n" + Remax.get(15));
			System.out.println(Remax.get(20) + "\n" + Remax.get(21));
			System.out.println(Remax.get(23) + "\n" + Remax.get(24));
			System.out.println(Remax.get(26) + "\n" + Remax.get(27));
			System.out.println(Remax.get(29) + "\n" + Remax.get(30));
			System.out.println(Remax.get(32) + "\n" + Remax.get(33));
			System.out.println(Remax.get(35) + "\n" + Remax.get(36));
			System.out.println(Remax.get(41) + "\n" + Remax.get(42));
			System.out.println(Remax.get(44) + "\n" + Remax.get(45));
			System.out.println(Remax.get(47) + "\n" + Remax.get(48));
			System.out.println(Remax.get(53) + "\n" + Remax.get(54));
			System.out.println(Remax.get(56) + "\n" + Remax.get(57));
			System.out.println(Remax.get(59) + "\n" + Remax.get(60));
		}
		if(super.getDecision().equalsIgnoreCase("1") && super.getBeds().equalsIgnoreCase("1")) {
			System.out.println(Remax.get(0));
			System.out.println(Remax.get(2) + "\n" + Remax.get(3));
			System.out.println(Remax.get(8) + "\n" + Remax.get(9));
			System.out.println(Remax.get(11) + "\n" + Remax.get(12));
			System.out.println(Remax.get(17) + "\n" + Remax.get(18));
			System.out.println(Remax.get(23) + "\n" + Remax.get(24));
			System.out.println(Remax.get(26) + "\n" + Remax.get(27));
			System.out.println(Remax.get(29) + "\n" + Remax.get(30));
			System.out.println(Remax.get(32) + "\n" + Remax.get(33));
			System.out.println(Remax.get(38) + "\n" + Remax.get(39));
			System.out.println(Remax.get(41) + "\n" + Remax.get(45));
			System.out.println(Remax.get(44) + "\n" + Remax.get(45));
			System.out.println(Remax.get(47) + "\n" + Remax.get(48));
			System.out.println(Remax.get(50) + "\n" + Remax.get(51));
			System.out.println(Remax.get(53) + "\n" + Remax.get(54));
			System.out.println(Remax.get(56) + "\n" + Remax.get(57));
		}
		
		if(super.getDecision().equalsIgnoreCase("2") && super.getBath().equalsIgnoreCase("0")) {
			System.out.println(Remax.get(0));
			System.out.println(Remax.get(1) + "\n" + Remax.get(3));
			System.out.println(Remax.get(5) + "\n" + Remax.get(6));
			System.out.println(Remax.get(8) + "\n" + Remax.get(9));
			System.out.println(Remax.get(11) + "\n" + Remax.get(12));
			System.out.println(Remax.get(14) + "\n" + Remax.get(15));
			System.out.println(Remax.get(17) + "\n" + Remax.get(18));
			System.out.println(Remax.get(20) + "\n" + Remax.get(21));
			System.out.println(Remax.get(23) + "\n" + Remax.get(24));
			System.out.println(Remax.get(26) + "\n" + Remax.get(27));
			System.out.println(Remax.get(29) + "\n" + Remax.get(30));
			System.out.println(Remax.get(32) + "\n" + Remax.get(33));
			System.out.println(Remax.get(35) + "\n" + Remax.get(36));
			System.out.println(Remax.get(38) + "\n" + Remax.get(39));
			System.out.println(Remax.get(41) + "\n" + Remax.get(42));
			System.out.println(Remax.get(44) + "\n" + Remax.get(45));
			System.out.println(Remax.get(47) + "\n" + Remax.get(48));
			System.out.println(Remax.get(50) + "\n" + Remax.get(51));
			System.out.println(Remax.get(53) + "\n" + Remax.get(54));
			System.out.println(Remax.get(56) + "\n" + Remax.get(57));
			System.out.println(Remax.get(59) + "\n" + Remax.get(60));
			
		}
		if(super.getDecision().equalsIgnoreCase("2") && super.getBath().equalsIgnoreCase("1")) {
			System.out.println(Remax.get(0));
			System.out.println(Remax.get(11) + "\n" + Remax.get(12));
			System.out.println(Remax.get(17) + "\n" + Remax.get(18));
		}
		if(super.getDecision().equalsIgnoreCase("2") && super.getBath().equalsIgnoreCase("2")) {
			System.out.println(Remax.get(0));
		}
		//Start loop for age
		if(super.getDecision().equalsIgnoreCase("4") && super.getAge().equalsIgnoreCase("0")) {
			System.out.println(Remax.get(0));
			System.out.println(Remax.get(29) + "\n" + Remax.get(30));
			System.out.println(Remax.get(59) + "\n" + Remax.get(60));
		}
		if(super.getDecision().equalsIgnoreCase("4") && super.getAge().equalsIgnoreCase("1")) {
			System.out.println(Remax.get(0));
			System.out.println(Remax.get(2) + "\n" + Remax.get(3));
			System.out.println(Remax.get(5) + "\n" + Remax.get(6));
			System.out.println(Remax.get(8) + "\n" + Remax.get(9));
			System.out.println(Remax.get(11) + "\n" + Remax.get(12));
			System.out.println(Remax.get(14) + "\n" + Remax.get(15));
			System.out.println(Remax.get(17) + "\n" + Remax.get(18));
			System.out.println(Remax.get(20) + "\n" + Remax.get(21));
			System.out.println(Remax.get(23) + "\n" + Remax.get(24));
			System.out.println(Remax.get(26) + "\n" + Remax.get(27));
			System.out.println(Remax.get(32) + "\n" + Remax.get(33));
			System.out.println(Remax.get(35) + "\n" + Remax.get(36));
			System.out.println(Remax.get(38) + "\n" + Remax.get(39));
			System.out.println(Remax.get(41) + "\n" + Remax.get(42));
			System.out.println(Remax.get(44) + "\n" + Remax.get(45));
			System.out.println(Remax.get(47) + "\n" + Remax.get(48));
			System.out.println(Remax.get(50) + "\n" + Remax.get(51));
			System.out.println(Remax.get(53) + "\n" + Remax.get(54));
			System.out.println(Remax.get(56) + "\n" + Remax.get(57));
		}
		
		//Start Loop for Price
		if(super.getDecision().equalsIgnoreCase("5") && super.getPrice().equalsIgnoreCase("0")) {
			System.out.println(Remax.get(0));
			System.out.println(Remax.get(2) + "\n" + Remax.get(3));
			System.out.println(Remax.get(5) + "\n" + Remax.get(6));
			System.out.println(Remax.get(8) + "\n" + Remax.get(9));
			System.out.println(Remax.get(11) + "\n" + Remax.get(12));
			System.out.println(Remax.get(14) + "\n" + Remax.get(15));
			System.out.println(Remax.get(17) + "\n" + Remax.get(18));
			System.out.println(Remax.get(20) + "\n" + Remax.get(21));
			System.out.println(Remax.get(23) + "\n" + Remax.get(24));
			System.out.println(Remax.get(26) + "\n" + Remax.get(27));
			System.out.println(Remax.get(32) + "\n" + Remax.get(33));
			System.out.println(Remax.get(35) + "\n" + Remax.get(36));
			System.out.println(Remax.get(38) + "\n" + Remax.get(39));
			System.out.println(Remax.get(41) + "\n" + Remax.get(42));
			System.out.println(Remax.get(44) + "\n" + Remax.get(45));
			System.out.println(Remax.get(47) + "\n" + Remax.get(48));
			System.out.println(Remax.get(50) + "\n" + Remax.get(51));
			System.out.println(Remax.get(53) + "\n" + Remax.get(54));
			System.out.println(Remax.get(56) + "\n" + Remax.get(57));
			System.out.println(Remax.get(29) + "\n" + Remax.get(30));
			System.out.println(Remax.get(59) + "\n" + Remax.get(60));
		}
		if(super.getDecision().equalsIgnoreCase("5") && super.getPrice().equalsIgnoreCase("1")) {
			System.out.println(Remax.get(0));
		}
		//Start Loop for Jurisdiction
		if(super.getDecision().equalsIgnoreCase("6") && super.getJurisdiction().equalsIgnoreCase("0")) {
			System.out.println(Remax.get(0));
			
		}
		if(super.getDecision().equalsIgnoreCase("6") && super.getJurisdiction().equalsIgnoreCase("1")) {
			System.out.println(Remax.get(0));
			System.out.println(Remax.get(8) + "\n" + Remax.get(9));
			System.out.println(Remax.get(20) + "\n" + Remax.get(21));
			System.out.println(Remax.get(26) + "\n" + Remax.get(27));
			System.out.println(Remax.get(35) + "\n" + Remax.get(36));
			System.out.println(Remax.get(59) + "\n" + Remax.get(60));
		}
		if(super.getDecision().equalsIgnoreCase("6") && super.getJurisdiction().equalsIgnoreCase("2")) {
			System.out.println(Remax.get(0));
			System.out.println(Remax.get(2) + "\n" + Remax.get(3));
			System.out.println(Remax.get(11) + "\n" + Remax.get(12));
			System.out.println(Remax.get(17) + "\n" + Remax.get(18));
			System.out.println(Remax.get(23) + "\n" + Remax.get(24));
			System.out.println(Remax.get(32) + "\n" + Remax.get(33));
			System.out.println(Remax.get(38) + "\n" + Remax.get(39));
			System.out.println(Remax.get(41) + "\n" + Remax.get(42));
			System.out.println(Remax.get(50) + "\n" + Remax.get(51));
			System.out.println(Remax.get(56) + "\n" + Remax.get(57));
		}
		if(super.getDecision().equalsIgnoreCase("6") && super.getJurisdiction().equalsIgnoreCase("3")) {
			System.out.println(Remax.get(0));
			System.out.println(Remax.get(5) + "\n" + Remax.get(6));
			System.out.println(Remax.get(47) + "\n" + Remax.get(48));
			System.out.println(Remax.get(14) + "\n" + Remax.get(15));
			System.out.println(Remax.get(29) + "\n" + Remax.get(30));
			System.out.println(Remax.get(53) + "\n" + Remax.get(54));
		}
		if(super.getDecision().equalsIgnoreCase("6") && super.getJurisdiction().equalsIgnoreCase("4")) {
			System.out.println(Remax.get(0));
		}
		//Start Loop for commute
		if(super.getDecision().equalsIgnoreCase("7") && super.getCommute().equalsIgnoreCase("0")) {
			System.out.println(Remax.get(0));
			System.out.println(Remax.get(20) + "\n" + Remax.get(21));
			System.out.println(Remax.get(41) + "\n" + Remax.get(42));
			System.out.println(Remax.get(59) + "\n" + Remax.get(60));
		}
		if(super.getDecision().equalsIgnoreCase("7") && super.getCommute().equalsIgnoreCase("1")) {
			System.out.println(Remax.get(0));
			System.out.println(Remax.get(2) + "\n" + Remax.get(3));
			System.out.println(Remax.get(8) + "\n" + Remax.get(9));
			System.out.println(Remax.get(23) + "\n" + Remax.get(24));
			System.out.println(Remax.get(32) + "\n" + Remax.get(33));
			System.out.println(Remax.get(35) + "\n" + Remax.get(36));
			System.out.println(Remax.get(38) + "\n" + Remax.get(39));
			System.out.println(Remax.get(44) + "\n" + Remax.get(45));
			System.out.println(Remax.get(53) + "\n" + Remax.get(54));
		}
		if(super.getDecision().equalsIgnoreCase("7") && super.getCommute().equalsIgnoreCase("2")) {
			System.out.println(Remax.get(0));
			System.out.println(Remax.get(5) + "\n" + Remax.get(6));
			System.out.println(Remax.get(11) + "\n" + Remax.get(12));
			System.out.println(Remax.get(14) + "\n" + Remax.get(15));
			System.out.println(Remax.get(17) + "\n" + Remax.get(18));
			System.out.println(Remax.get(26) + "\n" + Remax.get(27));
			System.out.println(Remax.get(47) + "\n" + Remax.get(48));
			System.out.println(Remax.get(50) + "\n" + Remax.get(51));
			System.out.println(Remax.get(56) + "\n" + Remax.get(57));
		}
		
		
	}
	
	public void LongFosterListings() {
			readLongFoster();
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("0")) {
			System.out.println(LongFoster.get(0));
			System.out.println(LongFoster.get(44) + "\n" + LongFoster.get(45));
			System.out.println(LongFoster.get(50) + "\n" + LongFoster.get(51));
		}
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("1")) {
			System.out.println(LongFoster.get(0));
			System.out.println(LongFoster.get(8) + "\n" + LongFoster.get(9));
			System.out.println(LongFoster.get(17) + "\n" + LongFoster.get(18));
			System.out.println(LongFoster.get(32) + "\n" + LongFoster.get(33));
			System.out.println(LongFoster.get(56) + "\n" + LongFoster.get(57));
		}
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("2") ) {
			System.out.println(LongFoster.get(0));
			System.out.println(LongFoster.get(23) + "\n" + LongFoster.get(24));
		}
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("3")) {
			System.out.println(LongFoster.get(0));
			System.out.println(LongFoster.get(26) + "\n" + LongFoster.get(27));
			System.out.println(LongFoster.get(38) + "\n" + LongFoster.get(39));
		}
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("4")) {
			System.out.println(LongFoster.get(0));
			System.out.println(LongFoster.get(2) + "\n" + LongFoster.get(3));
			System.out.println(LongFoster.get(11) + "\n" + LongFoster.get(12));
			System.out.println(LongFoster.get(41) + "\n" + LongFoster.get(42));
			System.out.println(LongFoster.get(47) + "\n" + LongFoster.get(48));
		}
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("5")) {
			System.out.println(LongFoster.get(0));
			System.out.println(LongFoster.get(14) + "\n" + LongFoster.get(15));
			System.out.println(LongFoster.get(20) + "\n" + LongFoster.get(21));
			System.out.println(LongFoster.get(29) + "\n" + LongFoster.get(30));
			System.out.println(LongFoster.get(59) + "\n" + LongFoster.get(60));
		}
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("6")) {
			System.out.println(LongFoster.get(0));
			System.out.println(LongFoster.get(5) + "\n" + LongFoster.get(6));
			System.out.println(LongFoster.get(53) + "\n" + LongFoster.get(54));
			System.out.println(LongFoster.get(35) + "\n" + LongFoster.get(36));
		}
		
		//Start loop for bedrooms
		if(super.getDecision().equalsIgnoreCase("1") && super.getBeds().equalsIgnoreCase("0")) {
			System.out.println(LongFoster.get(0));
			System.out.println(LongFoster.get(5) + "\n" + LongFoster.get(6));
			System.out.println(LongFoster.get(8) + "\n" + LongFoster.get(9));
			System.out.println(LongFoster.get(14) + "\n" + LongFoster.get(15));
			System.out.println(LongFoster.get(20) + "\n" + LongFoster.get(21));
			System.out.println(LongFoster.get(29) + "\n" + LongFoster.get(30));
			System.out.println(LongFoster.get(35) + "\n" + LongFoster.get(36));
			System.out.println(LongFoster.get(53) + "\n" + LongFoster.get(54));
		}
		if(super.getDecision().equalsIgnoreCase("1") && super.getBeds().equalsIgnoreCase("1")) {
			System.out.println(LongFoster.get(0));
			System.out.println(LongFoster.get(2) + "\n" + LongFoster.get(3));
			System.out.println(LongFoster.get(11) + "\n" + LongFoster.get(12));
			System.out.println(LongFoster.get(17) + "\n" + LongFoster.get(18));
			System.out.println(LongFoster.get(23) + "\n" + LongFoster.get(24));
			System.out.println(LongFoster.get(26) + "\n" + LongFoster.get(27));
			System.out.println(LongFoster.get(32) + "\n" + LongFoster.get(33));
			System.out.println(LongFoster.get(38) + "\n" + LongFoster.get(39));
			System.out.println(LongFoster.get(41) + "\n" + LongFoster.get(42));
			System.out.println(LongFoster.get(44) + "\n" + LongFoster.get(45));
			System.out.println(LongFoster.get(47) + "\n" + LongFoster.get(48));
			System.out.println(LongFoster.get(50) + "\n" + LongFoster.get(51));
			System.out.println(LongFoster.get(56) + "\n" + LongFoster.get(57));
			System.out.println(LongFoster.get(59) + "\n" + LongFoster.get(60));
		}
		
		//Start loop for bathrooms
		if(super.getDecision().equalsIgnoreCase("2") && super.getBath().equalsIgnoreCase("0")) {
			System.out.println(LongFoster.get(0));
			System.out.println(LongFoster.get(2) + "\n" + LongFoster.get(3));
			System.out.println(LongFoster.get(11) + "\n" + LongFoster.get(12));
			System.out.println(LongFoster.get(17) + "\n" + LongFoster.get(18));
			System.out.println(LongFoster.get(23) + "\n" + LongFoster.get(24));
			System.out.println(LongFoster.get(26) + "\n" + LongFoster.get(27));
			System.out.println(LongFoster.get(32) + "\n" + LongFoster.get(33));
			System.out.println(LongFoster.get(38) + "\n" + LongFoster.get(39));
			System.out.println(LongFoster.get(41) + "\n" + LongFoster.get(42));
			System.out.println(LongFoster.get(44) + "\n" + LongFoster.get(45));
			System.out.println(LongFoster.get(47) + "\n" + LongFoster.get(48));
			System.out.println(LongFoster.get(50) + "\n" + LongFoster.get(51));
			System.out.println(LongFoster.get(56) + "\n" + LongFoster.get(57));
			System.out.println(LongFoster.get(59) + "\n" + LongFoster.get(60));
			System.out.println(LongFoster.get(0));
			System.out.println(LongFoster.get(5) + "\n" + LongFoster.get(6));
			System.out.println(LongFoster.get(8) + "\n" + LongFoster.get(9));
			System.out.println(LongFoster.get(14) + "\n" + LongFoster.get(15));
			System.out.println(LongFoster.get(20) + "\n" + LongFoster.get(21));
			System.out.println(LongFoster.get(29) + "\n" + LongFoster.get(30));
			System.out.println(LongFoster.get(35) + "\n" + LongFoster.get(36));
			System.out.println(LongFoster.get(53) + "\n" + LongFoster.get(54));
			
		}
		//Start loop for Age
		if(super.getDecision().equalsIgnoreCase("4") && super.getAge().equalsIgnoreCase("0")) {
			System.out.println(LongFoster.get(0));
			System.out.println(LongFoster.get(2) + "\n" + LongFoster.get(3));
			System.out.println(LongFoster.get(5) + "\n" + LongFoster.get(6));
			System.out.println(LongFoster.get(26) + "\n" + LongFoster.get(27));
			System.out.println(LongFoster.get(32) + "\n" + LongFoster.get(33));
			System.out.println(LongFoster.get(44) + "\n" + LongFoster.get(45));
			System.out.println(LongFoster.get(47) + "\n" + LongFoster.get(48));
			System.out.println(LongFoster.get(53) + "\n" + LongFoster.get(54));
		}
		if(super.getDecision().equalsIgnoreCase("4") && super.getAge().equalsIgnoreCase("1")) {
			System.out.println(LongFoster.get(0));
			System.out.println(LongFoster.get(8) + "\n" + LongFoster.get(9));
			System.out.println(LongFoster.get(11) + "\n" + LongFoster.get(12));
			System.out.println(LongFoster.get(14) + "\n" + LongFoster.get(15));
			System.out.println(LongFoster.get(17) + "\n" + LongFoster.get(18));
			System.out.println(LongFoster.get(20) + "\n" + LongFoster.get(21));
			System.out.println(LongFoster.get(23) + "\n" + LongFoster.get(24));
			System.out.println(LongFoster.get(29) + "\n" + LongFoster.get(30));
			System.out.println(LongFoster.get(35) + "\n" + LongFoster.get(36));
			System.out.println(LongFoster.get(38) + "\n" + LongFoster.get(39));
			System.out.println(LongFoster.get(41) + "\n" + LongFoster.get(42));
			System.out.println(LongFoster.get(50) + "\n" + LongFoster.get(51));
			System.out.println(LongFoster.get(56) + "\n" + LongFoster.get(57));
			System.out.println(LongFoster.get(59) + "\n" + LongFoster.get(60));
		}
		//Start Loop for Price
		if(super.getDecision().equalsIgnoreCase("5") && super.getPrice().equalsIgnoreCase("0")) {
			System.out.println(LongFoster.get(0));
			System.out.println(LongFoster.get(8) + "\n" + LongFoster.get(9));
			System.out.println(LongFoster.get(11) + "\n" + LongFoster.get(12));
			System.out.println(LongFoster.get(14) + "\n" + LongFoster.get(15));
			System.out.println(LongFoster.get(17) + "\n" + LongFoster.get(18));
			System.out.println(LongFoster.get(20) + "\n" + LongFoster.get(21));
			System.out.println(LongFoster.get(23) + "\n" + LongFoster.get(24));
			System.out.println(LongFoster.get(29) + "\n" + LongFoster.get(30));
			System.out.println(LongFoster.get(35) + "\n" + LongFoster.get(36));
			System.out.println(LongFoster.get(38) + "\n" + LongFoster.get(39));
			System.out.println(LongFoster.get(41) + "\n" + LongFoster.get(42));
			System.out.println(LongFoster.get(50) + "\n" + LongFoster.get(51));
			System.out.println(LongFoster.get(56) + "\n" + LongFoster.get(57));
			System.out.println(LongFoster.get(59) + "\n" + LongFoster.get(60));
			System.out.println(LongFoster.get(2) + "\n" + LongFoster.get(3));
			System.out.println(LongFoster.get(5) + "\n" + LongFoster.get(6));
			System.out.println(LongFoster.get(26) + "\n" + LongFoster.get(27));
			System.out.println(LongFoster.get(32) + "\n" + LongFoster.get(33));
			System.out.println(LongFoster.get(44) + "\n" + LongFoster.get(45));
			System.out.println(LongFoster.get(47) + "\n" + LongFoster.get(48));
			System.out.println(LongFoster.get(53) + "\n" + LongFoster.get(54));
		}
		//Start loop for Jurisdiction
		if(super.getDecision().equalsIgnoreCase("6") && super.getJurisdiction().equalsIgnoreCase("0")) {
			System.out.println(LongFoster.get(0));
			System.out.println(LongFoster.get(8) + "\n" + LongFoster.get(9));
			System.out.println(LongFoster.get(26) + "\n" + LongFoster.get(27));
			System.out.println(LongFoster.get(23) + "\n" + LongFoster.get(24));
			System.out.println(LongFoster.get(32) + "\n" + LongFoster.get(33));
			System.out.println(LongFoster.get(41) + "\n" + LongFoster.get(42));
		}
		if(super.getDecision().equalsIgnoreCase("6") && super.getJurisdiction().equalsIgnoreCase("1")) {
			System.out.println(LongFoster.get(0));
			System.out.println(LongFoster.get(11) + "\n" + LongFoster.get(12));
			System.out.println(LongFoster.get(14) + "\n" + LongFoster.get(15));
			System.out.println(LongFoster.get(35) + "\n" + LongFoster.get(36));
			System.out.println(LongFoster.get(47) + "\n" + LongFoster.get(48));
			System.out.println(LongFoster.get(50) + "\n" + LongFoster.get(51));
			System.out.println(LongFoster.get(56) + "\n" + LongFoster.get(57));
			System.out.println(LongFoster.get(59) + "\n" + LongFoster.get(60));
		}
		if(super.getDecision().equalsIgnoreCase("6") && super.getJurisdiction().equalsIgnoreCase("2")) {
			System.out.println(LongFoster.get(0));
			System.out.println(LongFoster.get(29) + "\n" + LongFoster.get(30));
			System.out.println(LongFoster.get(38) + "\n" + LongFoster.get(39));
			System.out.println(LongFoster.get(44) + "\n" + LongFoster.get(45));
		}
		if(super.getDecision().equalsIgnoreCase("6") && super.getJurisdiction().equalsIgnoreCase("3")) {
			System.out.println(LongFoster.get(0));
			System.out.println(LongFoster.get(17) + "\n" + LongFoster.get(18));
			System.out.println(LongFoster.get(20) + "\n" + LongFoster.get(21));
			System.out.println(LongFoster.get(53) + "\n" + LongFoster.get(54));
		}
		if(super.getDecision().equalsIgnoreCase("6") && super.getJurisdiction().equalsIgnoreCase("4")) {
			System.out.println(LongFoster.get(0));
			System.out.println(LongFoster.get(2) + "\n" + LongFoster.get(3));
			System.out.println(LongFoster.get(5) + "\n" + LongFoster.get(6));
		}
		// Start Loop for Commute
		if(super.getDecision().equalsIgnoreCase("7") && super.getCommute().equalsIgnoreCase("0")) {
			System.out.println(LongFoster.get(0));
			System.out.println(LongFoster.get(20) + "\n" + LongFoster.get(21));
			System.out.println(LongFoster.get(41) + "\n" + LongFoster.get(42));
			System.out.println(LongFoster.get(59) + "\n" + LongFoster.get(60));
		}
		if(super.getDecision().equalsIgnoreCase("7") && super.getCommute().equalsIgnoreCase("1")) {
			System.out.println(LongFoster.get(0));
			System.out.println(LongFoster.get(2) + "\n" + LongFoster.get(3));
			System.out.println(LongFoster.get(8) + "\n" + LongFoster.get(9));
			System.out.println(LongFoster.get(23) + "\n" + LongFoster.get(24));
			System.out.println(LongFoster.get(32) + "\n" + LongFoster.get(33));
			System.out.println(LongFoster.get(35) + "\n" + LongFoster.get(36));
			System.out.println(LongFoster.get(38) + "\n" + LongFoster.get(39));
			System.out.println(LongFoster.get(44) + "\n" + LongFoster.get(45));
			System.out.println(LongFoster.get(53) + "\n" + LongFoster.get(54));
		}
		if(super.getDecision().equalsIgnoreCase("7") && super.getCommute().equalsIgnoreCase("2")) {
			System.out.println(LongFoster.get(0));
			System.out.println(LongFoster.get(5) + "\n" + LongFoster.get(6));
			System.out.println(LongFoster.get(11) + "\n" + LongFoster.get(12));
			System.out.println(LongFoster.get(14) + "\n" + LongFoster.get(15));
			System.out.println(LongFoster.get(17) + "\n" + LongFoster.get(18));
			System.out.println(LongFoster.get(26) + "\n" + LongFoster.get(27));
			System.out.println(LongFoster.get(47) + "\n" + LongFoster.get(48));
			System.out.println(LongFoster.get(50) + "\n" + LongFoster.get(51));
			System.out.println(LongFoster.get(56) + "\n" + LongFoster.get(57));
		}
		
		
		
		
	}
	
	public void McEnearneyListings() {
		readMcEnearney();
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("0")) {
			System.out.println(McEnearney.get(0));
			System.out.println(McEnearney.get(44) + "\n" + McEnearney.get(45));
		}
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("1")) {
			System.out.println(McEnearney.get(0));
			System.out.println(McEnearney.get(2) + "\n" + McEnearney.get(3));
			System.out.println(McEnearney.get(17) + "\n" + McEnearney.get(18));
			System.out.println(McEnearney.get(32) + "\n" + McEnearney.get(33));
		}
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("2")) {
			System.out.println(McEnearney.get(0));
			System.out.println(McEnearney.get(8) + "\n" + McEnearney.get(9));
			System.out.println(McEnearney.get(23) + "\n" + McEnearney.get(24));
			System.out.println(McEnearney.get(41) + "\n" + McEnearney.get(42));
			System.out.println(McEnearney.get(50) + "\n" + McEnearney.get(51));
			System.out.println(McEnearney.get(56) + "\n" + McEnearney.get(57));
		}
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("3")) {
			System.out.println(McEnearney.get(0));
			System.out.println(McEnearney.get(26) + "\n" + McEnearney.get(27));
			System.out.println(McEnearney.get(38) + "\n" + McEnearney.get(39));
		}
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("4")) {
			System.out.println(McEnearney.get(0));
			System.out.println(McEnearney.get(11) + "\n" + McEnearney.get(12));
			System.out.println(McEnearney.get(47) + "\n" + McEnearney.get(48));
		}
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("5")) {
			System.out.println(McEnearney.get(0));
			System.out.println(McEnearney.get(14) + "\n" + McEnearney.get(15));
			System.out.println(McEnearney.get(20) + "\n" + McEnearney.get(21));
			System.out.println(McEnearney.get(29) + "\n" + McEnearney.get(30));
			System.out.println(McEnearney.get(59) + "\n" + McEnearney.get(60));
		}
		if(super.getDecision().equalsIgnoreCase("0") && super.getChoice().contains("6")) {
			System.out.println(McEnearney.get(0));
			System.out.println(McEnearney.get(5) + "\n" + McEnearney.get(6));
			System.out.println(McEnearney.get(35) + McEnearney.get(36));
			System.out.println(McEnearney.get(53) + "\n" + McEnearney.get(54));
		}
		//Start loop for bedrooms 
		if(super.getDecision().equalsIgnoreCase("1") && super.getBeds().equalsIgnoreCase("0")) {
			System.out.println(McEnearney.get(0));
			System.out.println(McEnearney.get(5) + "\n" + McEnearney.get(6));
			System.out.println(McEnearney.get(29) + "\n" + McEnearney.get(30));
			System.out.println(McEnearney.get(35) + "\n" + McEnearney.get(36));
			System.out.println(McEnearney.get(44) + "\n" + McEnearney.get(45));
			System.out.println(McEnearney.get(53) + "\n" + McEnearney.get(54));
			
		}
		if(super.getDecision().equalsIgnoreCase("1") && super.getBeds().equalsIgnoreCase("1")) {
			System.out.println(McEnearney.get(0));
			System.out.println(McEnearney.get(2) + "\n" + McEnearney.get(3));
			System.out.println(McEnearney.get(8) + "\n" + McEnearney.get(9));
			System.out.println(McEnearney.get(11) + "\n" + McEnearney.get(12));
			System.out.println(McEnearney.get(14) + "\n" + McEnearney.get(15));
			System.out.println(McEnearney.get(17) + "\n" + McEnearney.get(18));
			System.out.println(McEnearney.get(20) + "\n" + McEnearney.get(21));
			System.out.println(McEnearney.get(26) + "\n" + McEnearney.get(27));
			System.out.println(McEnearney.get(32) + "\n" + McEnearney.get(33));
			System.out.println(McEnearney.get(38) + "\n" + McEnearney.get(39));
			System.out.println(McEnearney.get(41) + "\n" + McEnearney.get(42));
			System.out.println(McEnearney.get(47) + "\n" + McEnearney.get(48));
			System.out.println(McEnearney.get(50) + "\n" + McEnearney.get(51));
			System.out.println(McEnearney.get(59) + "\n" + McEnearney.get(60));
		}
		//Start loop for bathrooms
		if(super.getDecision().equalsIgnoreCase("2") && super.getBath().equalsIgnoreCase("0")) {
			System.out.println(McEnearney.get(2) + "\n" + McEnearney.get(3));
			System.out.println(McEnearney.get(5) + "\n" + McEnearney.get(6));
			System.out.println(McEnearney.get(8) + "\n" + McEnearney.get(9));
			System.out.println(McEnearney.get(11) + "\n" + McEnearney.get(12));
			System.out.println(McEnearney.get(14) + "\n" + McEnearney.get(15));
			System.out.println(McEnearney.get(17) + "\n" + McEnearney.get(18));
			System.out.println(McEnearney.get(23) + "\n" + McEnearney.get(24));
			System.out.println(McEnearney.get(26) + "\n" + McEnearney.get(27));
			System.out.println(McEnearney.get(29) + "\n" + McEnearney.get(30));
			System.out.println(McEnearney.get(32) + "\n" + McEnearney.get(33));
			System.out.println(McEnearney.get(35) + "\n" + McEnearney.get(36));
			System.out.println(McEnearney.get(38) + "\n" + McEnearney.get(39));
			System.out.println(McEnearney.get(41) + "\n" + McEnearney.get(42));
			System.out.println(McEnearney.get(44) + "\n" + McEnearney.get(45));
			System.out.println(McEnearney.get(47) + "\n" + McEnearney.get(48));
			System.out.println(McEnearney.get(50) + "\n" + McEnearney.get(51));
			System.out.println(McEnearney.get(56) + "\n" + McEnearney.get(57));
			System.out.println(McEnearney.get(59) + "\n" + McEnearney.get(60));
		}
		if(super.getDecision().equalsIgnoreCase("2") && super.getBath().equalsIgnoreCase("1")) {
			System.out.println(McEnearney.get(0));
			System.out.println(McEnearney.get(20) + "\n" + McEnearney.get(21));
			System.out.println(McEnearney.get(53) + "\n" + McEnearney.get(54));
		}
		//Start loop for age
		if(super.getDecision().equalsIgnoreCase("4") && super.getAge().equalsIgnoreCase("0")) {
			System.out.println(McEnearney.get(0));
			System.out.println(McEnearney.get(47) + "\n" + McEnearney.get(48));
		}
		if(super.getDecision().equalsIgnoreCase("4") && super.getAge().equalsIgnoreCase("1")) {
			System.out.println(McEnearney.get(0));
			System.out.println(McEnearney.get(2) + "\n" + McEnearney.get(3));
			System.out.println(McEnearney.get(5) + "\n" + McEnearney.get(6));
			System.out.println(McEnearney.get(8) + "\n" + McEnearney.get(9));
			System.out.println(McEnearney.get(11) + "\n" + McEnearney.get(12));
			System.out.println(McEnearney.get(14) + "\n" + McEnearney.get(15));
			System.out.println(McEnearney.get(17) + "\n" + McEnearney.get(18));
			System.out.println(McEnearney.get(20) + "\n" + McEnearney.get(21));
			System.out.println(McEnearney.get(23) + "\n" + McEnearney.get(24));
			System.out.println(McEnearney.get(26) + "\n" + McEnearney.get(27));
			System.out.println(McEnearney.get(29) + "\n" + McEnearney.get(30));
			System.out.println(McEnearney.get(32) + "\n" + McEnearney.get(33));
			System.out.println(McEnearney.get(35) + "\n" + McEnearney.get(36));
			System.out.println(McEnearney.get(38) + "\n" + McEnearney.get(39));
			System.out.println(McEnearney.get(41) + "\n" + McEnearney.get(42));
			System.out.println(McEnearney.get(44) + "\n" + McEnearney.get(45));
			System.out.println(McEnearney.get(50) + "\n" + McEnearney.get(51));
			System.out.println(McEnearney.get(53) + "\n" + McEnearney.get(54));
			System.out.println(McEnearney.get(56) + "\n" + McEnearney.get(57));
			System.out.println(McEnearney.get(59) + "\n" + McEnearney.get(60));
		}
		if(super.getDecision().equalsIgnoreCase("5") && super.getPrice().equalsIgnoreCase("0")) {
			System.out.println(McEnearney.get(0));
			System.out.println(McEnearney.get(2) + "\n" + McEnearney.get(3));
			System.out.println(McEnearney.get(5) + "\n" + McEnearney.get(6));
			System.out.println(McEnearney.get(8) + "\n" + McEnearney.get(9));
			System.out.println(McEnearney.get(11) + "\n" + McEnearney.get(12));
			System.out.println(McEnearney.get(14) + "\n" + McEnearney.get(15));
			System.out.println(McEnearney.get(17) + "\n" + McEnearney.get(18));
			System.out.println(McEnearney.get(20) + "\n" + McEnearney.get(21));
			System.out.println(McEnearney.get(23) + "\n" + McEnearney.get(24));
			System.out.println(McEnearney.get(26) + "\n" + McEnearney.get(27));
			System.out.println(McEnearney.get(29) + "\n" + McEnearney.get(30));
			System.out.println(McEnearney.get(32) + "\n" + McEnearney.get(33));
			System.out.println(McEnearney.get(35) + "\n" + McEnearney.get(36));
			System.out.println(McEnearney.get(38) + "\n" + McEnearney.get(39));
			System.out.println(McEnearney.get(41) + "\n" + McEnearney.get(42));
			System.out.println(McEnearney.get(44) + "\n" + McEnearney.get(45));
			System.out.println(McEnearney.get(50) + "\n" + McEnearney.get(51));
			System.out.println(McEnearney.get(53) + "\n" + McEnearney.get(54));
			System.out.println(McEnearney.get(56) + "\n" + McEnearney.get(57));
			System.out.println(McEnearney.get(59) + "\n" + McEnearney.get(60));
			System.out.println(McEnearney.get(47) + "\n" + McEnearney.get(48));
		}
		//Start loop for Jurisdiction
		if(super.getDecision().equalsIgnoreCase("6") && super.getJurisdiction().equalsIgnoreCase("2")) {
			System.out.println(McEnearney.get(0));
			System.out.println(McEnearney.get(5) + "\n" + McEnearney.get(6));
			System.out.println(McEnearney.get(50) + "\n" + McEnearney.get(51));
			System.out.println(McEnearney.get(56) + "\n" + McEnearney.get(57));
			System.out.println(McEnearney.get(59) + "\n" + McEnearney.get(60));
		}
		if(super.getDecision().equalsIgnoreCase("6") && super.getJurisdiction().equalsIgnoreCase("0")) {
			System.out.println(McEnearney.get(0));
			System.out.println(McEnearney.get(11) + "\n" + McEnearney.get(12));
			System.out.println(McEnearney.get(17) + "\n" + McEnearney.get(18));
			System.out.println(McEnearney.get(23) + McEnearney.get(24));
			System.out.println(McEnearney.get(32) + "\n" + McEnearney.get(33));
			System.out.println(McEnearney.get(53) + "\n" + McEnearney.get(54));
		}
		if(super.getDecision().equalsIgnoreCase("6") && super.getJurisdiction().equalsIgnoreCase("1")) {
			System.out.println(McEnearney.get(0));
			System.out.println(McEnearney.get(2) + "\n" + McEnearney.get(3));
			System.out.println(McEnearney.get(8) + "\n" + McEnearney.get(9));
			System.out.println(McEnearney.get(20) + "\n" + McEnearney.get(21));
			System.out.println(McEnearney.get(26) + "\n" + McEnearney.get(27));
			System.out.println(McEnearney.get(29) + "\n" + McEnearney.get(30));
			System.out.println(McEnearney.get(38) + "\n" + McEnearney.get(39));
		}
		if(super.getDecision().equalsIgnoreCase("6") && super.getJurisdiction().equalsIgnoreCase("3")) {
			System.out.println(McEnearney.get(0));
			System.out.println(McEnearney.get(35) + "\n" + McEnearney.get(36));
			System.out.println(McEnearney.get(41) + "\n" + McEnearney.get(42));
			System.out.println(McEnearney.get(44) + "\n" + McEnearney.get(45));
		}
		if(super.getDecision().equalsIgnoreCase("6") && super.getJurisdiction().equalsIgnoreCase("4")) {
			System.out.println(McEnearney.get(0));
			System.out.println(McEnearney.get(14) + "\n" + McEnearney.get(15));
		}
		//Start Loop for Commute
		if(super.getDecision().equalsIgnoreCase("7") && super.getCommute().equalsIgnoreCase("0")) {
			System.out.println(McEnearney.get(0));
			System.out.println(McEnearney.get(20) + "\n" + McEnearney.get(21));
			System.out.println(McEnearney.get(53) + "\n" + McEnearney.get(54));
			System.out.println(McEnearney.get(59) + "\n" + McEnearney.get(60));
		}
		if(super.getDecision().equalsIgnoreCase("7") && super.getCommute().equalsIgnoreCase("1")) {
			System.out.println(McEnearney.get(0));
			System.out.println(McEnearney.get(2) + "\n" + McEnearney.get(3));
			System.out.println(McEnearney.get(8) + "\n" + McEnearney.get(9));
			System.out.println(McEnearney.get(14) + "\n" + McEnearney.get(15));
			System.out.println(McEnearney.get(23) + "\n" + McEnearney.get(24));
			System.out.println(McEnearney.get(29) + "\n" + McEnearney.get(30));
			System.out.println(McEnearney.get(32) + "\n" + McEnearney.get(33));
			System.out.println(McEnearney.get(35) + "\n" + McEnearney.get(36));
			System.out.println(McEnearney.get(38) + "\n" + McEnearney.get(39));
			System.out.println(McEnearney.get(44) + "\n" + McEnearney.get(45));
			System.out.println(McEnearney.get(56) + "\n" + McEnearney.get(57));
		}
		if(super.getDecision().equalsIgnoreCase("7") && super.getCommute().equalsIgnoreCase("2")) {
			System.out.println(McEnearney.get(0));
			System.out.println(McEnearney.get(5) + "\n" + McEnearney.get(6));
			System.out.println(McEnearney.get(11) + "\n" + McEnearney.get(12));
			System.out.println(McEnearney.get(17) + "\n" + McEnearney.get(18));
			System.out.println(McEnearney.get(26) + "\n" + McEnearney.get(27));
			System.out.println(McEnearney.get(41) + "\n" + McEnearney.get(42));
			System.out.println(McEnearney.get(47) + "\n" + McEnearney.get(48));
			System.out.println(McEnearney.get(50) + "\n" + McEnearney.get(51));
		}
		
		
		
	}
	
	
	public void createFile(String in) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(in);
			
		}
		
		catch(Exception e) {
			System.out.println("File could not be created");
		}
		
	}
	
	
	public void readFile(String in) {
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new File(in));
		}
		catch(Exception e) {
			System.out.println("File not found");
		}
		
		while(inputStream.hasNextLine()) {
			String line = inputStream.nextLine();
			System.out.println(line);
			
		}
		inputStream.close();
	}
	//////////**********////*** This code below is testing with array list


	public void readCentury21() {
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new File(century21));
		}
		
		catch(Exception e) {
			System.out.println("File not found");
		}
		
		String line;
		while(inputStream.hasNextLine()) {
			line = inputStream.nextLine();
			Century21.add(line);
		}
		inputStream.close();	
		
	}
	
	public void printCentury21() {
		for(int x = 0; x < Century21.size(); x++) {
			System.out.println("Line Number" + x + ":"+ Century21.get(x));
		}
		
	}
	
	public void readRemax() {
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new File(remax));
		}
		catch(Exception e) {
			System.out.println("File not found: ");
		}
		
		String line;
		while(inputStream.hasNextLine()) {
			line = inputStream.nextLine();
			Remax.add(line);
		}
		inputStream.close();
		
	}
	
	public void printRemax() {
		for(int x = 0; x < Remax.size(); x++) {
			System.out.println("Line Number" + x + ":"+ Remax.get(x));
		}
	}
	
	public void readLongFoster() {
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new File(Long_Foster));
		}
		catch(Exception e) {
			System.out.println("File not found:");
		}
		String line;
		while(inputStream.hasNextLine()) {
			line = inputStream.nextLine();
			LongFoster.add(line);
		}
		inputStream.close();
		
	}
	
	public void printLongFoster() {
		for(int x = 0; x < LongFoster.size(); x++) {
			System.out.println("Line Number" + x + ":"+ LongFoster.get(x));
		}
	}
	
	public void readMcEnearney() {
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new File(mcEnearney));
		}
		catch(Exception e) {
			System.out.println("File not found: ");
		}
		String boston;
		while(inputStream.hasNextLine()) {
			boston = inputStream.nextLine();
			McEnearney.add(boston);
		}
		inputStream.close();
		
	}
	
	public void printMcEnearney() {
		int x;
		for(x = 0; x < McEnearney.size(); x++) {
			System.out.println("Line Number" + x + ":"+ McEnearney.get(x));
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
