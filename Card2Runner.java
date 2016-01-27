import java.util.Scanner;
/**
 * This is a class that tests the Deck class.
 */
public class Card2Runner{

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String[] suitList;
		String[] rankList;
		int[] pointList;
		
		System.out.println("Welcome to the deck builder.");
		System.out.println("Please input the amount of suits your cards will have.(Like diamond or spades)");
		int suitSize = scnr.nextInt();
		suitList = new String[suitSize];
		System.out.println("Please input the amount of ranks your cards will have.(Like King or Ace)");
		int rankSize = scnr.nextInt();
		rankList = new String[rankSize];
		System.out.println("Please input the amount of values of your cards in your desired order.");
		int pointSize = scnr.nextInt();
		pointList = new int[pointSize];
		
		System.out.println("Input the name of your card suits please.(In order pls :^) )");
		for(int i = 0; i < suitSize-1; i++){
			if(i > 0){
				suitList[i] = scnr.next();
			}
			else{
				System.out.println("Another one...");
				suitList[i] = scnr.next();
			}
		}
		System.out.println("Input the name of your card ranks please.(In order pls :^) )");
		for(int j = 0; j < rankSize-1; j++){
			if(j > 0){
				
			}
		}
	}
}
