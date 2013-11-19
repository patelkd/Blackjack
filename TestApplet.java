import java.awt.*;
import java.applet.*;

public class TestApplet extends Applet {

        private Deck test;

        public void init() {
                this.test = new Deck();
        }

        public void actionPerformed (ActionEvent ae) {

        }




        public void paint(Graphics g) {
        	super.paint(g);
            test.draw(g);
            
        }




}
