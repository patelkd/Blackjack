public class Card {

	private int number;
	private String suit;
	private int spades = 0;
	private int hearts = 1;
	private	int clubs = 2;
	private	int diamonds = 3;

	public Card(String suit) {
		int spades = 0;
		int hearts = 1;
		int clubs = 2;
		int diamonds = 3;

	}

	public Card(int number) {
		int jack;
		int queen;
		int king;
	}

	public int printCard(String suit, int number) {
		for (int i =0; i<=diamonds; i++) {
			for (int j=0; j>10; j++) {
				System.out.println(number + "of" + suit);
			}
		}
	}

	public static void main(String[] args) {
		printCard("spades", 4);
	}

	// public Card(String suit, int number) {

	// 	Card spades2 = new Card ("Spades", 2);
	// 	System.out.println(suit + number);
	// 	Card hearts2 = new Card ("Hearts", 2);
	// 	Card clubs2 = new Card ("Clubs", 2);
	// 	Card diamonds2 = new Card ("Diamonds", 2);
		
	// 	Card spades3 = new Card ("Spades", 3);
	// 	Card hearts3 = new Card ("Hearts", 3);
	// 	Card clubs3 = new Card ("Clubs", 3);
	// 	Card diamonds3 = new Card ("Diamonds", 3);
		
	// 	Card spades4 = new Card ("Spades", 4);
	// 	Card hearts4 = new Card ("Hearts", 4);
	// 	Card clubs4 = new Card ("Clubs", 4);
	// 	Card diamonds4 = new Card ("Diamonds", 4);
		
	// 	Card spades5 = new Card ("Spades", 5);
	// 	Card hearts5 = new Card ("Hearts", 5);
	// 	Card clubs5 = new Card ("Clubs", 5);
	// 	Card diamonds5 = new Card ("Diamonds", 5);
		
	// 	Card spades6 = new Card ("Spades", 6);
	// 	Card hearts6 = new Card ("Hearts", 6);
	// 	Card clubs6 = new Card ("Clubs", 6);
	// 	Card diamonds6 = new Card ("Diamonds", 6);
		
	// 	Card spades7 = new Card ("Spades", 7);
	// 	Card hearts7 = new Card ("Hearts", 7);
	// 	Card clubs7 = new Card ("Clubs", 7);
	// 	Card diamonds7 = new Card ("Diamonds", 7);
		
	// 	Card spades8 = new Card ("Spades", 8);
	// 	Card hearts8 = new Card ("Hearts", 8);
	// 	Card clubs8 = new Card ("Clubs", 8);
	// 	Card diamonds8 = new Card ("Diamonds", 8);	
		
	// 	Card spades9 = new Card ("Spades", 9);
	// 	Card hearts9 = new Card ("Hearts", 9);
	// 	Card clubs9 = new Card ("Clubs", 9);
	// 	Card diamonds9 = new Card ("Diamonds", 9);

	// 	Card spades10 = new Card ("Spades", 10);
	// 	Card hearts10 = new Card ("Hearts", 10);
	// 	Card clubs10 = new Card ("Clubs", 10);
	// 	Card diamonds10 = new Card ("Diamonds", 10);
		
	// 	Card spadesJack = new Card ("Spades", 10);
	// 	Card heartsJack = new Card ("Hearts", 10);
	// 	Card clubsJack = new Card ("Clubs", 10);
	// 	Card diamondsJack = new Card ("Diamonds", 10);
		
	// 	Card spadesQueen = new Card ("Spades", 10);
	// 	Card heartsQueen = new Card ("Hearts", 10);
	// 	Card clubsQueen = new Card ("Clubs", 10);
	// 	Card diamondsQueen = new Card ("Diamonds", 10);
		
	// 	Card spadesKing = new Card ("Spades", 10);
	// 	Card heartsKing = new Card ("Hearts", 10);
	// 	Card clubsKing = new Card ("Clubs", 10);
	// 	Card diamondsKing = new Card ("Diamonds", 10);
		
	// 	Card spadesAce = new Card ("Spades", 11);
	// 	Card heartsAce = new Card ("Hearts", 11);
	// 	Card clubsAce = new Card ("Clubs", 11);
	// 	Card diamondsAce = new Card ("Diamonds", 11);



	// }

  }