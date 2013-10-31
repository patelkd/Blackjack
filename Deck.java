public class Deck {

	public static final int card = 52;
	public static int[] stack;

	public Deck(int cards) {
		stack = new int[52];

    }

	public static void main(String[] args) {
		for (int i=0; i<51; i++) {
			System.out.println(card);
		}
	}
		

		// for (int suit = 0; rank<=Card.SPADE; suit++) {
		// 	for (int rank=1; rank<=13; rank++) {
		// 		deck[i++] = new Card(suit, rank);
		// 		System.out.println(rank + "of" + suit);
		// 	}
		// }


}