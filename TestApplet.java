import java.awt.*;
import java.applet.*;

public class TestApplet extends Applet {

        private Card card;

        public void init() {
                card = new Card("Deck", 10);
        }

        public void paint(Graphics g) {
                card.draw(g, new Rectangle(50, 50, 200, 300));
        }

}
