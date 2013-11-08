import java.util.Random;
import java.awt.*;
import java.applet.*;

public class Deck {

    private Card[] deck = new Card[52];
    private String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private int value;



    public Deck () {
        int counter = 0;
        String name;
        for (int i=0; i<4; i++) {
            for (int j=0; j<13; j++) {
                name = ranks[j] + suits[i];
                if (j>0 && j<9) {
                    value = j;
                } else if (j>=9) {
                    value = 10;
                } else {
                    value = 11;
                }
                this.deck[counter] = new Card(name, value);
                counter++;
            }
        }

        // for (int i = 0; i < deck.length; i++) {
        //   deck[i] = i;
        // }
    }


    public void shuffle () {
        //shuffle
        for (int i = 0; i < this.deck.length; i++) {
          int index = (int)(Math.random() * this.deck.length);
          Card temp = deck[i];
          deck[i] = deck[index];
          deck[index] = temp;
        }
    }
    
    public void print () {
        //display cards
        for (int i = 0; i < 52; i++) {
          System.out.println(this.deck[i].name());
        }
    }

    public void draw (Graphics g) {
        int count = 0;
        for (int i=0; i<52; i++) {
            this.deck[i].draw(g, new Rectangle(60+(60*i),60, 20, 30));
            count++;
        }
    }

      
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        deck.print();

    }

   


}
