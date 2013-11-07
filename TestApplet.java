import java.awt.*;
import java.applet.*;

public class TestApplet extends Applet {

	private MoviePoster poster;

	public void init() {
		poster = new MoviePoster("Jurassic Park");
	}

	public void paint(Graphics g) {
		poster.draw(g, new Rectangle(50, 50, 200, 300));
	}

}
