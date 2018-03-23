import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MASHGame {

	public static void main(String[] args) {

		/* Define list of options */
		ArrayList<String> homeList = new ArrayList<String>();
		ArrayList<String> femaleSpouseList = new ArrayList<String>();
		ArrayList<String> maleSpouseList = new ArrayList<String>();
		ArrayList<String> occupationList = new ArrayList<String>();
		ArrayList<String> transportationList = new ArrayList<String>();
		ArrayList<String> hometownList = new ArrayList<String>();
		
		
		ArrayList<ArrayList<String>> database = new ArrayList<ArrayList<String>>();
		database.add(homeList);
		database.add(femaleSpouseList);
		database.add(maleSpouseList);
		database.add(occupationList);
		database.add(transportationList);
		database.add(hometownList);
		

		

		/* Add items to home list */
		homeList.add("mansion");
		homeList.add("apartment");
		homeList.add("shack");
		homeList.add("house");

		/* Add items to femaleSpouseList */
		femaleSpouseList.add("Robin");
		femaleSpouseList.add("Lily");
		femaleSpouseList.add("Nora");
		femaleSpouseList.add("Patrice");
		femaleSpouseList.add("Zoey");
		femaleSpouseList.add("Quinn");

		/* Add items to maleSpouseList */
		maleSpouseList.add("Ted");
		maleSpouseList.add("Marshall");
		maleSpouseList.add("Barney");
		maleSpouseList.add("Ranjit");
		maleSpouseList.add("Carl");
		maleSpouseList.add("Linux");

		/* Add items to occupationList */
		occupationList.add("teacher");
		occupationList.add("architect");
		occupationList.add("lawyer");
		occupationList.add("newscaster");
		occupationList.add("undercover agent");

		/* Add items to transportationList */
		transportationList.add("walk");
		transportationList.add("ride the train");
		transportationList.add("ride a bus");
		transportationList.add("fly an airplane");
		transportationList.add("carpool");

		/* Add items to hometownList */
		hometownList.add("Cleveland");
		hometownList.add("Queens");
		hometownList.add("The Bronx");
		hometownList.add("Brooklyn");
		hometownList.add("Manhattan");
		hometownList.add("Staten Island");
		
		
		/* Print the database */
		System.out.println("--------------------------Future Database---------------------------");
		for (ArrayList<String> item: database) {
			System.out.println(item);
		}
		System.out.println("--------------------------------------------------------------------");
		System.out.println("\n\n");

		/* Ask the player for their name */
		Scanner kbd = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = kbd.nextLine();
		kbd.close();
		System.out.println("\n\n");
		/* Randomly choose items from each List */
		Random rand = new Random();
		String firstHome = homeList.get(rand.nextInt(homeList.size()));	
		String secondHome = homeList.get(rand.nextInt(homeList.size()));
		String occupation = occupationList.get(rand.nextInt(occupationList.size()));
		String transportation = transportationList.get(rand.nextInt(transportationList.size()));
		String hometown = hometownList.get(rand.nextInt(hometownList.size()));

		boolean coin = rand.nextBoolean();
		String spouse;
		if (coin) {
			spouse = femaleSpouseList.get(rand.nextInt(femaleSpouseList.size()));

		} else {
			spouse = maleSpouseList.get(rand.nextInt(maleSpouseList.size()));
		}

		int yearsOfMarriage = rand.nextInt(30);



		/* Write your future using String concatenation */
		String output = "Welcome ";
		
		output += name + ", this is your future... \n";
		output += "You will marry " + spouse + " and live in a " + firstHome + ". \n";
		output += "After " + yearsOfMarriage + " years of marriage, you will finally get your dream job of being a " + occupation + ". \n";
		output += "Your family will move to a " + secondHome + " in " + hometown + " where you will " + transportation + " to work each day. \n";

		System.out.println(output);










	}

}
