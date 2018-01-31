package h2;

import java.awt.*;
import java.applet.*;

public class MijnEersteApplet extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Kevin Buitenhuis", 50, 60 );
    }
}