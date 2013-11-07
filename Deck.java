public class Deck {
	
 public static void main(String[] args) {
    int[] deck = new int[52];
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    // Initialize cards
    for (int i = 0; i < deck.length; i++) {
      deck[i] = i;
    }

    // Shuffle the cards
    for (int i = 0; i < deck.length; i++) {
      int index = (int)(Math.random() * deck.length);
      int temp = deck[i];
      deck[i] = deck[index];
      deck[index] = temp;
    }

    // Display the all the cards
    for (int i = 0; i < 52; i++) {
      String suit = suits[deck[i] / 13];
      String rank = ranks[deck[i] % 13];
      System.out.println( rank + " of " + suit);
    }
  }



    //private String suit;
    //private int value;
    //private int value2
    //private int[] deck;

    //public Deck(String suit, int value) {
    //    for (int i=0; i<13; i++) {
    //        int x = i
    //        }
    //        Card card = new Card ("Diamonds", i);
            
    //    }
    //}





// public class Deck {

// 	public static final int card = 52;
// 	public static int[] stack;

// 	public Deck(int cards) {
// 		stack = new int[52];

//     }

// 	public static void main(String[] args) {
// 		for (int i=0; i<51; i++) {
// 			System.out.println(card);
// 		}
// 	}
		

// 		// for (int suit = 0; rank<=Card.SPADE; suit++) {
// 		// 	for (int rank=1; rank<=13; rank++) {
// 		// 		deck[i++] = new Card(suit, rank);
// 		// 		System.out.println(rank + "of" + suit);
// 		// 	}
// 		// }


// }
