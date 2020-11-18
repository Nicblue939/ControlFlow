package controlpackage;
import java.util.*;

public class controlclass {

	public static void main(String[] args) {
lottery();
	}


	public static void lottery() {
	    System.out.println("Hello World!");
		System.out.println("What is your name?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Hello " + name);
		System.out.println("Would you like to continue?");
		String response = scanner.next();
		if (response.equals("yes") || response.equals("y")) {
			System.out.println("Do yo have a red car?");
			String carresponse = scanner.next();
			
			System.out.println("What is the name of your favorite pet?");
			String petname = scanner.next();
			
			System.out.println("What is the age of your pet?");
			int petage = scanner.nextInt();
			
			System.out.println("What is your lucky number?");
			int luckynumber = scanner.nextInt();
			int quarterbacknumber = 0;
			System.out.println("Do you have a favorite qaurterback?");
			String quarterbackresponse = scanner.next();
			if (response.equals("yes") || response.equals("y")) {
				System.out.println("What is the quarterback's number?");
				quarterbacknumber = scanner.nextInt();
			}
			
			System.out.println("What is the two digit model year of your car?");
			int modelnumber = scanner.nextInt();
			
			System.out.println("What is the first name of your favorite actor?");
			String actorname = scanner.next();
			
			System.out.println("Enter a random number 1-50.");
			int randomnumber = scanner.nextInt();
			
			int magicball = luckynumber * randomnumber;
			if (magicball > 75) {
				magicball = magicball-75;
				}
			int lottery1 = modelnumber + luckynumber;
			if (lottery1 > 75) {
				lottery1 = lottery1-75;
				}
			int lottery2 = 42;
			int lottery3 = petage + modelnumber;
			if (lottery3 > 75) {
				lottery3 = lottery3-75;
				}
			int lottery4 = quarterbacknumber + petage + luckynumber;
			if (lottery4 > 75) {
				lottery4 = lottery4-75;
				}
			int lottery5 = (int)((Math.random() * ((50-1)+1)) +1) -randomnumber;
			if (lottery5 > 75) {
				lottery5 = lottery5-75;
				}
			System.out.println("Lotttery numbers: " + lottery1 + ", " + lottery2 +", " + lottery3 +", " + lottery4 + ", "  + lottery5 + " Magicball: "+ magicball  );
					} else {
						System.out.println("Thank You!");
			System.exit(0);
		}
		System.out.println("Do you want to play again?");
		String response2 = scanner.next();
		if (response2.equals("yes") || response2.equals("y")) {
			lottery();
		}else {
			System.out.println("Thank You!");
			System.exit(0);
		}
	}
	public static void printNumbers()
{
		//
		}
	
	public static void printLowerCase()
{
		//
		}
	
	public static void printUpperCase() 
{
		//
		}
}

 